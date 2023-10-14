package lab2_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearchAlgo implements ISearchAlgo{

	@Override
	public Node execute(Node root, String goal) {
		// TODO Auto-generated method stub
		boolean check = false;
		Queue<Node> frontier = new LinkedList<>();
	    frontier.add(root);
	    List<Node> explored = new ArrayList<>();//lưu trữ các nút đã được khám phá
	    while(!frontier.isEmpty()) {
	      	Node current = frontier.poll();
	    	if(current.getLabel().equals(goal)) return current;
	    	explored.add(current);
	    	List<Edge> edges = current.getChildren();
	    	for (Edge edge : edges) {
	    		Node node = edge.getEnd();
				if(check==false) {
					node.setPathCost(current.getPathCost()+edge.getWeight());
					if(node.getLabel().equals(goal)) {
                        check=true;
                        break;
					}
				}
			}
	    	List<Node> children = current.getChildrenNodes();
	    	for (Node child : children) {
				if(!frontier.contains(child) && !explored.contains(child)) {
					frontier.add(child);
					child.setParent(current);
				}
			}
	    }                                                                          
		return null;
	}

	@Override
	public Node execute(Node root, String start, String goal) {
		boolean check = false;
		boolean started = false;//gap nut bat dau started=true
		Queue<Node> frontier = new LinkedList<>();
		frontier.add(root);
		List<Node> explored = new ArrayList<>();
		while(!frontier.isEmpty()) {
			Node current=frontier.poll();
			if(current.getLabel().equals(start)) {
				started=true;
				frontier.clear();
				explored.clear();
				current.setParent(null);
			}
			if(current.getLabel().equals(goal) && started==true) return current;
			explored.add(current);
			List<Edge> path = current.getChildren();
			for (Edge edge : path) {
				Node node = edge.getEnd();
				if(check==false && started==true) {
					node.setPathCost(edge.getBegin().getPathCost()+edge.getWeight());
					if(node.getLabel().equals(goal)) {
						check=true;
						break;
					}
				}
			}
			List<Node> children = current.getChildrenNodes();
			for (Node child : children) {
				if(!frontier.contains(child) && !explored.contains(child)) {
					frontier.add(child);
					child.setParent(current);
				}
			}
		}
        return null;
	}


	// TreeSearch
	@Override
	public Node execute_TreeSearch(Node tree, String goal) {
		boolean check = false;
		Queue<Node> fontier = new LinkedList<>();
		fontier.add(tree);
		while (!fontier.isEmpty()) {
			Node current = fontier.poll();
			if (current.getLabel().equals(goal))
				return current;
			List<Edge> path = current.getChildren();
			for (Edge e : path) {
				Node endNode = e.getEnd();
				if (check == false) {
					endNode.setPathCost(e.getBegin().getPathCost() + e.getWeight());
					if (endNode.getLabel().equals(goal)) {
						check=true;
						break;
					}
				}
			}
			List<Node> children = current.getChildrenNodes();
	   		ACS_Sort(children);
			for (Node child : children) {
				fontier.add(child);
					if(child.getParent()==null)
					child.setParent(current);
			}
		}
		return null;
	}

	@Override
	public Node execute_TreeSearch(Node tree, String start, String goal) {
		boolean check = false;
		boolean Started = false;
		Queue<Node> fontier = new LinkedList<>();
		fontier.add(tree);
		while (!fontier.isEmpty()) {
			Node current = fontier.poll();
			if (current.getLabel().equals(start)) {
				Started = true;
				fontier.clear();
				current.setParent(null);
			}
			if (current.getLabel().equals(goal) && Started == true)
				return current;
			//
			List<Edge> path = current.getChildren();
			for (Edge e : path) {
				Node endNode = e.getEnd();

				if (check == false && Started == true) {
					endNode.setPathCost(e.getBegin().getPathCost() + e.getWeight());
					if (endNode.getLabel().equals(goal)) {
						check=true;
						break;
					}
				}

			}
			List<Node> children = current.getChildrenNodes();
			ACS_Sort(children);
			for (Node child : children) {
				fontier.add(child);
					if(child.getParent()==null)
					child.setParent(current);
			}

		}

		return null;
	}
	
	public void ACS_Sort(List<Node> children) {
		Collections.sort(children, new Comparator<Node>() {

			@Override
			public int compare(Node o1, Node o2) {
				return o1.getLabel().compareTo(o2.getLabel());
			}
		});
	}

	@Override
	public Node execute(Node nodeS, String start, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
