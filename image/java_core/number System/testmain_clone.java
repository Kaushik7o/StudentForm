class test
{
	int x,y;
    test()
	{
    x=10;
	y=10;
	}
}
class testmain_clone 
{
	public static void main(String[] args) 
	{
	test ob1=new test();
	System.out.println(ob1.x+" "+ob1.y);
	test ob2=ob1;
	ob2.x=100;
	System.out.println(ob1.x+" "+ob1.y);
	System.out.println(ob2.x+" "+ob2.y);
	}
}
