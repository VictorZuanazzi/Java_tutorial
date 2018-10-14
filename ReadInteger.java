/*
Author: Victor Zuanazzi
Date: 08/08/2018
Tutorial: https://beginnersbook.com/2017/09/java-program-to-read-integer-value-from-the-standard-input/

*/
import java.util.Scanner;

public class ReadInteger {
	
    public static void main(String[] args) {

        /* This reads the input provided by user
         * using keyboard
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        
        // Displaying the number 
        System.out.println("The number entered by user: "+num);
    }
}