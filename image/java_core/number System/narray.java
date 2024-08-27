import java.util.Scanner;
public class narray
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
				if(arr[i][j]<0)
				{
arr[i][j]=0;

    System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
}