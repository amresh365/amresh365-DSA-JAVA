package pac.graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
     private HashMap<String,ArrayList>adjlist=new HashMap<>();
     public void printGraph()
     {
    	 System.out.println(adjlist);
     }
	
     public boolean addVertex(String vertex)
     {
    	 if(adjlist.get(vertex)==null)
    	 {
    		 adjlist.put(vertex,new ArrayList<String>());
    		 return true;
    	 }
    	 return false;
    	 
     }
	
	
	
}
