import java.util.Scanner;
class emp4 
{
	private int empId;
	private String employee;
	private String empAdd;


public void setValue(int a,String b,String c){
	empId=a;
	employee=b;
	empAdd=c;
}
public String getValue1(){
	return empId+"";
}
public String getValue2(){
	return employee;
}
public String getValue3(){
	return empAdd;
}
}
class osp
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		String y=s.nextLine();
		String z=s.nextLine();

		emp4 em=new emp4();
		em.setValue(x,y,z);
		String r=em.getValue1();
		String h=em.getValue2();
		String j=em.getValue3();
		System.out.println(r);
		System.out.println(h);
		System.out.println(j);
	}
}
