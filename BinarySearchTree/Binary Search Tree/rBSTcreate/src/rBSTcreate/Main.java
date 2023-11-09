package rBSTcreate;

public class Main {
public static void main(String[] args) {
	BinarySearchTree myrbst= new BinarySearchTree();
	
	   myrbst.rInsert(10);
	   myrbst.rInsert(5);
	   myrbst.rInsert(12);
	   
	   System.out.println(myrbst.root.value);

	   System.out.println(myrbst.root.left.value);
	   

	   System.out.println(myrbst.root.right.value);


}



	
}
