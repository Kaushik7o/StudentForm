class arr3
{
	public static void main(String[] args) 
	{

	
		int a[]={1,2,11,8,9,2};
		
		for (int i=0;i<a.length-1;i++)
		{
		int temp;
      if(a[i]>a[i+1])
			{
            temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			}	
		}

	
		System.out.println("max is"+a[0]);
System.out.println("min is"+a[5]);
	}
}
