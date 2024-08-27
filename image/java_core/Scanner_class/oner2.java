class oner2
{
	public void m1(long x)
	{
		long temp=x;
		
long sum=0;long rem;
		while(x!=0)
		{
         rem=x%10;
		 sum=sum*10+rem;
		 x=x/10;
while(temp!=0)
			{
rem=x%10;
		 sum=sum*10+rem;
		 x=x/10;
		 temp++;
			}
		 
		
	}
     
	System.out.println(sum);
		
	}
	public static void main(String[] args) 
	{
		
         new oner2().m1(12345);
		}


	}

