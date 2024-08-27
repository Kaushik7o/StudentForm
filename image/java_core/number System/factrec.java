class factrec 
{
	int fact(int n)
	{
    if(n==0 || n==1)
		{
        return 1;
		}
		else{
         return n*fact(n-1);
		}
	}
	public static void main(String[] args) 
	{
		int f=1;
	factrec c=new factrec ();
	int num=5;
	for(int i=1;i<=num;i++)
		{
		f=c.fact(i);
		System.out.println(f);
		}
		

	}
}
