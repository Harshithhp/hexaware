class demo29
{
	public static void main(String args[])
	{
		int arr[]={1,2,5,7,8};
		int a[]=new int[7];
		a[0]=2;
		a[1]=5;
		a[2]=22;
		a[3]=55;
		for(int i=0;i<=arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		for(int i:arr)
		{
			System.out.println(i);
		}
	}
}