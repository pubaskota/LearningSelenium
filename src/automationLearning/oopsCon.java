package automationLearning;

public class oopsCon {
	
	
	
	class persons56 {
		
		int weight;
		int age;
		int height;
		String country = "Nepal";
		
		// constructor
		persons56(int age , int weight , int hight){
			this.age = age;
			this.weight = weight;
			this.height = hight;	
		}
		
		public static void talk() {
			System.out.println("How Are You?");
		}
		
		public static void Sleep() {
			System.out.println("Sweet Deram");
		}
		
		
	}
	public class oopscon {

		public static void main(String[] args) {
			
			persons5 poonam = new persons5(40,52,4);
			System.out.println(poonam.age);
			System.out.println(poonam.weight);
			System.out.println(poonam.height);
			
		
			
			persons5 sharma = new persons5(40,52,4);
			System.out.println(sharma.age);
			System.out.println(sharma.weight);
			System.out.println(sharma.height);
			
			System.out.println(sharma.country);
			System.out.println(poonam.country);
			
			
			
			
		

		
		
		

	}

	}
}

