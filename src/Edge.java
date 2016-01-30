public class Edge implements Comparable<Edge>{

	Node source;
	Node destination;
	int weight;
	public Edge(Node sourceIN, Node destinationIn, int weightIn)
	{
		this.source = sourceIN;
		this.destination = destinationIn;
		this.weight= weightIn;
	}
	public Node getSource()
	{
		return this.source;
	}
	public Node getDestination()
	{
		return this.destination;
	}
	public int getWeight()
	{
		return weight;
	}
	@Override
	public int compareTo(Edge edge) {
		if(((Integer) this.weight).compareTo(edge.getWeight())==0)
		{
			if(this.source.compareTo(edge.getSource())==0)
			{
				return this.destination.compareTo(edge.getDestination());
			}
			return this.source.compareTo(edge.getSource());
		}
		return ((Integer) this.weight).compareTo(edge.getWeight());
	}
	public String getDetails() {
		return "Source: "+ this.getSource().getName()+" Destination: "+ this.getDestination().getName()+" Weight: "+ this.getWeight();
	}
}
