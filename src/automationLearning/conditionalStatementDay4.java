package automationLearning;

public class conditionalStatementDay4 {

	private static boolean condition;

	public static void main(String[] args) {
		
		// number of ticket <=5  ====> 5%
		//number of ticket >5 && NumberofTicket< 10===> 10%
		// number of ticket< ===> 30%
		
		// Program 1
		
		if (condition) {
			
			int a = 10;
			if (a>=10) {
				System.out.println(" A is 10");
				
				
			}
			
			// Program 2 ( check whether the number is positive or negative)
			
			int b = 90;
			if (b>0) {
				System.out.println("Number is Positive");
			}
			else {
				System.out.println(" Number is negative");
			}
			
			
			// Program 3 (not recommended)
			
			if (b>0);
			System.out.println(" Number is Positive");
		}
		else
			System.out.println(" Number is negative");
	
		
		// Program 4 ( program to check the greater number )
		
		int x = 10;
		int y = 20;
		
		if (x>y) {
			System.out.println(" x is greater");
		}
		else 
			System.out.println(" y is greater");
				
			}
			
		// Program 5 
	    
	    int numberofticket= 5;{
	    if ( numberofticket>0 && numberofticket <= 5);
	    
	    System.out.println(" 5 % discount");
	    
	    
	    if (numberofticket >10 &&numberofticket <= 10 );
	    System.out.println(" 10 % discount");

	    
		

	    if ( numberofticket>20 ) {
	    	System.out.println(" 40 % discount");
	    	
	    }
	    
	    // program 6 ( number of ticket = 10%)
	    
	    if (numberofticket > 0 && numberofticket<= 5) {
	    	System.out.println(" 5 % discount");
	    }
	    else if ( numberofticket>5&& numberofticket<=10) {
	    	System.out.println("10 % discount");
	    }
	    
	    else if (numberofticket >10) {
	    	System.out.println(" 30 % discount");
	    	
	    }
	    else {
	    	System.out.println(" Incorrect input");
	    	
	    	
	    // program 7 
	    	
	    // if percent is above 90----> A grade
	    //if percent is above 75----> B grade
	    //	if percent is above 65----> C grade
	    	
	    	
	    	int marks = 95;
	    	
	    	if (marks > 90) {
	    		System.out.println(" A grade");
	    		
	    	}
	    	else if (marks > 75) {
	    		System.out.println("B grade");
	    		
	    	}
	    	else if (marks > 60 ) {
	    		System.out.println(" C grade ");
	    		
	    	} else {
	    		System.out.println(" Fail");
	    	}	
	    		
	    	// Program 8
	    		
	    		int x1 = 100;
	    		int x2 = 30;
	    		int x3 = 50;
	    		
	    	if (x1 > x2) { // x1 is greater
	    		
	    		if ( x1 > x3) {
	    			System.out.println(" x1 is greater");
	    		}
	    		else {
	    			System.out.println(" x3 is greater");
	    		}
	    	  }
	    	   else {
	    		  if (x2 > x3) {
	    			System.out.println(" x2 is greater");
	    		}
	    		else {
	    			System.out.println(" x3 is greater");
	    		}
	    	  }
	    			
	    			
	    	// program 9
	    			
	    			if (x1 > x2 && x1 >3 ) {
	    				System.out.println(" x1 is greater");
	    			}
	    			else if (x2 > x1 && x2 > x3) {
	    				System.out.println(" x2 is greater");
	    				
	    			}
	    			
	    			else {
	    				System.out.println(" x3 is greater");
	    				
	    				
	    				
	    				
	    			}
	    			
	    			
	    			
	    		}
	    }
}
	    	
	   
	    

	    			
	    		
	    	
	    		
	    		
	    	
	    			
	    			
	    			
	    			
	    			
	    	
	    	
	    	
	    	
	    	
	   


