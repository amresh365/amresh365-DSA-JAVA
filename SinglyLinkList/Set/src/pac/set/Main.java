package pac.set;

public class Main {

	public static void main(String[] args) {
		LinkedList mylist=new LinkedList(1);
		mylist.append(2);
		mylist.append(3);
		mylist.append(4);
		mylist.append(5);
		System.out.println(mylist.set(3, 0));
		
	}

}
