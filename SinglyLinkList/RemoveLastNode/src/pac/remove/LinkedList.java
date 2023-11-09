package pac.remove;
public class LinkedList {
	private Node head;
	private Node tail;
	private int length;
	class Node
	{
		int Value;
		Node next;
		Node(int Value)
		{
			this.Value=Value;
		}
	}
	
	public LinkedList(int value)
	{
	 Node newNode=new Node(value);
	 head=newNode;
	 tail=newNode;
	 length=1;
	}
	  
    public void append( int value)
    {
    	Node newNode=new Node(value);
    	if(length==0)
    	{
    		head=newNode;
    		tail=newNode;
    	}
    	else
    	{
    	tail.next=newNode;
    	newNode=tail;	
    	}
    	length++;
    }
    
	public Node remodvelast()
	{	if(length==0)
	  {
		return null;
	  }
		Node temp=head;
		Node slow=head;
		while(temp!=null)
		{
			slow=temp;
			temp=temp.next;
		}
		tail=slow;
		tail.next=null;
		length--;
		if(length==0)
		{
			head=null;
			tail=null;
		}
		return temp;
	}
	
	void printlist() {
		Node temp=head;
		if(length==0)
		{
		System.out.println("Not have any data:To print ");
	    }
		else
		{
			while(temp.next!=null)
			{
				System.out.println("the data is"+temp.Value);
				temp=temp.next;
			}
		}
		
		
		
	}
}