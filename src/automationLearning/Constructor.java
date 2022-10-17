package automationLearning;

public class Constructor {

	public static void main(String[] args) {
		
		
		        // with out param
		
				Sub b = new Sub();
				
				// with param
				
				Mul c = new Mul(12,13);
				c.Multiplication();
				
				// overloaded
				
				Cal x1 = new Cal();
				Cal x2 = new Cal(8);
				Cal x3 = new Cal(12,34);
				x3.Greet();
				
				

			}

		}

		class Sub {
			
			int a = 10;
			int b = 5;
			
			// constructor with no parameter
			
			Sub(){
				System.out.println("Subtraction constructor is called");
			}
			
			public void Substraction() {
				System.out.println(this.a - this.b);
			}
			
		}

		// Constructor with parameter

		class Mul {
			int a1 ;
			int a2;
			
			Mul(int a , int b){
				this.a1 = a;
				this.a2 = b;
			}
			
			public void Multiplication() {
				System.out.println(this.a1 * this.a2);
			}
			
		}

		//Overloading the constructor 


		class Cal {
			
			Cal(){
				System.out.println("Constructor with no param called");
			}
			
			Cal(int a){
				System.out.println("Constructor with one param called");
			}
			
			Cal(int a , int b){
				System.out.println("Constructor with two param called");
			}
			
			public void Greet() {
				System.out.println("Hello Everone");
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			// Class fields (property and methods)
			
			// Greet is method
			// Property 
			// Constructor we used to set class properties or execute some code at time of 
			// object creation
		


		}


