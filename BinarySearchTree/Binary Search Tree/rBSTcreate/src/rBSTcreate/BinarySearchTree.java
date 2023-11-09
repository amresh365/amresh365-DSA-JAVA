package rBSTcreate;

public class BinarySearchTree {
	public Node root;
	class Node{
		int value;
		Node left;
		Node right;
		Node(int value)
		{
			this.value=value;
		}
		
	}
	
public void rInsert(int value)
{
	if(root==null)
	{
		root=new Node(value);
	}
	rInsert(root,value);
	
}

private Node rInsert(Node currentNode,int value)
{
 
	if(currentNode==null)
	{
		return new Node(value);
	}
	if(value<currentNode.value)
	{
		currentNode.left=rInsert(currentNode.left,value);
				
	}
	else {
		currentNode.right=rInsert(currentNode.right,value);
	}
return currentNode;
}

}
