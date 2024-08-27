import java.util.Scanner;
class arr6
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int a[][]=new int[m][n];
		int b[][]=new int[m][n];

if(m!=n)
		{
System.out.println("not square matrix");
		}
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
				if(i>j)
				{
					a[i][j]=0;
					}
         
				   
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
System.out.println();
		}


	}
}
