package lab4;

public class Test2 {
	public static void main(String[] args) {
		Node s = new Node("S", 30);
		Node a = new Node("A", 22);
		Node b = new Node("B", 25);
		Node c = new Node("C", 20);
		Node d = new Node("D", 10);
		Node e = new Node("E", 6);
		Node f = new Node("F", 8);
		Node g1 = new Node("G1", 0);
		Node g2 = new Node("G2", 0);
		Node h = new Node("H", 16);
		Node k = new Node("K", 26);

		s.addEdge(b, 8);
		s.addEdge(c, 19);
		s.addEdge(k, 6);
		a.addEdge(b, 8);
		a.addEdge(d, 15);
		b.addEdge(a, 7);
		b.addEdge(c, 11);
		c.addEdge(e, 12);
		d.addEdge(g2, 9);
		e.addEdge(g1, 7);
		f.addEdge(g1, 10);
		h.addEdge(s, 9);
		h.addEdge(f, 7);
		h.addEdge(g1, 19);
		k.addEdge(a, 13);
		k.addEdge(h, 10);
		
		//GreedyBestFirstSearchAlgo
//		IInformedSearchAlgo gbfs = new GreedyBestFirstSearchAlgo();
//		Node res1 = gbfs.execute(s, g1.getLabel());
//		System.out.println(NodeUtils.printPath(res1));
//		
//		Node res2 = gbfs.execute(s , k.getLabel(),g2.getLabel());
//		System.out.println(NodeUtils.printPath(res2));
		
		//AStarSearchAlgo
		IInformedSearchAlgo aStar = new AStarSearchAlgo();
//		Node res3 = aStar.execute(s, h.getLabel());
//		System.out.println(NodeUtils.printPath(res3));
//		
//		Node res4 = aStar.execute(s, h.getLabel(), g1.getLabel());
//		System.out.println(NodeUtils.printPath(res4));
		
		System.out.println("Admissible : " + ((AStarSearchAlgo) aStar).isAdmissibleH(e, g1.getLabel()) + "\n");
		

	}

}
