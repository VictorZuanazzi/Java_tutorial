/*
*Author: Victor Zuanazzi
*Date: 11/08/2018
*Tutorial: https://beginnersbook.com/2013/04/oops-concepts/

*/
/*
class Employee
{
	String designation
	String college = "BeginnersBook"
	String wage
	String 
}
*/

class Teacher
{
	String designation = "Teacher";
	String college = "Beginnersbook";
	String mainSubject;
	String mainSubject()
	{
		mainSubject = "Defaut Subject";
		return mainSubject;
	}
	
	void does()
	{
		System.out.println("Teaching");
	}
}

public class ExamplePolimorphism extends Teacher
{
	String FirstClass = "Pitagoras' Theorem";
	//Dinamic override. 
	String mainSubject()
	{
		mainSubject = "math";
		return mainSubject;
	}
	void does()
	{
		System.out.println("Umas contas muito loucas!");
	}
	
	public static void main (String args[])
	{
		ExamplePolimorphism MathTeacher = new ExamplePolimorphism();
		MathTeacher.mainSubject();
		System.out.println(MathTeacher.college);
		System.out.println(MathTeacher.designation);
		System.out.println(MathTeacher.mainSubject);
		System.out.println(MathTeacher.FirstClass);
		MathTeacher.does();
	}
}