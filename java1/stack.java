import java.util.Scanner;
class Node
{
int data;
Node next;

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
			head=ns;
			}
		}

	static void pop()
		{

			head=head.next;
		}
	static void display()
	{	Node temp=head;
		while(temp.next!=null);
			{	
		
				System.out.println(temp.data);
				temp=temp.next;
			}
		if(temp.next==null)
			{
				System.out.println(temp.data);
			}
	}	

}
class Stack
{
	public static void main(String arg[])
		{
			LinkedList1.push(1);
			LinkedList1.push(12);
			LinkedList1.push(14);
			
			LinkedList1.display();

			
		}

}
