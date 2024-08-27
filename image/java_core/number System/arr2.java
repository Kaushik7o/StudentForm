class arr2
{
	public static void main(String[] args) 
	{
		
		int a[]={1,2,3,7,8,5};

		for(int i=0;i<a.length-1;i++)
		{
         for(int j=i+1;j<a.length;j++)
			{
			 int temp=0;
			 if(a[i]>a[j])
				{
               temp=a[i];
			   a[i]=a[j];
			   a[j]=temp;
				}
				 
		   }
		  

	}

	for(int i=0;i<a.length;i++)
		{
         System.out.println(a[i]);
		}
}
}