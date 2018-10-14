/*
*Author: Victor Zuanazzi
*Date: 11/08/2018
*Tutorial: https://beginnersbook.com/2013/04/oops-concepts/
NOT WORKING
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

public class MathTeacher_1 extends Teacher
{
	String FirstClass = "Pitagoras' Theorem";
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
		MathTeacher_1 obj = new MathTeacher_1();
		obj.mainSubject();
		System.out.println(obj.college);
		System.out.println(obj.designation);
		System.out.println(obj.mainSubject);
		System.out.println(obj.FirstClass);
		obj.does();
	}
}