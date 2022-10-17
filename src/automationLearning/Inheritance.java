
package automationLearning;



	
		
		class Bird {
			// field
			String name;
			
			// method
			public void eat() {
				System.out.println("I can fly ");
			}
			
		}

		//  class
		class Dog extends Bird {
			
			
			// method
			public void display() {
				System.out.println("My name is "+name);
			}
			
			
		}


		public class Inheritance {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Dog sheru = new Dog();
				sheru.name = "shera";
				sheru.eat();
				sheru.display();
			}
			
		}



	



