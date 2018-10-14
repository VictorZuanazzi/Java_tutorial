/*
Author: Victor Zuanazzi
Date: 08/08/2018
Tutorial: https://beginnersbook.com/2017/08/operators-in-java/
*/

public class ArithmeticOperatorDemo_1 {
   public static void main(String args[]) {
      int num1 = 100;
      int num2 = 20;

      System.out.println("num1 + num2: " + (num1 + num2) );
	  System.out.println((num1) + " + " +(num2) + "= " + (num1 + num2) );
      System.out.println("num1 - num2: " + (num1 - num2) );
      System.out.println("num1 * num2: " + (num1 * num2) ); 
      System.out.println("num1 / num2: " + (num1 / num2) );
      System.out.println("num1 % num2: " + (num1 % num2) );
   }
}