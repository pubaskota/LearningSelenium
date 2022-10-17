package automationLearning;

public class Inharintance {

	public static void main(String[] args) {
		
		class Father {
			String fN;
			String lN;
			
			Father(String fN,String lN){
				this.fN = fN;
				this.lN = lN;
			}

			public void displayName(String greet){
					System.out.println(greet + this.fN + this.lN);
			}
			
		}

		class Son1 extends Father {
		String sN;

		Son1(String fN,String lN, String sN){
			super(fN,lN);
			this.sN = sN;
		}

		public void displayName(String greet){
				System.out.println(greet + this.sN + this.lN);
		}

		}

		class Daughter extends Father {
		String dN;

		Daughter(String fN,String lN, String dN){
			super(fN,lN);
			this.dN = dN;
		}

		public void displayName(String greet){
				System.out.println(greet + this.dN + this.lN);
		}

		
	
	
		 
	
		}
	
}
}