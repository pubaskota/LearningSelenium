package automationLearning;





public class PolymerphisamMethod {
	
	
	
	
	public static void main(String[] args) {
		
		Calender a1 = new Calender();
		int x = a1.Addition(10,5);
		System.out.println(x);
		int y = a1.Addition(15,8,30);
		System.out.println(y);
		int z= a1.Addition(20,5,9,10);
		System.out.println(z);
	}

}

class Calender {
	
	// method 1
	public int Addition(int x , int y) {
		return x+y ;
	}
	// method 2
	
	public int Addition(int x , int y , int z) {
		return x+y+z ;
	}
	
	// method 3
	public int Addition(int x , int y , int z,int a) {
		return x + y + z + a;
	}
	
	











//overloading  -- same methodName , Same class , different Signature
// overriding  - same methodName , differentclass , same signature












	}


