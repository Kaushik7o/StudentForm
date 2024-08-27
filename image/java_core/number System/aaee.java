class a
{
	int x;
	int y;
a(int x,int y)
	{
     this.x=x;
	 this.y=y;
	}
	void print()
	{
     System.out.println(x+" "+y);
	}

}

class aaee extends a
{
	int s;
	int b;
	aaee(int s,int b)
	{
		super(s,b);
     super.x=this.s=s;
	 super.y=this.b=b;
	 
	}
	public static void main(String[] args) 
	{
     aaee d=new aaee(10,100);
	 d.print();
	}
}
