import java.util.Scanner;
class Singly1
{
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;

		}
	}
	Node head=null;
	void creation()
	{
		Scanner sc = new Scanner(System.in);
		int data ,n;
		do{
			System.out.println("enter the element:");
			data=sc.nextInt();
			Node new_node = new Node(data);
			if(head==null)
			{
				head=new_node;
			}
			else
			{
				new_node.next=head;
				head=new_node;
			}
			System.out.println("do u want to add more items in LL ?");
			n=sc.nextInt();
		}while(n==1);

	}
	
	void display()
	{
		Node temp=head;
		if(head==null)
			{
				System.out.println("No Node Exits");
			}
		else
		{
			while(temp != null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}
public static void main(String args[])
{
	Singly1 ob = new Singly1();
	ob.creation();
	ob.display();
}
}
