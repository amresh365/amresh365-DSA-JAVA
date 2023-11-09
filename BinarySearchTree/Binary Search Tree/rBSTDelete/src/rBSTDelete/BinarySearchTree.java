package rBSTDelete;

public class BinarySearchTree {
	 public Node root;
	 
	 class Node
	 {
		 int value;
		 Node left;
		  Node right;
		  Node(int value)
		  {
			this.value=value;  
		  }
	 }
	   

		private int  minValue(Node currentNode) {
			while(currentNode.left!=null)
			{
				currentNode=currentNode.left;
			}
			return currentNode.value;
		}


		private Node deleteNode(Node currentNode,int value)
		{
			if(currentNode==null)
			{
				return null;
			}
			if(value<currentNode.value)
			{
				currentNode.left= deleteNode(currentNode.left,value);
			}
			else if(value>currentNode.value)
			{
			    currentNode.right= deleteNode(currentNode.right,value);
			}
			else {
				if(currentNode.left==null&&currentNode.right==null) {
					return null;
				}
				else if(currentNode.left==null)
				{
					currentNode=currentNode.left;
				}
				else if(currentNode.right==null)
				{
					currentNode=currentNode.right;
				}
				else
				{
					int subTreeMin=minValue(currentNode.right);
					currentNode.value=subTreeMin;
					currentNode.right=deleteNode(currentNode.right,value);
				}
				
			}
			return currentNode;
		}
		
		
	private Node createNode(Node currentNode,int value)
     	{
		if(currentNode==null)
		{
			Node newNode=new Node(value);
		}
		if(value<currentNode.value)
		{
			currentNode.left=createNode( currentNode.left, value);	
		}
		else 
		{
			currentNode.right=createNode(currentNode.right,value);
		}
		
		return currentNode;
		
	}
	
	public void createNode(int value)
	{
		if(root==null)
		{
			root=new Node(value);
		}
		createNode(root,value);
	}
	
	

	public void deleteNode(int value)
	{
		deleteNode(root,value);
	}
	
	
}
