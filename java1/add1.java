import java.util.Scanner;
class Node
{
int data;
Node next;
Node previous;
}
class Linked_list
{
static Node head;
static void add(int data)
	{
		Node nd=new Node();
		nd.data=data;
		nd.previous=null;
		nd.next=null;
	
	if(head==null)
	head=nd;
	else
		{
			Node temp;
			temp=head;
			Node back=head;
			while(temp.next!=null)
			{
				temp=temp.next;
				temp.previous=back;
				back=temp;
			}
			temp.next=nd;
			temp=temp.next;
			temp.previous=back;
	
		}
	}
static void add_at_position(int data,int position)
{
	Node nd=new Node();
	nd.data=data;
	nd.next=null;
	nd.previous=null;
	Node temp;
	temp=head;
	Node temp2=head;
	Node temp3=head;
	while(temp.data!=position)
		{
			temp=temp.next;
		}
	temp2=temp.next;
	temp3=temp;
	temp.next=nd;
	temp=temp.next;
	temp.previous=temp3;
	temp.next=temp2;

}
static void delete1(int data,int delete)
{
	Node temp=head;
	Node first=head;
	Node second=head;
	while(temp.data!=delete)
		{	first=temp;
			temp=temp.next;
			
		}
	temp=temp.next;
	second=temp;
	first.next=second;
	
		
	
	
}
static void display()
		{
			Node temp;
			temp=head;
			while(temp.next!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
			if(temp.next==null)
				System.out.println(temp.data);
		
		}
static void back_display()
		{
			Node temp;
			temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			while(temp.previous!=null)
			{
				System.out.println(temp.data);
				temp=temp.previous;
	
			}
			if(temp.previous==null)
			{
				System.out.println(temp.data);
			}
		
		}
}

class add1
{
	public static void main(String arg[])
		{	
			Scanner sc=new Scanner(System.in);
			Linked_list.add(1);
			Linked_list.add(2);
			Linked_list.add(3);
			System.out.println("list from starting");
			Linked_list.display();
			System.out.println("list from last");
			Linked_list.back_display();

			System.out.println("Do you want\n1.add another node\n2.delete");
			int option=sc.nextInt();
			switch(option)
				{
					case 1:
						System.out.println("after which you want to add");
						int position=sc.nextInt();
						Linked_list.add_at_position(8,position);
						System.out.println("list after adding");
						Linked_list.display();
					case 2:
						System.out.println("which data you want to delete");
						int delete=sc.nextInt();
						Linked_list.delete1(2,delete);
						System.out.println("list after delete node");
						Linked_list.display();

			
				}
		}
}
