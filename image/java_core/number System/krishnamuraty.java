import java.util.Scanner;
class krishnamuraty 
{
	public static void main(String[] args) 
	{
		int sum=0,rem,fact=1;
	Scanner s=new Scanner(System.in);
	int x=s.nextInt();
	   int temp=x;
       while(x!=0)
		{
        rem=x%10;
		 
	   for(int i=rem;i>0;i--)
		{
        fact=fact*i;
		}
		sum=sum+fact;
		fact=1;
		 x=x/10;

		}

		if(sum==temp)
		{
System.out.println(true);
		}
		else
		{
System.out.println(false);
		}

		
	}
}
