import java.util.*;

class vector2 {
    public static void main(String[] args) {

       
        Vector<String> v = new Vector<String> ();
        v.add("a");
        v.add("b");
        v.add("d");

       
        System.out.println(v);

        
        Vector<String> v2 = new Vector<String>();
        v2.add("a");
        v2.add("b");
        v2.add("d");

     
        System.out.println(v2);

       
        String[] arr = new String[v.size()];
        String[] arr2 = new String[v2.size()];

        arr = v.toArray(arr);
        arr2 = v2.toArray(arr2);

		int l=arr.length;
		int l2=arr2.length;
   
   int count=0;
   if(l==l2)
		{
        for(int i=0;i<l;i++)
		{
        if(arr[i]==arr2[i])
			{
            count++;
			}
		}
		}

		if(count==l)
		{
         System.out.println("two vectors have same Elements");
		}
		else{
         System.out.println("two vectors are not same");
		}
		
        
    }
}
