package pac.remove;
public class LinkedList
{
	private Node head;
	private Node tail;
	private int length;
	
    public class Node{
		int value;
		Node next;
		Node(int value)
		{
			this.value=value;
		}
	}

    LinkedList(int value)
   {
	   Node newNode=new Node(value);
	   
	   head= newNode;
	   tail=newNode;
	   length=1;
   }

public Node firstdelete()
{
	Node temp=head;
	if(length==0)
	{
		System.out.println("no data to delete something");
		return null;
	}
	else
	{
		temp.next=null;
		head=temp.next;
	}
	
	length--;
	if(length==0)
	{
		head=null;
		tail=null;
	}
	return temp;
	
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
public Node get(int index)
{
	Node temp=head;
	if(length==0)
	{
		return null;
		
	}
	else
	{
	for(int i=0;i<index;i++)
	{
		temp=temp.next;
		
	}
		return temp;
	}
	
}

   public Node remove(int index)///remove method
   {   Node prev;
	   Node temp;
	 if(index<0||index>length)
	 {
		 return null;
	 }
	 if(length==0) {return  firstdelete();}
	 
	 if(length==index-1) {return remodvelast();}
	
	  prev=get(index-1);
	  temp=prev.next;
	  
	prev.next=temp.next;
	temp.next=null;
	 length--;
	   return temp;
   }

}

