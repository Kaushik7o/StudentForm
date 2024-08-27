import java.util.Scanner;
class zigzag
{
	public static void main(String[] args) 
	{
		int a[]={1,2,3,4,8,9,7};
		int size=a.length;
        int b[]=new int[size];
		
		
		int c[]=new int[size];
		do{

			int pos=1;
			if(pos<a.length)
			{
		
char c='y';
		
		
		for(int i=0;i<pos;i++)
		{
         b[i]=a[i];
         
		}
		int x=0;
       for(int i=pos;i<size;i++)
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
		pos++;
			}

			else{
pos=1;
			}
		System.out.println("contine");
		c=new Scanner(System.in).charAt[0];
		}while(c!='n');

	}
}