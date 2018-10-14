/*
*Author: Victor Zuanazzi
*Date: 09/08/2018
*Tutorial: https://beginnersbook.com/2013/04/oops-concepts/

*/

public class ClassOOPWebsite {
   //fields (or instance variable)
   String webName;
   int webAge;

   // constructor
   ClassOOPWebsite(String name, int age)
   {
      this.webName = name;
      this.webAge = age;
   }
   public static void main(String args[]){
      //Creating objects
      ClassOOPWebsite obj1 = new ClassOOPWebsite("beginnersbook", 5);
      ClassOOPWebsite obj2 = new ClassOOPWebsite("google", 18);

     //Accessing object data through reference
     System.out.println(obj1.webName+" "+obj1.webAge);
     System.out.println(obj2.webName+" "+obj2.webAge);
   }
}