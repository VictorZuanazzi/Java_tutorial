/*
*Author: Victor Zuanazzi
*Date: 09/08/2018
*Tutorial: https://beginnersbook.com/2017/08/java-break-statement/
*/

public class BreakExample 
{

   public static void main(String args[])
   {
	for (int j=0; j<=6; j++)
	{
        if (j==4)
			break;

        System.out.print(j+" ");
	}
   }
}