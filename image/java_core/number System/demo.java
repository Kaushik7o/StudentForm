class RRR 
{
public int add(int r1,int r2)
	{
      return (r1+r2); 
	}
public int sub(int r1,int r2)
	{
      return (r1-r2); 
	}



}
public class demo
{
	public static void main(String[] args) 
	{
		System.out.println("print value");
       RRR a=new RRR();
	   a.add(10,20);
	   a.sub(22,40);
	}
}
