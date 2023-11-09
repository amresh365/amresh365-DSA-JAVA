package pac.find;

public class Main {
	public static void main(String[] args) {
		BinarySearchTree myBST=new BinarySearchTree();
		myBST.insert(6);
		myBST.insert(7);
		myBST.insert(8);
		myBST.insert(9);
		myBST.insert(20);
		
	System.out.println(myBST.find(20));
		
	}

}
