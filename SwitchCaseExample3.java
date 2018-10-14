/*
*Author: Victor Zuanazzi
*Date: 08/08/2018
*Tutorial: https://beginnersbook.com/2017/08/java-switch-case/
*/
public class SwitchCaseExample3 {
	public static void main (String args[]){
		int num = 0;
		int a = 1;
		int b = 2;
		switch (num)
		{
			case 0:
				System.out.println("Case1: Value is:"+num);
				num +=a;
			case 2:
				System.out.println("Case2: Value is:"+num);
				num +=b;
			case 3:
				System.out.println("Case3: Value is:"+num);
			default:
				System.out.println("Default: Value is:"+num);
		}
	}
}