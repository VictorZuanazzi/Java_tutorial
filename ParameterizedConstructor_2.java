/*
*Author: Victor Zuanazzi
*Date: 12/08/2018
*Tutorial: https://beginnersbook.com/2013/03/constructors-in-java/

*/

class ParameterizedConstructor_2
{
	private int var;
	//no arg constructor.
	public ParameterizedConstructor_2()
	{
		this.var = 10;
	}
	//parameterized constructor.
	public ParameterizedConstructor_2(int num)
	{
		this.var = num;
	}
	
	public int getValue()
	{
		return var;
	}
	
	public static void main(String args[])
	{
		ParameterizedConstructor_2 obj = new ParameterizedConstructor_2();
		ParameterizedConstructor_2 obj2 = new ParameterizedConstructor_2(100);
		
		System.out.println("var is: " + obj.getValue());
		System.out.println("var is: " + obj2.getValue()); 
	}
}