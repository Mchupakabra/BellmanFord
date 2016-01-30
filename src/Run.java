public class Run {
	public static void main(String[]args)
	{
		Node start = new Node("s");
		Node a = new Node("a");
		Node c = new Node("c");
		Node v = new Node("v");
		Node x = new Node("x");
		Node r = new Node("r");
		Node z = new Node("z");
		Node h = new Node("h");
		Node y = new Node("y");
		Node b = new Node("b");
		
		ConnectedGraph g = new ConnectedGraph(	new Edge(a, c, 2),
												new Edge(x, r, 3),
												new Edge(c, v, 6),
												new Edge(x, a, 5),
												new Edge(start, x, 1),
												new Edge(start, a, 7),
												new Edge(start, c, 9),
												new Edge(start, r, 5),
												new Edge(c, z, 5),
												new Edge(z, v, 7),
												new Edge(r, z, 3),
												new Edge(r, h, 2),
												new Edge(z, h, 2),
												new Edge(y, v, 1),
												new Edge(y, z, 3),
												new Edge(y, h, 4),
												new Edge(b, y, 1),
												new Edge(b, h, 2));
		
		BellmanFord BFtable = new BellmanFord(g, start);
		
		BFtable.compute();
		
		BFtable.printTable();
	}
}
