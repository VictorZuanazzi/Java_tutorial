/*
*Author: Victor Zuanazzi
*Date: 08/08/2018
*Tutorial: https://beginnersbook.com/2017/09/java-program-to-check-vowel-and-consonant-using-switch-case/
*/

import java.util.Scanner;
class IsVowel
{
	public static void main(String[] arg)
	{
		boolean isVowel = false;
		Scanner scanner = new Scanner (System.in);
		char ch = scanner.next().charAt(0);
		scanner.close();
		switch(ch)
		{
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
			case 'A' :
			case 'E' :
			case 'I' :
			case 'O' :
			case 'U' : isVowel = true;
		}
		if (isVowel == true)
		{
			System.out.println(ch+ " is a Vowel");
		}
		else
		{
			if ((ch>= 'a' && ch <= 'z') || (ch >= 'A'&& ch<= 'Z'))
				System.out.println(ch+ " is a Consonant");
			else
				System.out.println("Input is not an aphabet");
		}
	}
}