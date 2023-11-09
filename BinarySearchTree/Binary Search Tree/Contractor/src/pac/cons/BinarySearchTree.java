package pac.cons;

public class BinarySearchTree {
 public  Node root;
 
  class Node
  {
	  int value;
	  Node left;
	  Node right;
	  
	  Node(int Value)
	  {
		  this.value=value;
	  }
  }
  
  BinarySearchTree(int value)
  {
	  Node newNode=new Node(value);
	  root=newNode;
	  newNode.value=value;
  }
 
	
}
