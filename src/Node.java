public class Node implements Comparable<Node>{
	String name;
	public Node(String nameIn)
	{
		this.name = nameIn;
	}
	public String getName()
	{
		return this.name;
	}
	@Override
	public int compareTo(Node o) {
		return this.name.compareTo(o.getName());
	}
}
