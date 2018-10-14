/*
Author: Victor Zuanazzi
Date: 08/08/2018
Tutorial: https://beginnersbook.com/2017/08/if-else-statement-in-java/
*/

public class IfElseIfExample{
	public static void main (String args[]) {
		int num = 1234;
		if (num < 100 && num >=10){
			System.out.println("Its a two digit number");
		}
		else if (num <1000 && num >= 100){
			System.out.println("Its a three digit number");
		}
		else if (num<10000 && num >= 1000){
			System.out.println("Its a four digit number");
		}
		else {
			System.out.println("number out of range: 10 to 9999");
		}
	}
}