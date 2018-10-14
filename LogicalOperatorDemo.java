/*
Author: Victor Zuanazzi
Date: 08/08/2018
Tutorial: https://beginnersbook.com/2017/08/operators-in-java/
*/
public class LogicalOperatorDemo {
   public static void main(String args[]) {
      boolean b1 = true;
      boolean b2 = false;

      System.out.println("b1 && b2: " + (b1&&b2));
      System.out.println("b1 || b2: " + (b1||b2));
      System.out.println("!(b1 && b2): " + !(b1&&b2));
   }
}