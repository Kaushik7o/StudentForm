import java.util.*;

class vector {
    public static void main(String[] args) {

       
        Vector<String> v = new Vector<String> ();
        v.add("a");
        v.add("b");
        v.add("c");

      
        System.out.println(v);

        
        Vector<String> v2 = new Vector<String>();
        v2.add("1");
        v2.add("2");
        v2.add("3");

        System.out.println(v2);

       
        String[] arr = new String[v.size()];
        String[] arr2 = new String[v2.size()];

        arr = v.toArray(arr);
        arr2 = v2.toArray(arr2);

		int l=arr.length;
		int l2=arr2.length;
       int l3=l+l2;
	   String[] arr3=new String[l3];
       
       for(int i=0;i<l;i++)
		{
         arr3[i]=arr[i];
		}

        for(int i=l+0;i<l3;i++)
		{
         arr3[i]=arr2[i-l];
		}

		for(int i=0;i<l3;i++)
		{
			System.out.print(arr3[i]+" ");
		}
        System.out.println();
		  Vector<String> v3 = new Vector<String> (Arrays.asList(arr3));
		  System.out.println(v3);
    }
}

