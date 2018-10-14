/*
*Author: Victor Zuanazzi
*Date: 14/08/2018
*Tutorial: https://beginnersbook.com/2013/05/constructor-overloading/
NOT WORKING
*/

class StudentData
{
	private int stuID;
	private String StuName;
	private int stuAge;
	
	//no-args constructor
	StudentData()
	{
		stuID = 100;
		stuName = "New Student";
		stuAge = 18;
	}
	//Parameterized constructor overloading
	StudentData(int num1, String str, int num2)
	{
		stuID = num1;
		stuAge = num2;
		stuName = str;
	}
	
	//Getter and setter methods
	public int getStuID()
	{
		return stuID;
	}
	public void setStuID(int IDnum)
	{
		this.stuID = IDnum;
	}
	
	public String getStuName()
	{
		return stuName;
	}
	public void setStuName(String str)
	{
		this.stuName = str;
	}
	public int getStuAge()
	{
		return stuAge;
	}
	public void setStuAge(int age)
	{
		this.stuAge = age;
	}
}
public class ConstructorOverloading
{
	//This object creation would call the default constructor
    StudentData myobj = new StudentData();
    /* System.out.println("Student Name is: "+myobj.getStuName());
    System.out.println("Student Age is: "+myobj.getStuAge());
    System.out.println("Student ID is: "+myobj.getStuID()); */

    /*This object creation would call the parameterized
 	* constructor StudentData(int, String, int)*/
    StudentData myobj2 = new StudentData(555, "Chaitanya", 25);
    // System.out.println("Student Name is: "+myobj2.getStuName());
    // System.out.println("Student Age is: "+myobj2.getStuAge());
    // System.out.println("Student ID is: "+myobj2.getStuID());
}
