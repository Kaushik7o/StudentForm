import java.util.Scanner;
class primerec 
{
	int count=0;
String prime(int i,int j)
	{
     if(n%i==0)
		{
         return "not prime"; 
		}
		
		else{
        return i%prime(j);
		}

	}
	public static void main(String[] args) 
	{
	  primerec v=new primerec();
	  int n=10;
      
	  for(int i=2;i<=n;i++)
		{
		  for(int j=2;j<i;j++)
			{
         System.out.println(fact(i,j));
         
			}
		}
	}
}
