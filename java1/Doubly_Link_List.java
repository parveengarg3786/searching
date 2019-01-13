
class Node
{
	Node previous;
	int data;
	Node next;
	
}

class Linked_list
{
Node head;
void add(int data)
	{
	Node nd =new Node();
	nd.previous=null;
	nd.data=data;
	nd.next=null;
	if(head==null)
		{
			head=nd;
		}
	else
		{
			Node temp;
			Node back;
			back=head;
			temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
				temp.previous=back;
				back=back.next;
			
			}
			temp.next=nd;
			temp=temp.next;
			temp.previous=back;
			
	
		
		}
	
	}
void display_front()
{
Node temp;
temp=head;
while(temp.next!=null)
	{
	System.out.println(temp.data);
	temp=temp.next;
	}
if(temp.next==null)
	{
		System.out.println(temp.data);
	}
}
void display_reverse()
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
public class Doubly_Link_List
{
	public static void main(String arg[])
	{
		Linked_list ls=new Linked_list();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		System.out.println("display from front");
		ls.display_front();
		System.out.println("display from back");
		ls.display_reverse();
	}
}
