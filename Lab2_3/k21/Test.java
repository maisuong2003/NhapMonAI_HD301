package lab2_3;

public class Test {

	public static void print(Node n) {
		for (String string : NodeUtils.printPath(n)) {
			System.out.print(string + " ");
		}
		System.out.println();
		System.out.print(n);
		System.out.println();

	}

	public static void main(String[] args) {
		
		Node nodeS = new Node("S");
		Node nodeA = new Node("A");
		Node nodeB = new Node("B");
		Node nodeC = new Node("C");
		Node nodeD = new Node("D");
		Node nodeE = new Node("E");
		Node nodeF = new Node("F");
		Node nodeG = new Node("G");
		Node nodeH = new Node("H");
		nodeS.addEdge(nodeA, 5);
		nodeS.addEdge(nodeB, 2);
		nodeS.addEdge(nodeC, 4);
		nodeA.addEdge(nodeD, 9);
		nodeA.addEdge(nodeE, 4);
		
		
		nodeB.addEdge(nodeG, 6);
		nodeC.addEdge(nodeF, 2);
		nodeD.addEdge(nodeH, 7);
		nodeE.addEdge(nodeG, 6);
		nodeF.addEdge(nodeG, 1);
		// BFS graph search S->G
//		BreadthFirstSearchAlgo bg1 = new BreadthFirstSearchAlgo();
//		Node n1 = bg1.execute(nodeS, "G");
//		print(n1);
//		// BFS graph search bat ki->G
//		BreadthFirstSearchAlgo bg2 = new BreadthFirstSearchAlgo();
//		Node n2 = bg2.execute(nodeS, "A", "G");
//		print(n2);
//		// DFS graph search S->G
//		DepthFirstSearchAlgo dg1 = new DepthFirstSearchAlgo();
//		Node n3 = dg1.execute(nodeS, "G");
//		print(n3);
//		// DFS graph search bat ki->G                                                        
//		DepthFirstSearchAlgo dg2 = new DepthFirstSearchAlgo();
//		Node n4 = dg2.execute(nodeS, "A", "G");
//		print(n4);

//		System.out.println("BFS Tree search S->G");
//		BreadthFirstSearchAlgo btr1 = new BreadthFirstSearchAlgo();
//		Node n_btr1 = btr1.execute_TreeSearch(nodeS, "G");
//		print(n_btr1);
//		// BFS Tree search bat ki->G
//		BreadthFirstSearchAlgo btr2 = new BreadthFirstSearchAlgo();
//		Node n_btr2 = btr2.execute(nodeS, "A", "G");
//		print(n_btr2);
//		System.out.println(" DFS tree search S->G");
//		DepthFirstSearchAlgo dg1 = new DepthFirstSearchAlgo();
//		Node n3 = dg1.execute_TreeSearch(nodeS, "G");
//		print(n3);
//		// DFS tree search bat ki->G
//		DepthFirstSearchAlgo dg2 = new DepthFirstSearchAlgo();
//		Node n4 = dg2.execute_TreeSearch(nodeS, "A", "G");
//		print(n4);
//		ISearchAlgo algoUni = new UniformCostSearchAlgo();
//		Node result4 = algoUni.execute(nodeS,"G");
//		System.out.println("Đường đi UCS: ");
//		print(result4);
//		ISearchAlgo algoUni = new UniformCostSearchAlgo();
//		Node result5 = algoUni.execute(nodeS,"A","G");
//		System.out.println("Đường đi UCS tu diem bat ki den G: ");
//		print(result5);
//		ISearchAlgo algoUni = new UniformCostSearchAlgo();
//		Node result6 = algoUni.execute_TreeSearch(nodeS,"A","G");
//		System.out.println("Đường đi UCS_TreeSearch: ");
//		print(result6);
//		ISearchAlgo algoUni = new UniformCostSearchAlgo();
//		Node result5 = algoUni.execute(nodeS,"A","G");
//		System.out.println("Đường đi UCS_TreeSearch tu diem bat ki den G: ");
//		print(result5);
		ISearchAlgo algoUni = new UniformCostSearchAlgo();
		Node result5 = algoUni.execute(nodeS,"G",4);
		System.out.println("Depth-limited 	search:");
		for (String string : NodeUtils.printPath(result5)) {
			System.out.print(string + " ");
		}
		System.out.println();
		System.out.println(result5.getDepth());
		
		}
}
