/*
*Author: Victor Zuanazzi
*Date: 15/08/2018
*Tutorial: https://beginnersbook.com/2013/03/constructors-in-java/
*/

class CopyConstructor2
{
	String web;
	float profit;
	CopyConstructor2 (String w, float p)
	{
		web = w;
		profit = p;
	}
	CopyConstructor2 (CopyConstructor obj)
	{
		/* This is the Copy Constructor, it 
		 * copies the values of one object
		 * to the another object (the object
		 * that invokes this constructor)
		 */
		web = obj.web;
		profit = 1.1*obj.profit;
	}
	void display()
	{
		System.out.println("Website: " + web);
		System.out.println("Profit: " + profit);
	}
	
	public static void main (String args[])
	{
		CopyConstructor2 obj1 = new CopyConstructor2("BeginnersBook", 100.0);
		/* Passing the object as an argument to the constructor
		* This will invoke the copy constructor
		*/
		CopyConstructor2 obj2 = new CopyConstructor2(obj1);
		obj1.display();
		obj2.display();
	}
}