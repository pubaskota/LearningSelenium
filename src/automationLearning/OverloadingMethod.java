package automationLearning;



class overload {
	
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
	
}



public class OverloadingMethod {

	public static void main(String[] args) {
	
		overload a1 = new overload();
		a1.display('!');
	
	}

}



















