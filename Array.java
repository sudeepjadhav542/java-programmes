import java.util.Scanner;
class Array
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n ,m,p;
		System.out.println("Enter the Size of the Array:");
		n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n+1];
		System.out.println("Enter the Array Elements:");
		for(int i=0; i<n; i++)
		{
			a[i]=sc.nextInt();

		}
		System.out.println("Enter the position to be inserted:");
		m=sc.nextInt();
		System.out.println("Enter the Element To be inserted:");
		p=sc.nextInt();
		for(int i=0;i<n+1;i++)
		{
			if(i<m)
			{
				b[i]=a[i];
			}
			else if(i == m)
				{
					b[i]=p;
				}
			else
			{
				b[i]=a[i-1];
			}
		}

		
		System.out.println("Array Elements Are:");
		for(int i=0;i<n+1;i++)
			{
				System.out.println(b[i]);
			}
			
		}
}
