class octal 
{
	public static void main(String[] args) 
	{
int n=30;int rem;int i=0;int sum=0;                                                                                                                                                                               

while(n!=0)
		{
 rem=n%10;
	sum=(int)(rem*Math.pow(8,i));
i++;
n=n/10;

		}

		System.out.println(sum);

	}
}
