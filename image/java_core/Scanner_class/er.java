import java.util.Scanner;
class er 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int phy = sc.nextInt();
		int che = sc.nextInt();
		int math =sc.nextInt();
        int bio =sc.nextInt();
		if(phy>35 && che>35 && bio>35){
			System.out.println("pass");
		}else{
			System.out.println("fail");

	}
}
}