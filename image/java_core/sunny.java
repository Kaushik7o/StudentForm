import java.util.Scanner;
class sunny 
{
	public static void main(String[] args) 
	{
	int x=new Scanner(System.in).nextInt();
	x=x+1;
	if(x%Math.sqrt(x)==0)
		{
System.out.println("sunny number");
		}
		else{
System.out.println("not sunny number");

		}
	}
}
