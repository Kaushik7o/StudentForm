class al 
{
	int x;
	String s;
	al(int x,String s)
	{
     this.s=s;
	 this.x=x;
	   System.out.println(x+" "+s);
	}
	al(al c)
	{
		this.x=c.x;
		this.s=c.s;
  System.out.println(this.x+" "+this.s);
	}
	public String toString()
	{
return x+" "+s;

	}

	public static void main(String[] args) 
	{
		
        al b=new al(10,"we");
		al e=new al(b);
		al d=e;
		System.out.println(d);


	}
}
