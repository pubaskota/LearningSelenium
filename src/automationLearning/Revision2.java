package automationLearning;


	
	
	
	class PersonO {

		
		int age;
		String fullName;
		static String country  = "USA";
		
		public PersonO(int ag , String fn){
			this.age = ag;
			this.fullName = fn;
		}
		
		public void talk() {
			System.out.println("I am talk all the time");
			System.out.println(this.fullName);
		}
		
		public static void called() {
			System.out.println("I can be called method");
		}
		
		
		
		
	}




	public class Revision2 {


		public static void main(String[] args) {
			
			// with constructor
			//PersonO poonamb = new PersonO();
			//PersonO poonams = new PersonO();
			
			// with call constructor
			PersonO poonamb = new PersonO(34,"Poonam P");
			PersonO poonams = new PersonO(34,"Poonam S");
			
			System.out.println(poonamb.age);
			System.out.println(poonams.fullName);
			
			poonams.talk();
			PersonO.called();
			System.out.println(PersonO.country);
			
			

	

	}

}
