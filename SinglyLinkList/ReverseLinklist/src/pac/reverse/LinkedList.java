package pac.reverse;
public class LinkedList {
	private Node head;
	private Node tail;
	private int length;
	
	class Node{
		int value;
		Node next;
		Node(int value)
		{
			this.value=value;
		}
	}
	
	public LinkedList( int value)
	{
		Node newNode=new Node(value);
		
		head=newNode;
		tail=head;
		length=1;
	}
	public void append(int value) {
		Node newNode=new Node(value);
		if(length==0)
		{
			head=newNode;
			tail=newNode;
		}
		tail.next=newNode;
		tail=newNode;
		length++;
	}
	
	public void reverse()
	{
		  Node temp = head;
	        head = tail;
	        tail = temp;
	        Node after = temp.next;
	        Node before = null;
	        for (int i = 0; i < length; i++) {
	            after = temp.next;
	            temp.next = before;
	            before = temp;
	            temp = after;
	        }
	}
	
	public void printlist()
	{
		Node temp=head;
		if(length==0)
		{
			System.out.println("Not data:");
		}
		while(temp!=null)
		{
			System.out.println("The reverse data is:"+temp.value);
			temp=temp.next;
			
		}
	}
}
