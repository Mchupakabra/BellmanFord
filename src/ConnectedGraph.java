import java.util.Arrays;
import java.util.TreeSet;

public class ConnectedGraph {

	TreeSet<Edge> edges;
	TreeSet<Node> nodes;
	public ConnectedGraph(Edge... edgesIn){
		this.edges = new TreeSet<>(Arrays.asList(edgesIn));
		this.nodes = new TreeSet<>();
		for(Edge e: edgesIn)
		{
			this.nodes.add(e.getSource());
			this.nodes.add(e.getDestination());
		}
		
	}
	public TreeSet<Edge> getEdges()
	{
		return this.edges;
	}
	public TreeSet<Node> getNodes()
	{
		return this.nodes;
	}
	public void printEdges()
	{
		for(Edge e:edges)
			System.out.println(e.getDetails());
	}
}
