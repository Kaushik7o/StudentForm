import java.util.*;
@FunctionalInterface
interface Be 
{
	int getLength(String x);
}

class Functional2{
	public static void main(String[] args)
	{
		Be b=new Be()
		{
       public int getLength(String s){

         return s.length();
		}
	};

	int m=b.getLength("Kaushik");
	System.out.println(m);


    Be b1=getLength(String s)->
		{
         return s.length();
		
        }  
		System.out.pritnln(b1.getLength("ABC"));


     Be b2=(s)->s.length();
	 System.out.println(b2.getLength("DEF"));

	}
}
