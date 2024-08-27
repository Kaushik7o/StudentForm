import java.util.*;

public class bouncy{
   //Main method
   public static void main(String args[]){   

      //initialized a number
      int num = 6549;
      
      //printing the given number
      System.out.println("Given number: "+num);

      // Checks if the number is less than 100
      if(num<100){
         System.out.println("The number is not a bouncy number");
      }

      // Boolean values to check if the digits are sorted
      boolean increasing = true, decreasing = true;

      // Storing the number in a temporary variable and storing the first digit
      int temp = num, prev = num % 10;

      // Loops until the number becomes zero
      while(temp != 0){

         // Checks if it follows increasing order or not
         if(temp%10>prev){
            increasing = false;
            break;
         }

         // Gets the last digit of the number
         prev = temp % 10;

         // Removes the last digit
         temp /= 10;
      }

      // Resets the value
      temp = num;
      prev = num % 10;

      while(temp != 0){
         // Checks if it follows decreasing order or not
         if(temp%10<prev){
            decreasing = false;
            break;
         }

         // Gets the last digit of the number
         prev = temp % 10;

         // Removes the last digit
         temp /= 10;
      }

      // Prints the result
      if(!increasing&&!decreasing)
         System.out.println("The number is a bouncy number");
      else
         System.out.println(", The number is not a bouncy number");
   }
}
