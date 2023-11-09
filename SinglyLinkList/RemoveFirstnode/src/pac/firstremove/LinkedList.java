package pac.firstremove;

public class LinkedList {
private	Node head;
private	Node tail;
private	int  length;

class Node{
	int value;
	Node next;
	Node(int value)            // this is constructor 
	{
		this.value=value;
	}
}

public LinkedList(int value)   //this is constructor
{
	Node newNode=new Node(value);
	head=newNode;
	tail=newNode;
	length=1;
	
}
public void append(int value)
{   Node temp=head;
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

public void printlist()
{
Node temp=head;
if(length==0)
{
	System.out.println("No data to print ");
}
	
else
{
	while(temp!=null)
	{
		System.out.println(" the data is:"+temp.value);
		temp=temp.next;
	}
	
}
	
	
	
}

	
	
}
