/*
*Author: Victor Zuanazzi
*Date: 11/08/2018
*Tutorial: https://beginnersbook.com/2013/04/oops-concepts/

*/
//abstract class
abstract class Animal{
   //abstract method
   public abstract void animalSound();
}
public class Dog extends Animal{

   public void animalSound(){
	System.out.println("Woof");
   }
   public static void main(String args[]){
	Animal obj = new Dog();
	obj.animalSound();
   }
}