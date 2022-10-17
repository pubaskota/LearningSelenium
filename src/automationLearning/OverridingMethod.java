package automationLearning;



class AutomationLanguage {
	
	public void displayInfo() {
		System.out.println("Easy programming language");
	}
}

class Java extends AutomationLanguage {
	
	@Override
	public void displayInfo() {
		System.out.println("Java language");
		super.displayInfo();
	}
	
}



public class OverridingMethod {
	

	public static void main(String[] args) {
		
		
		Java java = new Java();
		java.displayInfo();

	}



}





































