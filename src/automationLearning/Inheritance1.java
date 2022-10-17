//package automationLearning;
//
//class GrandFather {
//	
//	String firstName;
//	String lastName;
//	
//	// constructor
//	GrandFather(String firstName , String lastName){
//		this.firstName = firstName;
//		this.lastName = lastName;
//	}
//	public void displayName() {
//		System.out.println(" this is from Grandfather Class " + this.firstName + " "+ this.lastName );
//	}
//	
//}
//
//
//
//
//class Father extends GrandFather {
//	
//	String fFirstName;
//	// If parent is having constructor , we need to have constructor in child as well
//	// In child constructor first line should be call to parent constructor using super
//	
//	Father(String firstName ,String lastName){
//		super(firstName,lastName);
//		this.lastName = lastName;
//		this.firstName = firstName;
//	}
//	@Override
//	public void displayName() {
//		System.out.println("this is from Father class " + super.firstName + " "+this.lastName);
//		super.displayName();
//	}
//	
//	
//	
//	
//	
//	
//	    
//	    
//	    class Son extends Father {
//
//			Son(String firstName, String lastName) {
//				super(firstName, lastName);
//				
//			}
//			
//         public static void main (String[] args) {
//        	
//        	 GrandFather myGrandFather = new GrandFather("poonamGrandDad","baskota");
////     		myGrandFather.displayName();
//     		
//     		Father myFather = new Father("poonamFather","Baskota");
//     		myFather.displayName();
//		    	
//    		}
//	    	
//	    	
//	    		
//    	
//	    	
//	    	
//	    	
//	    }
//	    
//	    
//	    
//	   
//	}
//	
//
//     
//
//
//
//
//
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//
////
////chinmay shirish deshpande 
////shirish manohar deshpande
////manohar deshpande
//
//	
//
// 
