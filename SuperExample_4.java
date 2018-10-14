/*
*Author: Victor Zuanazzi
*Date: 14/08/2018
*Tutorial: https://beginnersbook.com/2014/07/super-keyword-in-java-with-example/

*/

class Parentclass
{
   //Overridden method
   void display()
    {
		System.out.println("Parent class method");
    }
}
class Subclass extends Parentclass
{
   //Overriding method
   void display()
    {
		System.out.println("Child class method");
    }
   void printMsg()
    {
		//This would call Overriding method
		System.out.println("This would call Overriding method");
		display();
		//This would call Overridden method
		System.out.println("This would call Overridden method");
		super.display();
    }
   
}

class SuperExample_4
{
	public static void main(String args[])
    {		
		Subclass obj= new Subclass();
		obj.printMsg(); 
    }
}