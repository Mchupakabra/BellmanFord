import java.util.Arrays;

public class BellmanFord {
	Node[]node;
	Node[]parent;
	int[]distance;
	
	ConnectedGraph graph;
	
	public BellmanFord(ConnectedGraph graphIn, Node startingNode)
	{
		this.graph = graphIn;

		this.node = new Node[this.graph.getNodes().size()];
		this.parent = new Node[this.graph.getNodes().size()];
		this.distance = new int[this.graph.getNodes().size()];
				
		int i = 0;
		for(Node n : this.graph.getNodes())
		{
			this.node[i] = n;
			this.parent[i] = null;
			this.distance[i] = Integer.MAX_VALUE/2;
			i++;
		}
		distance[Arrays.asList(this.node).indexOf(startingNode)] = 0;
	}
	public void compute() {
		for(int i = 0; i < this.graph.getNodes().size();i++)
		{
			for(Edge e : this.graph.getEdges())
			{
				this.relax(e.getSource(), e.getDestination(), e.getWeight());
			}
		}		
	}
	private void relax(Node source, Node destination, int weight) {
		if(this.distance[Arrays.asList(this.node).indexOf(destination)] > this.distance[Arrays.asList(this.node).indexOf(source)] + weight)
		{
			this.distance[Arrays.asList(this.node).indexOf(destination)] = this.distance[Arrays.asList(this.node).indexOf(source)] + weight;
			parent[Arrays.asList(this.node).indexOf(destination)] = source;
		}
	}
	public void printTable()
	{
		System.out.println("NODE\t|\tPARENT\t|\tDISTANCE");
		for(int i = 0;i<this.node.length;i++)
		{
			try{
				System.out.println(this.node[i].getName()+"\t|\t"+this.parent[i].getName()+"\t|\t"+this.distance[i]);
			}
			catch(NullPointerException e)
			{
				System.out.println(this.node[i].getName()+"\t|\t"+this.parent[i]+"\t|\t"+this.distance[i]);
			}
		}
	}
}
