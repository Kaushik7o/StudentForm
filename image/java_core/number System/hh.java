abstract class a 
{
private int x;//2
private int y;//10

	public a(int x,int y)
	{
  this.x=x;
  this.y=y;
	}

	public int getx()
	{
    return x;
	}
	public int gety()
	{
     return y;
	}

	public abstract void data1();
    public abstract void data2();
	public void call()
	{
		
		
    for (int n=x;n<=y ;n++ )
    {
		int d=2;
		int t1=n;
		System.out.print("the prime factor of"+t1+"is : ");
		while(t1!=1)
		{
			
		if(t1%d==0)
		{
         
		 System.out.print(d+" ");
		 t1=t1/d;
		}
		else{
         d++;
		}
       
		}
		 System.out.println();
    }

	}
}
class b extends a
{

public b(int a,int b)
	{
    super(a,b);
	}

public void data1()
	{
System.out.println(getx());
	}

public void data2()
	{
System.out.println(gety());
	}




	
}



class hh
{
public static void main(String[] args) 
	{
    
  b t=new b(2,10);   
	t.data1();
	t.data2();
    t.call();
	}

}