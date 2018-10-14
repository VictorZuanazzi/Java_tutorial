/*
*Author: Victor Zuanazzi
*Date: 13/08/2018
*Tutorial: https://beginnersbook.com/2014/07/super-keyword-in-java-with-example/

*/

class SuperClass
{
	int num = 100;
}

class SubClass extends SuperClass
{
	int num =110;
	void printSuperClass()
	{
		//Note that instead of writing num we are writing super.num in the
		//print statement. This refers to the num variable of Superclass.
		System.out.println("SuperClass: " + super.num);
	}
	void printSubClass()
	{
		System.out.println("SubClass: " + num);
	}
}

class SuperExample
{
	public static void main (String args[])
	{
		SubClass obj = new SubClass();
		
		obj.printSuperClass();
		obj.printSubClass();
	}
}