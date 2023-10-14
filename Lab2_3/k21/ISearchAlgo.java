package lab2_3;

public interface ISearchAlgo {
	public Node execute(Node root, String goal);// find the path from root node to the goal node
	public Node execute(Node root, String start, String goal); // find the path from start node to the goal node
	public Node execute_TreeSearch(Node tree, String goal);
	public Node execute_TreeSearch(Node tree,String start, String goal);
	public Node execute(Node nodeS, String start, int i);

}
