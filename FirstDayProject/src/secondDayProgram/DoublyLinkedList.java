package secondDayProgram;

class Node{
	int data;
	Node previous;
	Node next;
}

class List{
	Node head;
	void add(int data)
	{
		Node nd = new Node();
		nd.data = data;
		nd.previous = null;
		nd.next = null;
		
		if(head == null)
		{
			head = nd;
		}
		else
		{
			Node temp = head;
			while(temp.next!=null)
			{
				temp = temp.next;
			}
			temp.next = nd;
			nd.previous = temp;
		}
	}
	
	void display()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	void reversedisplay()
	{
		Node temp = head;
		while(temp.next!= null)
		{
			
			temp = temp.next;
		}
		
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.previous;
		}
	}

}

public class DoublyLinkedList{
	public static void main(String[] args) {
		List ll = new List();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.display();
		System.out.println("reverse of list");
		ll.reversedisplay();
	}
}