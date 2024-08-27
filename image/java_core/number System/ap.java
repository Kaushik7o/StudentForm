class ap
{
	public void print(int a[])
	{
	
     for (int i:a)
	 {
		
       int fact =1;	
		 for(int x=1;x<=i;x++)
		 {
			 fact=fact*x;
			
		 }
		 int sum =fact;

		 if(fact%2==0)
		 {
          System.out.println(sum+" is even");
		 }
		 else 
		 {
   System.out.println(sum+" is odd");
		 }
		 
     }
	}
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,4,5,6};
		ap r=new ap();
		r.print(arr);
	}
}
