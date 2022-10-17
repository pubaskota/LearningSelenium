package automationLearning;

class USBank {
	
	String country = "USA";
	public void loan(int x) {
		System.out.println("I am loan method from usbank " + x);
	}
	public void save(int x) {
		System.out.println("I am save method from usbank " + x);
	}	
	
	public void currentCountry() {
		System.out.println("Current country "+this.country);
	}
}

class CaptialOne extends USBank {
	@Override
	public void loan(int x) {
		System.out.println("I am loan method from cit "+x);
	}
	@Override
	public void save(int x) {
		System.out.println("I am save method from cit " + x);
	}	
	
}
class BOA extends USBank {
	
	@Override
	public void loan(int x) {
		System.out.println("I am loan method from boa "+x);
	}
	@Override
	public void save(int x) {
		System.out.println("I am save method from boa " + x);
	}	
	
	
}
class CapitalOne extends USBank {	
	
	@Override
	public void loan(int x) {
		System.out.println("I am loan method from capital "+x);
	}
	@Override
	public void save(int x) {
		System.out.println("I am save method from capital " + x);
	}	
	
}





public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		USBank us = new USBank();
		BOA boa = new BOA();
		CaptialOne capital = new CaptialOne();
		
		capital.loan(10);
		capital.save(6);
		
		capital.currentCountry();
		boa.currentCountry();
		us.currentCountry();

	}
	
	
	




	
		

	}


