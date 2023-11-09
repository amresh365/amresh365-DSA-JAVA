package pac.reverse;

public class Main {

	public static void main(String[] args) {
		LinkedList mylist=new LinkedList(0);
		mylist.append(1);
		mylist.append(2);
		mylist.append(3);
		mylist.append(4);
		mylist.append(5);
		
		mylist.reverse();
		
		mylist.printlist();
		
	}

}
