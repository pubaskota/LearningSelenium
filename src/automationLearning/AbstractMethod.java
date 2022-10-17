package automationLearning;

abstract class Animals1 {
	
	// abstract method , they will not have body 
	// a simple  class can have abstract as will as normal method
	// make class abstract if there is one abstract method
	
		// abstract 
		abstract void eat();
		
		// normal method
		public void gives() {
			System.out.println("Gives us milk");
		}
	
}

class Cow extends Animals1 {
	
	public void eat() {
		System.out.println("I like to eat grass ");
	}
	
	
}

public class AbstractMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cow b = new Cow();
		b.gives();
		b.eat();

	}











}
