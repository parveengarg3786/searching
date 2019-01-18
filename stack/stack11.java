class Node
{
int data;
Node next;
}
class Stack_Structure
{
Node head;
void push(int data)
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
void pop()
	{
		head=head.next;
	}

void display()
	{	Node temp;
		temp=head;
		while(temp.next!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
		if(temp.next==null)
				System.out.println(temp.data);
	}

}
class stack
{
	public static void main(String arg[])
		{
			Stack_Structure ss=new Stack_Structure();
			System.out.println("push operation perform");
			ss.push(1);
			ss.push(2);
			ss.push(3);
			
			ss.display();
			System.out.println("after pop operation perform");
			ss.pop();
			ss.display();
		}
}
