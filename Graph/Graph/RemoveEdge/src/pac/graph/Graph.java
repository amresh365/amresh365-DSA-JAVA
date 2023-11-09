package pac.graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {

   private HashMap<String,ArrayList>adjlist=new HashMap<>();
   
   public boolean addvertex(String vertex)
   {
	   if(adjlist.get(vertex)==null)
	   {
		   adjlist.put(vertex,new ArrayList<String>());
	       return true;
	   }
	   return false;
   }
   
   public void printGraph()
   {
	   System.out.println(adjlist);
   }
   
   public boolean addedge(String vertex1,String vertex2)
   {
	   if(adjlist.get(vertex2)!=null&&adjlist.get(vertex1)!=null)
	   {
		   adjlist.get(vertex1).add(vertex2);
		   adjlist.get(vertex2).add(vertex1);
		   return true;
	   }
	   return false;
   }
   
   public boolean removeEdge(String vertex1,String vertex2 )
   {
	   
	   if(adjlist.get(vertex2)!=null&&adjlist.get(vertex1)!=null)
	   {
		   adjlist.get(vertex1).remove(vertex2);
		   adjlist.get(vertex2).remove(vertex1);
		   return true;
		   
	   }
	   return false;
   }
	
	
}
