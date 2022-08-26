package automationLearning;

public class switchCase {

	public static void main(String[] args) {
		
		// switch ( expression)
		//case value1:
		//System.out.println();
		//case value2:
		//System.out.println();
		//case value2:
	    //System.out.println();
		
		
		
		
		// Program -1 not using break statement 
		
		String birthplace = "Nepal";
		
		switch (birthplace) {
		
		case "Nepal":
			System.out.println("Kathmandu");
			
		case "Gandaki":
			System.out.println("Pokhara");
			
		case "Banapa":
			System.out.println("Dhulikhal");
			
		case "Naranghat":
			System.out.println("Chitwon");
			
		default:
			System.out.println("Incorrect city");
		}
		
		// Program -2 (switch with break)
		
		
		String levelString = "Expert";
		
		int level = 0;
		
		switch(levelString) {
		
		case "Beginner" : level = 1;
		break;
		
		case "Intermediate": level = 2;
		break;
		
		case "Expert": level = 3;
		break;
		
		
		default:level = 0;
		break;
		
		}
		System.out.println("Your Level is" + level);
		
		
		}
		
		
		
		
		
	}
	
	 
