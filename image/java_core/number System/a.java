import java.util.Scanner;
class a 
{
	public static void main(String[] args) 
	{
		int arr[]=new int[5];
		Scanner s=new Scanner(System.in);
		for (int i=0;i<arr.length ;i++ )
		{
			arr[i]=s.nextInt();       
		}
			for (int i=0;i<arr.length ;i++ )
		{
			System.out.println("index :"+i+"value"+arr[i]);
		}
	}
}
