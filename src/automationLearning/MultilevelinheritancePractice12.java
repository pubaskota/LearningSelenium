package automationLearning;


	
	
	

	class GrandFather12 {
		
		String firstName;
		String lastName;
		
		// constructor
		GrandFather12(String firstName , String lastName){
			this.firstName = firstName;
			this.lastName = lastName;
		}
		public void displayName() {
			System.out.println("This is from GrandFather Class : " + this.firstName + " "+ this.lastName );
		}
		
	}

	class Father12 extends GrandFather12 {
		
		String fFirstName;
		
		Father12(String firstName ,String lastName ,String fFirstName){
			super(firstName,lastName);
			this.fFirstName = fFirstName;
		}
		@Override
		public void displayName() {
			System.out.println("This is from Father Class :  " + this.fFirstName + " "+ this.firstName + " "+this.lastName);
			super.displayName();
		}
		
	}
	// Class son 

	class Son extends Father12 {
		String sN;
		
		Son(String firstName, String lastName, String sN){
			super(firstName,lastName, sN);
			this.sN = sN;
		}

		public void displayName(String greet){
				System.out.println(greet + this.sN + this.lastName);
		}
		
      
		
	}
	
	

	public class MultilevelinheritancePractice12 {

		public static void main(String[] args) {
			
			
			GrandFather12 grandFather = new GrandFather12("Hari","Baskota");
			grandFather.displayName();
			
			
			Father12 father = new Father12("Hari","Baskota","Sharma");
		    father.displayName();
			
			Son son = new Son("Hari","Baskota","Sharma");
			son.displayName();
			
			
		}

	}




