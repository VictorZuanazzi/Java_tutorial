/*
Author: Victor Zuanazzi
Date: 08/08/2018
Tutorial: https://beginnersbook.com/2017/08/operators-in-java/
*/
public class AssignmentOperatorDemo {
   public static void main(String args[]) {
      int num1 = 10;
      int num2 = 20;

      num2 = num1;
      System.out.println("= Output: "+num2);

      num2 += num1;
      System.out.println("+= Output: "+num2);
	      
      num2 -= num1;
      System.out.println("-= Output: "+num2);
	      
      num2 *= num1;
      System.out.println("*= Output: "+num2);
	      
      num2 /= num1;
      System.out.println("/= Output: "+num2);
	      
      num2 %= num1;
      System.out.println("%= Output: "+num2);
   }
}