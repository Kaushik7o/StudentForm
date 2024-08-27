class oner
{
	public static void main(String[] args) 
	{
		long x=12345;long sum=0;long rem;
		while(x!=0)
		{
         rem=x%10;
		 sum=sum*10+rem;
		 x=x/10;

		System.out.println(rem);

		}

	}
}
