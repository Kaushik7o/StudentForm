
import java.util.Scanner;
class autophormic 
{
	public static void main(String[] args) 
	{
		int count =0,rem,sum=0,count2=0,temp=0;
		Scanner s=new Scanner(System.in);
	int x=s.nextInt();
	int square=(int)Math.pow(x,2);//or int square=x*x;
      for(int i=x;i!=0;i/=10)
		{
         count=count+1;
		}


     while(square!=0)
		{
         rem=square%10;
		 count2=count2+1;
		  sum=sum*10+rem;
		 square=square/10;
			 if(count==count2)
			{
            temp=sum;
			}
		}
		rem=0;
		sum=0;



     while(temp!=0)
		{
         rem=temp%10;
		
		  sum=sum*10+rem;
		 
		
		 temp=temp/10;
		}
if(x==sum)
		{
System.out.println("autophormic");
		}
		else{

System.out.println("not autophormic");
		}

	}
}
