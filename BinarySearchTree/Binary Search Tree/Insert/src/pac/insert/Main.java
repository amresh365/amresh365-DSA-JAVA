package pac.insert;

public class Main {
public static void main(String[] args)
{
	BinarySearchTree myBST=new BinarySearchTree();
	
	myBST.insert(47);
	myBST.insert(21);
	myBST.insert(15);
	myBST.insert(30);
	myBST.insert(10);
	myBST.insert(35);
	
	myBST.insert(27);
	System.out.println(myBST.root.left.right.value);
	
	
	
	
}

}
