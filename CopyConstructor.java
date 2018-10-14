/*
*Author: Victor Zuanazzi
*Date: 15/08/2018
*Tutorial: https://beginnersbook.com/2013/03/constructors-in-java/
*/

class CopyConstructor
{
	String web;
	CopyConstructor (String w)
	{
		web = w;
	}
	CopyConstructor (CopyConstructor obj)
	{
		/* This is the Copy Constructor, it 
		 * copies the values of one object
		 * to the another object (the object
		 * that invokes this constructor)
		 */
		web = obj.web;
	}
	void display()
	{
		System.out.println("Website: " + web);
	}
	
	public static void main (String args[])
	{
		CopyConstructor obj1 = new CopyConstructor("BeginnersBook");
		/* Passing the object as an argument to the constructor
		* This will invoke the copy constructor
		*/
		CopyConstructor obj2 = new CopyConstructor(obj1);
		obj1.display();
		obj2.display();
	}
}