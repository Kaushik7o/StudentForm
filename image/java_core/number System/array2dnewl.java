import java.util.Scanner;
class array2dnewl
{
	public static void main(String[] args) 
	{
		int [][]a=new int[3][3];
		
		System.out.println("print matrix");
		Scanner sc= new Scanner(System.in);

		for(int i=0;i<3;i++){

			for(int j=0;j<3;j++){

			a[i][j]=sc.nextInt();
			}
		
		System.out.println("given matrix is:");
	}
	     for(int i=0;i<3;i++){
			 for(int j=0;j<3;j++){
            System.out.print(a[i][j]+"");

			 }
			 System.out.println("");
}
	}
}