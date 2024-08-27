import java.util.Scanner;  
  
class buzz{   

  static boolean checkBuzz(int num)   
  {   
    if(num % 10 == 7 || num % 7 == 0)  
      return true;  
    else  
      return false;  
  }   

  public static void main(String args[])   
  {     
    int n;  
    Scanner sc=new Scanner(System.in);  
    n = sc.nextInt();  
    if (checkBuzz(n))   
      System.out.println(n + " is a Buzz number");   
    else  
      System.out.println(n + " is not a Buzz number");   
    }   
}
