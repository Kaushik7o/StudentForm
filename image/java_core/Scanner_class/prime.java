package test;
import java.util.Scanner;
class prime{
 public static void main(String[]args){
	 Scanner sc=new Scanner(System.in);
  Sytem.out.println("Enter your number");
  int num=sc.nextInt();
  int count= 0;
  for(int i=1;i<=num;i++){
  if(num%i==0){
  count++;
  }
}
if(count==2){
System.out.println("prime");
}else{
System.out.println("not prime");
  }
 }
}
