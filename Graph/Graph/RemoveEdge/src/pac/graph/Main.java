package pac.graph;

public class Main {

	
	public static void main(String[] args) {
		Graph mygraph=new Graph();
		
		 mygraph.addvertex("A");

		 mygraph.addvertex("B");
		 
		 mygraph.addedge("A", "B");
		 
		 mygraph.printGraph();
		 
		 mygraph.removeEdge("A","B");
		
		// mygraph.printGraph();
		
	}

}
