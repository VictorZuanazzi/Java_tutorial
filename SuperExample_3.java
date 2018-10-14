/*
*Author: Victor Zuanazzi
*Date: 13/08/2018
*Tutorial: https://beginnersbook.com/2014/07/super-keyword-in-java-with-example/

*/

class Parentclass
{
   //no-arg constructor
   Parentclass()
   {
		System.out.println("no-arg constructor of parent class");
   }
   //arg or parameterized constructor
   Parentclass(String str)
   {
		System.out.println("parameterized constructor of parent class " + str);
   }
}
class Subclass extends Parentclass
{
   Subclass()
   {
       /* super() must be added to the first statement of constructor 
		* otherwise you will get a compilation error. Another important 
		* point to note is that when we explicitly use super in constructor
		* the compiler doesn't invoke the parent constructor automatically.
		*/
		System.out.println("Constructor of no arg child class");

   }
   Subclass(String what)
   {
       /* super() must be added to the first statement of constructor 
		* otherwise you will get a compilation error. Another important 
		* point to note is that when we explicitly use super in constructor
		* the compiler doesn't invoke the parent constructor automatically.
		*/
		super(what);
		System.out.println("Constructor of parameterized child class");

   }
   void display()
   {
		System.out.println("Hello");
   }
   
}

class SuperExample_3
{
	public static void main(String args[])
	{		
		Subclass obj= new Subclass();
		obj.display();	 
		Subclass obj1 = new Subclass("Hahaha");
		obj1.display();
    }
  
}