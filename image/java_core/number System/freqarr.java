import java.util.Scanner;
class freqarr
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

int even=0;
int odd=0;
System.out.println("output for first array");
        for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
           if(a[i][j]%2==0)
				{
                 even++;
				}
				else{
                 odd++;
				}

			}

		}
		System.out.println("freq of even is:"+even+"\nodd is:"+odd);
	}
}
