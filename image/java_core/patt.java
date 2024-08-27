class patt 
{
	public static void main(String[] args) 
	{
		int x=1;
		int y=5;
		int t1,t2,r1,r2;
		for(int i=5;i>=1;i--)
		{
			
		t1=x;
		t2=y;
		r1=i;
		r2=i+1;
for(int j=5;j>=i;j--)
			{
               if((i+j)%2==0){
				System.out.print(t1);
			   }
			   else{
                	System.out.print(t2);
			   }
			t1=t1-r1++;
			t2=t2-r2++;
			}
			y=y+i-1;
			x=x+i;
		System.out.println();
		}
	}
}
