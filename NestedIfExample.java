/*
Author: Victor Zuanazzi
Date: 08/08/2018
Tutorial: https://beginnersbook.com/2017/08/if-else-statement-in-java/
*/

public class NestedIfExample {

   public static void main(String args[]){
        int num=70;
	if( num < 100 ){ 
           System.out.println("number is less than 100"); 
           if(num > 50){
	      System.out.println("number is greater than 50");
	   }
	}
   }
}