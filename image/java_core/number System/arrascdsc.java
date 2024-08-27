class arrascdsc
{
	public static void main(String[] args) 

	{
	
int a[]={1,2,3,4,5,6};
System.out.print("ascending");

for(int i=0;i<a.length-1;i++)
		{
	int temp;
      if(a[i]>a[i+1])
			{
            temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			}
          
			}
			for(int i=0;i<a.length;i++)
		{
        System.out.println(a[i]+" ");

		}

		System.out.print("descending");
for(int i=a.length;i>=0;i--)
		{
      System.out.print(a[i]+" ");

			}
	}
}
