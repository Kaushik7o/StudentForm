import java.util.Scanner;
class krishnamuraty 
{
	public static void main(String[] args) 
	{
		int sum=0,rem;
	Scanner s=new Scanner(System.in);
	int x=s.nextInt();
	
       while(x!=0)
		{
         rem=x%10;
		
		 for(int i=x;i!=1;i--)
		{
         rem=rem*i;

		}
		sum=sum+rem;
		
		 x=x/10;
		}


	



		if(sum==x)
		{
System.out.println(true);
		}
		else
		{

System.out.println(false);
		}

		
	}
}
