/*
*Author: Victor Zuanazzi
*Date: 11/08/2018
*Tutorial: https://beginnersbook.com/2013/03/constructors-in-java/

*/

public class ParameterizedConstructor
{
	int empId;
	String empName;
	//Parameterized Constructor with two parameters.
	ParameterizedConstructor(int id, String name)
	{
		this.empId = id;
		this.empName = name;
	}
	void info()
	{
		System.out.println("Id: "+ empId + " Name: " + empName);
	}
	
	public static void main (String args[])
	{
		ParameterizedConstructor obj1 = new ParameterizedConstructor(10245, "Chupadora");
		ParameterizedConstructor obj2 = new ParameterizedConstructor(92232, "Bumbum guloso");
		
		obj1.info();
		obj2.info();
	}
}