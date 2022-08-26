package automationLearning;

public class parameter {

	public static void main(String[] args) {
		
		int x = 50;
		int y = 10;
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		int p = 20;
		int q = 5;
		
		System.out.println(p+q);
		System.out.println(p-q);
		System.out.println(p*q);
		System.out.println(p/q);
		System.out.println(p%q);

       // solution - function
		
		
		   
		  Calculator(200,100); 
		  Calculator(500,200); 
		  Calculator(50,25); 
		   
		  // function without parameter and without return type 
		   
		  AdditionZ(); 
		  AdditionZ(); 
		  AdditionZ(); 
		  AdditionZ(); 
		   
		  // function with parameter and without return type 
		  AdditionA(12,12); 
		  AdditionA(1,2); 
		  AdditionA(1000,200); 
		   
		  
		  // function with parameter and with return type 
		   
		  int s = AdditionC(10,4); 
		  System.out.println(s); 
		  System.out.println(s + 2); 
		  System.out.println(s - 10); 
		  System.out.println(s * 0.10); 
		   
		  // Revision  
		  //SubtractionA(); 
		  //SubtractionB(); 
		 // SubtractionC(); 
		  //SubtractionD(); 
		   
		  //SubtractionC(1000,500); 
		  //SubtractionC(50,20); 
		  //SubtractionC(800,100); 
		   
		  int r1 = SubtractionC(300,150); 
		  System.out.println(r1); 
		  System.out.println(r1 + r1); 
		  System.out.println(r1 - r1); 
		  System.out.println(r1 * 0.10); 
		   
		  int r2 = SubtractionC(90,45); 
		  System.out.println(r2); 
		   
		 } 
		  
		 private static int SubtractionC(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

		// Functions 
		  
		 public static void Calculator(int y , int z) { 
		  // arithmetic operation 
		  System.out.println(y+z); 
		  System.out.println(y-z); 
		  System.out.println(y*z); 
		  System.out.println(y/z); 
		  System.out.println(y%z);  
		 } 
		  
		 // Three basic type of function 
		 // function without parameter and without return type 
		  
		 public static void AdditionZ() { 
		  System.out.println(100 + 50); 
		 } 
		  
		 // function with parameter and without return type 
		 public static void AdditionA(int u , int v) { 
		  System.out.println(u+v); 
		 } 
		  
		 // function with parameter and with return type 
		 public static int AdditionC(int g ,int h) { 
		  return g + h ; // (10 + 4) 
		 } 
		  
		 // revision 
		 public static void MultiplyA() { 
		  System.out.println(20*2); 
		 } 
		  
		 public static void MultiplyB(int g , int h){ 
		  System.out.println(g*h); 
		 } 
		  
		 public static int MultiplyC(int g , int h) { 
		  return g * h ; 
		 } 
		  
		 public static String MultiplyD(int g ,int h) { 
		   System.out.println(g*h); // 45 
		   return "Multiply successful"; 
		 } 
		  
		}


