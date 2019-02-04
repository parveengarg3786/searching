import java.util.Scanner;
class Node
{
int data;
Node previous;

}
class LinkedList1
{
static Node head;
static void push(int data)
{

 Node ns=new Node();
 ns.data=data;
 ns.next=null;
	if(head==null)
		{
		head=ns;
		}
	else
		{
		ns.next=head;
		head=ns
		}
}

static void pop()
{

head=head.next;
}
Static void display()
	{
		while(head.next!=null);
	{	
		
		System.out.println(head.data);
		head=head.next;
	}
	if(head.next==null)
	{
		System.out.println(head.data);
	}
}
class Stack
{
	public static void main(String arg[])
		{
			LinkedList1.push(1);
			LinkedList1.push(12);
			LinkedList1.push(14);
			LinkedList1.pop();
			LinkedList1.pop();
			LinkedList1.display();

			
		}

}
