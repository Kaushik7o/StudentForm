 import java.util.Scanner;
 class primex 
  {
	public static void main(String[] args) 
	{
		int n;
		int count=0;
		 Scanner sc = new Scanner(System.in);

		System.out.print("enter any number :-"+"   ");
		n=sc.nextInt();

		for (int i=1;i<=n;i++)
		{
			if (n%i==0)
			{
              count++;
			}
		}
			if (count==2)
			{
				System.out.print(n+" "+"is a prime number");
			}
		     else
			{
				System.out.println(n +"is not a prime number");
			
		   }
	    }
     }
