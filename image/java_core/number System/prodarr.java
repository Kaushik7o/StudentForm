import java.util.Scanner;
class prodarr
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int a[][]=new int[m][n];
		int b[][]=new int[m][n];

System.out.println("enter for first array");
    for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
           a[i][j]=s.nextInt();

			}
System.out.println();
		}


System.out.println("output for first array");
        for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
          
System.out.print(a[i][j]+" ");
			}
 	System.out.println("");
		}
	
	

System.out.println("enter for second array");
    for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
           b[i][j]=s.nextInt();

			}
     System.out.println();
		}


System.out.println("output for first array");
		  for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
           System.out.print(b[i][j]+" ");

			}
System.out.println();
		}

int l=a[0].length;
	int l2=b[0].length;
int c[][]=new int[l][l2];

System.out.println("product is:");
		  for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				int sum=0;
				for(int k=0;k<n;k++)
				{

                sum=sum+a[i][k]*b[k][j];
c[i][j]=sum;
				}
			}

		}


		 for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
		System.out.print(c[i][j]+" ");
				}
						System.out.println(" ");
			}
}
}
