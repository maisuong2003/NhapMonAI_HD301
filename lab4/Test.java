package lab4;

public class Test {
	public static void main(String[] args) {
		Node s = new Node("S", 6);
		Node b = new Node("B", 4);
		Node a = new Node("A", 4);
		Node c = new Node("C", 4);
		Node d = new Node("D", 3.5);
		Node e = new Node("E", 1);
		Node f = new Node("F", 1);
		Node g = new Node("G", 0);
		
		s.addEdge(b, 3);
		s.addEdge(a, 2);
		a.addEdge(c, 3);
		b.addEdge(d, 3);
		b.addEdge(c, 1);
		c.addEdge(e, 3);
		c.addEdge(d, 1);
		d.addEdge(f, 2);
		f.addEdge(g, 1);
		e.addEdge(g, 2);
		//GreedyBestFirstSearchAlgo
		IInformedSearchAlgo gbfs = new GreedyBestFirstSearchAlgo();
		Node res1 = gbfs.execute(s, g.getLabel());
		System.out.println(NodeUtils.printPath(res1));
		
		Node res2 = gbfs.execute(s, b.getLabel(), g.getLabel());
		System.out.println(NodeUtils.printPath(res2));
		
		//AStarSearchAlgo
		IInformedSearchAlgo aStar = new AStarSearchAlgo();
		Node res3 = aStar.execute(s, d.getLabel());
		System.out.println(NodeUtils.printPath(res3));
		System.out.println(res3.getG());
		
		Node res4 = aStar.execute(s, b.getLabel(), g.getLabel());
		System.out.println(NodeUtils.printPath(res4));
		System.out.println("Admissible : " + ((AStarSearchAlgo) aStar).isAdmissibleH(s, g.getLabel()) + "\n");
}
}
