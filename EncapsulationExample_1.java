/*
*Author: Victor Zuanazzi
*Date: 10/08/2018
*Tutorial: https://beginnersbook.com/2013/04/oops-concepts/
*/

//Scanner is necessary to receive input from the user.
import java.util.Scanner;

class EmployeeCount
{
	private int numOfEmployees = 0;
	public void setNoOfEmployees(int count)
	{
		numOfEmployees = count;
	}
	public double getNoOfEmployees()
	{
		return numOfEmployees;
	}
}

class UpdateEmployeeCount
{
	int newCountOfEmployees = 0;
	
	public int FromUser()
	{
		System.out.println("Please enter the current Employee Count");
		Scanner scanner = new Scanner (System.in);
		newCountOfEmployees = scanner.nextInt();
		scanner.close();
		return newCountOfEmployees;
	}
}

public class EncapsulationExample_1
{
	public static void main (String args[])
	{
		EmployeeCount obj = new EmployeeCount();
		UpdateEmployeeCount NewCount = new UpdateEmployeeCount();
		obj.setNoOfEmployees(5613);
		System.out.println("No Of Employees: "+(int)obj.getNoOfEmployees());
		obj.setNoOfEmployees(NewCount.FromUser());
		System.out.println("No Of Employees: "+(int)obj.getNoOfEmployees());
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	