package automationLearning;


		
		
		class overload1 {
			
			public void display() {
				for(int i = 0 ; i < 10 ; i++) {
					System.out.print("hi");
				}
			}
			public void display(char symbol) {
				System.out.println("!");
				for(int i = 0 ; i < 10 ; i++) {
					System.out.print(symbol);
				}
			}
			
		

		
			
			
			
		


		public class OverloadingAndOverriding {

			public static void main(String[] args) {
			
				overload1 a1 = new overload1();
				a1.display('!');
				
			}
		}
		}
				
				




