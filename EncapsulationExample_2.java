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

class ScanShit
{
	Scanner scanner = new Scanner (System.in);
	public int Int()
	{
		int number;
		number = scanner.nextInt();
		return number;
	}
	
	public void Stop()
	{
		scanner.close();
	}
}

class UpdateEmployeeCount
{
	int newCountOfEmployees = 0;	
	public int FromUser()
	{
		ScanShit Scan = new ScanShit();
		System.out.println("Please enter the current Employee Count");
		newCountOfEmployees = Scan.Int();
		return newCountOfEmployees;
	}
}

class PrintStuff
{
	public void Options()
	{
		System.out.println("Good to have you back!");
		System.out.println("Please select an option =)");
		System.out.println("0 : Exit, in case you are already done with us!");
		System.out.println("1 : See the number of employees.");
		System.out.println("2 : To manually update the number of employees.");
		System.out.println("3 : Increment the number of employees, in case you hired someone.");
		System.out.println("4 : Decrement the number of employees, in case someone has left.");
	}
	public void NumOfEmployees(int number)
	{
		System.out.println("No Of Employees: "+number);
	}
}

public class EncapsulationExample_2
{
	public static void main (String args[])
	{
		EmployeeCount obj = new EmployeeCount();
		obj.setNoOfEmployees(5613);
		UpdateEmployeeCount NewCount = new UpdateEmployeeCount();
		PrintStuff Print = new PrintStuff();
		ScanShit Scan = new ScanShit();
		int option;
		do
		{
			Print.Options();
			option = Scan.Int();
			switch (option)
			{
				case 1 :
					
					Print.NumOfEmployees((int)obj.getNoOfEmployees());
					break;
				case 2 :
					obj.setNoOfEmployees(NewCount.FromUser());
					break;
			}
			// Always print the number of Employees to feedback the changes made by the user.
			if (option != 1)
			{
				Print.NumOfEmployees((int)obj.getNoOfEmployees());
			}
		}while (option != 0);
		Scan.Stop();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	