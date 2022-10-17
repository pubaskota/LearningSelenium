package automationLearning;

public class Constructor2 {

	public static void main(String[] args) {
		
		
		        // what is constructor
				// Creating a object for class
				Add x = new Add();
				x.Addition();

			}

		}

		class Add{
			
			int x = 50;
			int y = 30;	
			
			public void Addition() {
				System.out.println(this.x + this.y);
			}
				
		}
	


