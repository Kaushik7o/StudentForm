import java.util.Scanner;
public class darry 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int arr[][]=new int[m][n];
System.out.println("tke input");
		for(int i=0;i<m;i++)
		{

			for(int j=0;j<n;j++)
			{

        arr[i][j]=s.nextInt();
			}
		}
System.out.println("output is:");
			for(int i=0;i<m;i++)
		{

			for(int j=0;j<n;j++)
			{
				

    System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

int suml=0;
int sumr=0;
	for(int i=0;i<m;i++)
		{

			for(int j=0;j<n;j++)
			{
				
              if(i==j)
				{
 suml=suml+arr[i][j];
				}
			}
			
		}
System.out.println(suml);

	for(int i=0;i<m;i++)
		{

			for(int j=0;j<n;j++)
			{
				
              if(i+j==m-1)
				{
 sumr=sumr+arr[i][j];
				}
			}
		
		}
			System.out.println(sumr);
	}
}
