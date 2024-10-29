class Reverse
{
	public static void main(String args[])
	{
		int a[]={1,3,4,67};
		int l = a.length;
		int n= Math.floorDiv(l,2);
		int temp;
		for( int i=0;i<n;i++)
		{
			temp=a[i];
			a[i]=a[l-1-i];
			a[l-1-i]=temp;
		}
		for(int e:a)
			{
				System.out.println(e);
			}
	}
}