/*
*Author: Victor Zuanazzi
*Date: 09/08/2018
*Tutorial: https://beginnersbook.com/2013/04/oops-concepts/

*/

public class ConstructorExample
{
	int age;
	String name;
	
	//Defaut constructor, it takes no parameters.
	ConstructorExample()
	{
		this.name = "Chaitanya";
		this.age = 30;
	}
	
	//Parameterized constructor, it takes parameters.
	ConstructorExample(String n, int a)
	{
		this.name = n;
		this.age = a;
	}
	
	public static void main(String args[])
	{
		ConstructorExample obj1 = new ConstructorExample();
		ConstructorExample obj2 = new ConstructorExample("Steve", 56);
		
		System.out.println(obj1.name + " " +obj1.age);
		System.out.println(obj2.name + " " + obj2.age);
	}
}