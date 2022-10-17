package automationLearning;


	
	
	
	class Animals {
		// method
		public void eat() {
			System.out.println("I  eat all day");
		}
		
	}

	class cat extends Animals {
		
		@Override
		public void eat() {
			System.out.println("I am eating my own food that is Cat's food");
			super.eat();
		}
		
		
		
	}


	public class Inheritance3 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			cat kitten = new cat();
			kitten.eat();
			
		}

	}
	


	

