/*
*Author: Victor Zuanazzi
*Date: 14/08/2018
*Tutorial: https://beginnersbook.com/2014/07/super-keyword-in-java-with-example/

*/

class Parentclass
{
	int a = 10;
    //Overridden method
    void display()
    {
		System.out.println("Parent class method: " + a);
    }
}
class Subclass extends Parentclass
{
	int a = 100;
    //Overriding method
    void display()
    {
		System.out.println("Child class method: " + a);
    }
    void printMsg()
    {
		//This would call Overriding method
		System.out.println("This would call Overriding method");
		display();
		//This would call Overridden method
		System.out.println("This would call Overridden method");
		super.display();
		//This  modifies parent a and call the Overridden method
		super.a = 20;
		System.out.println("This  modifies parent a and call the Overridden method");
		super.display();
    }
   
}

class SuperExample_5
{
	public static void main(String args[])
    {		
		Subclass obj= new Subclass();
		obj.printMsg(); 
    }
}