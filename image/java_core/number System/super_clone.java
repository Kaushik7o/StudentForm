class A 
{
int x;

A(int a)
{
	this.x=a;
}

A(A object)
	{
    this.x=object.x;
	}

public A copyObject()
{
	return new A(this);
}

}

class B extends A
{
	int y;

    B(int a,int b)
	{
     super(a);
	 this.y=b;
	}

	B(B object)
	{
   super(object.x);
   this.y=object.y;
	}

	public B copyObject()
	{
     return new B(this);
	}

	public String toString()
	{
    return x+" "+y;
	}
}
class super_clone
{

	public static void main(String [] args) 
	{
		A b=new B(100,200);
		A cloneB=b.copyObject();

		System.out.println(b.copyObject());
	}
}
