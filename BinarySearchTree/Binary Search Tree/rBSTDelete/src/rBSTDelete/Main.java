package rBSTDelete;

public class Main {
  public static void main(String[] args) {
	
	BinarySearchTree mybst=new BinarySearchTree();
	
	         mybst.createNode(7);
	         mybst.createNode(9);
	         mybst.createNode(5);
	         
	         System.out.println(mybst.root.value);
	         System.out.println(mybst.root.left.value);
	         System.out.println(mybst.root.right.value);
	         
	         mybst.deleteNode(5);
	         
	         System.out.println(mybst.root.value);
	         System.out.println(mybst.root.left.value);
	         System.out.println(mybst.root.right.value);
	  
}
	
}
