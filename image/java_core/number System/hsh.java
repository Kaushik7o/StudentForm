class hsh
{
	int roll;
    String name;
    String i_d;
	hsh(int r,String n,String id)
	{
     roll=r;
	 name=n;
	 i_d=id;

	}
	
public int hashCode(){
	
		System.out.println(toString());
		return roll;
	
}
public String toString()
	{
     return name+" "+roll+" "+i_d;

	}
	
	public static void main(String[] args) 
	{
	hsh a=new hsh(10,"kaus","123");
a.hashCode();
hsh b=new hsh(11,"pralin","12d");
b.hashCode();
hsh c=new hsh(102,"kk","12t");
c.hashCode();
	}
}
