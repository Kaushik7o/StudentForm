import java.util.Scanner;
class arrt
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a pos");
		int m=s.nextInt();
		int a[]={1,2,3,4,8,9,7};
		int size=a.length;
        int b[]=new int[size];
		
		
		int c[]=new int[size];
		for(int i=0;i<m;i++)
		{
         b[i]=a[i];
         
		}
		int x=0;
       for(int i=m;i<size;i++)
		{	
           c[x]=a[i];
			x++;
		}
		int y=0;
 for(int i=x;i<size;i++)
		{
         c[i]=b[y];
		 y++;
		}

		 for(int i=0;i<size;i++)
		{	
         System.out.print(c[i]+" ");
		}
		


	}
}
