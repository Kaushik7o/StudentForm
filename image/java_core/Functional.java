@FunctionalInterface
interface Be 
{
	int add(int x);
}

class Functional{
	public static void main(String[] args)
	{
		Be k=x->(100+x);
		System.out.println(k.add(100));
	}

}

