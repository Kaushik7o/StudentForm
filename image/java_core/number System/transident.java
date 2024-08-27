import java.util.Scanner;
public class transident
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int arr[][]=new int[m][n];
		int arr2[][]=new int[m][n];
		int arr3[][]=new int[m][n];
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
                
          arr2[i][j]=arr[j][i];
    System.out.print(arr[j][i]+" ");
				
			}
			System.out.println();
		}
int count=0;
	for(int i=0;i<m;i++)
		{
				

			for(int j=0;j<n;j++)
			{
            if((i==j && arr2[i][j]==1) || (i>j && arr2[i][j]==0) || (j>i && arr2[i][j]==0))
				{
                
                count=0;
				}
          else{

           count++;
		  }
    
				
			}
			System.out.println();
		}

if(count==0)
		{
	System.out.println("identity");
		}
		else if(count>0)
		{

   	System.out.println("not identity");
		}

	
}
}

