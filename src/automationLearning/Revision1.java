package automationLearning;

public class Revision1 {
	
	
	
	
	public static void Calculator(int x , int y) {
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
	}
	
	public static void CalculatorB() {
		System.out.println(1+1);
		
	}
	
	public static void CalculatorC(int x , int y) {
		System.out.println(x+y);
		
	}
	
	public static int CalculatorD(int x , int y) {
		System.out.println(x+y);
		return x + y;
	}
	
	
	

	
	
	public static void main(String[] args) {
		
		
		
		
		
			//String 
		
			String fullName = "poonam sharma";
			System.out.println(fullName);
			
			// Java is object --- property and method
			
			String x = fullName.toUpperCase();
			System.out.println(x);
			
			// Method chaining
			
			int y = fullName.toUpperCase().toLowerCase().length();
			System.out.println(y);
			
			// comparison relational operator
			// < , > , <= , >= , == , !=
			// entity < entity ----- boolean 
			
			
			System.out.println(6 < 3); // false
			System.out.println(6 != 3); // true
			System.out.println(6 > 3); // true
			System.out.println(6 >= 3); // true
			System.out.println(6 <= 3); // false
			System.out.println(6 == 3); // false
			
			// Logical operators
			// AND, OR , NOT
			
			
			
			// AND operation
			// True && True ===>  True 
			// True && False ==>  False
			// False && True ==>  False
			// False && False ==> False
			System.out.println(5!= 10 && 20 == 20);
			
			
			// OR operator
			// True || True ===>  True 
			// True || False ==>  True
			// False || True ==>  True
			// False || False ==> False
			System.out.println(2 == 3|| 8 > 5);
			
			
			
			// NOT 
			// True -- False
			// False-- True 
			System.out.println(!(6 == 6));
			
			
			
			// Conditional statements 
			// input ---> mutiple outcomes -->
			// numberT > 0 && numberT <= 5 --- 5 %
			// numberT > 5 && numberT < = 10  --- 10 %
			// numberT > 10  ---------- 20 %
			
			
			int numberT= 10;
			if(numberT > 0 && numberT <= 5) {
				System.out.println("5 % discount");
		}
		    if(numberT > 5 && numberT <= 10) {
			System.out.println("10 % discount");			}
			if(numberT > 10) {
				System.out.println("20 % discount");
			}
			
			if(numberT > 0 && numberT <= 5) {
				System.out.println("5 % discount");
			}
			else if(numberT > 5 && numberT <= 10) {
				System.out.println("10 % discount");
			}
			else if(numberT > 10) {
				System.out.println("20 % discount");
			}
			
			int marks = 95;
   		    if(marks > 91) {
			System.out.println("Grade A");
			}
		    if(marks > 71) {
				System.out.println("Grade B");
		}
			if(marks > 61) {
			System.out.println("Grade C");
			}
			
			if(marks > 90) {
				System.out.println("Grade A");
			}
			else if(marks > 70) {
				System.out.println("Grade B");
			}
			else if(marks > 60) {
				System.out.println("Grade C");
			}
			
			// Ternary operator
			
			int xy = 100 ; 
			int xyz = 20;
			
			if(xy > xyz) {
				System.out.println("xy is greater");
			}
			else {
				System.out.println("xyz is greater");
		}
			
			int max = (xy > xyz) ? xy : xyz;
		    System.out.println(max);
			
		    String minval = (xy < xyz)?"xy is small":"xyz is small";
			System.out.println(minval);
			
			// Switch case
			
			String city = "Kathmandu";
			switch(city) {
			case "Kathmandu":
			case "Bagmati":
				System.out.println("BM");
				break;
			case "Janakpur":
			case "Janaki":
				System.out.println("JN");
				break;
			case "Birgung":
			case "Birtamod":
				System.out.println("BR");
				break;
			default:
				System.out.println("Plese enter correct city");
			}
			
			
			// Loops
			//for(intiliazation ; conditionCheck; increment) {
			// statement
			
			
			for(int i = 0 ; i < 6 ; i++) { 
				System.out.println(i); 
			}
			
			for(int i = 0 ; i < 8 ; i++) { 
				System.out.println(i); 
				if(i == 2) {
					break;
				}
			}
			for(int i = 0 ; i < 6 ; i++) { 
				if(i == 2) {
					continue;
				}
				System.out.println(i); 
			}
			
			
			// while 
			//Initialization ; 
			// while(condition) {
		    // statement 
		    // increment / decrement
		}
			

	
	         int ab = 5;
	         
	         {
	        	 
			while(ab >= 1) {
			System.out.println(ab);
				ab --;
		}
			
			int pq = 10;
			
			while(pq >= 1) {
			System.out.println(pq);
			if(pq == 3) {
			break;
		}
		    pq --;
		}
			
			
			int b = 15;
		
		while(b >= 1) {
			if(b == 3) {
				b --;
					continue;
				}
				System.out.println(b);
				b --;
		}
			
			
			
			// functions 
			
			int x2 = 15;
			int y2 = 10;
			
			System.out.println(x2+y2);
			System.out.println(x2-y2);
			System.out.println(x2*y2);
			System.out.println(x2/y2);
			System.out.println(x2%y2);
			
			int x3 = 100;
			int y3 = 50;
			
			System.out.println(x3+y3);
			System.out.println(x3-y3);
			System.out.println(x3*y3);
			System.out.println(x3/y3);
			System.out.println(x3%y3);
			
			
		
			 
		    Calculator(20,5);
		    Calculator(100,150);
		    
		    CalculatorB();
		    CalculatorB();
		    
		    Calculator(5,5);
		    Calculator(3,3);

		


	}

}
