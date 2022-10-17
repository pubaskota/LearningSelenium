package automationLearning;

public class CallConstractor {

	public static void main(String[] args) {
		
		Sub b = new Sub();
		
class Sub {
			
			int a = 10;
			int b = 5;
			
			
			
			Sub(){
				System.out.println("Subtraction constructor is called");
			}
			
			public void Substraction() {
				System.out.println(this.a - this.b);
			}

		

}
}
}