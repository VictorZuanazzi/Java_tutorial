/*
*Author: Victor Zuanazzi
*Date: 09/08/2018
*Tutorial: https://beginnersbook.com/2015/03/while-loop-in-java-with-examples/
*/

class WhileLoopExample3
{
	public static void main (String args[])
	{
		int arr[]={2,11,45,9};
        //i starts with 0 as array index starts with 0 too
		int i=0;
        while(i< arr.length)
		{
             System.out.println(arr[i]);
             i++;
        }
	}
}