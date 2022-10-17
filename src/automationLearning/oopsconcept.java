package automationLearning;



public class oopsconcept {

	public static void main(String[] args) {
		
		persons5 poonam = new persons5(40,52,4);
		System.out.println(poonam.age);
		System.out.println(poonam.weight);
		System.out.println(poonam.height);
		
	
		
		persons5 sharma = new persons5(50,40,4);
		System.out.println(sharma.age);
		System.out.println(sharma.weight);
		System.out.println(sharma.height);
		
		System.out.println("The person is from  " + sharma.country);
		System.out.println(" The second person is from  " + poonam.country);
		
}
	
}
