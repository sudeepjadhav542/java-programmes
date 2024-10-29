import java.util.Scanner;
class Singly
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
		int data, n;
		Scanner sc =new Scanner(System.in);
		do{
		System.out.println("Enter the Elements:");
		data=sc.nextInt();
		Node new_node = new Node(data);
		if(head==null)
			{
				head=new_node;
			}
		else{
			new_node.next=head;
			head=new_node;
		}
		System.out.println("Do u want to add More items ? if yes press 1");
		n=sc.nextInt();
	}while( n == 1);
}
	void traverse()
	{
		Node temp=head;
		if(head==null)
			{
				System.out.println("not Exits !!!");
			}
		else{
			while(temp != null)
			{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}

	public static void main(String args[])
	{
		Singly obj = new Singly();
		obj.creation();
		obj.traverse();

	}
}

	
