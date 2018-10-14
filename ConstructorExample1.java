/*
*Author: Victor Zuanazzi
*Date: 11/08/2018
*Tutorial: https://beginnersbook.com/2013/03/constructors-in-java/

*/

public class ConstructorExample1 {
   String name;
   //Constructor
   ConstructorExample1(){
      this.name = "BeginnersBook.com";
   }
   public static void main(String[] args) {
      ConstructorExample1 obj = new ConstructorExample1();
      System.out.println(obj.name);
   }
}