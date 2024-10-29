import java.util.Scanner;
class Practice
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
	Node tail=null;
	void creation()
	{
		Scanner sc = new Scanner(System.in);
		int n,data,m,p;
		do
		{
			System.out.println("Enter the item:");
			data=sc.nextInt();
			Node new_node=new Node(data);
			if(head==null)
			{
				//head=new_node;
				head = new_node;
				tail = new_node;
				new_node.next=head;
			}
			else
			{
				System.out.println("Enter 1 and 2 and 3 for insertion:");
				m=sc.nextInt();
				switch(m)
				{
				case 1 :
					new_node.next=head;
					head=new_node;
					tail.next=new_node;
					break;
				case 2 :
					tail.next=new_node;
					tail=new_node;
					new_node.next=head;
					break;
				case 3 :
					Node temp1=head;
					System.out.println("Enter the positiom :");
					p=sc.nextInt();
					for(int i =0 ;i<(p-1);i++)
					{
						temp1=temp1.next;
					}
					new_node.next=temp1.next;
					temp1.next=new_node;
					break;
				}
			}
			System.out.println("do u want to add ?");
			n=sc.nextInt();
		}while(n==1);

	}

	/*void display()
	{
		Scanner sc = new Scanner(System.in);
		Node temp=head;
		if(head==null)
			{
				System.out.println("NOt exist !!");
			}
		else{
				do{
					System.out.println(temp.data+" ");
					temp=temp.next;

				}while(temp != head);
			}
			
	}*/
	void delete()

	{
		Scanner sc = new Scanner(System.in);
		int n,m,p;
		if(head==null)
		{
			System.out.println("empty");
		}
		else{
			do{
				System.out.println("Enter the l to 2 and 3:");
				m=sc.nextInt();
				switch(m){
				case 1 :
				Node temp=head;
					temp=temp.next;
					head=temp;
					tail.next=head;
					break;
					case 2:
						Node temp1=head;
						Node ptr=temp1.next;
						while(ptr.next==head)
						{
							temp1=ptr;
							ptr=ptr.next;
						}
						temp1.next=head;
						tail=temp1;
						break;
					case 3 :
						System.out.println("enter the position :");
						p=sc.nextInt();
						Node temp2 =head;
						Node ptr2=temp2.next;
						for(int i =0;i<(p-1);i++)
						{
							temp2=ptr2;
							ptr2=ptr2.next;
						}
						temp2.next=ptr2.next;

			}
			System.out.println("do u want to delete");
			n=sc.nextInt();


		}while(n==1);
	}
}
	void display()
	{
		Scanner sc = new Scanner(System.in);
		Node temp=head;
		if(head==null)
			{
				System.out.println("NOt exist !!");
			}
		else{
				do{
					System.out.println(temp.data+" ");
					temp=temp.next;

				}while(temp != head);
			}
			
	}

	

	public static void main(String args[])
	{
		Practice ob=new Practice();
		ob.creation();
		ob.delete();
		ob.display();
	}
}