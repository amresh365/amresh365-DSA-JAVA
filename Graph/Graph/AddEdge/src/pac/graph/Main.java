package pac.graph;

public class Main {
 public static void main(String[] args) {
	 Graph mygraph=new Graph();
	 
	 mygraph.addVertex("A");

	 mygraph.addVertex("B");
	 
	 mygraph.addedge("A", "B");
	 
	 mygraph.printGraph();
	 
}
}
