/*
*Author: Victor Zuanazzi
*Date: 08/08/2018
*Tutorial: https://beginnersbook.com/2017/08/java-switch-case/
*/
public class SwitchCaseExample2 {
	public static void main (String args[]){
		int num = 0;
		switch (num+2)
		{
			case 1:
				System.out.println("Case1: Value is:"+num);
				break;
			case 2:
				System.out.println("Case2: Value is:"+num);
				break;
			case 3:
				System.out.println("Case3: Value is:"+num);
				break;
			default:
				System.out.println("Default: Value is:"+num);
		}
	}
}