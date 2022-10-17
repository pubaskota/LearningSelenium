package automationLearning;

public class LoopArray {

	public static void main(String[] args) {
		
		
		for(int i = 0 ; i < 5 ;i++) { 
			    
			   System.out.println("Beautiful"); 
			 
			  } 
			   
			   
			 for(int i = 1 ; i < 16 ; i++) { 
			   System.out.println(i); 
			  } 
			   
			  
			   
			  for(int i = 15 ; i >= 1;i--) { 
			   System.out.println(i); 
			  } 
			   
			  
			   
			  for(int i = 4 ; i <= 40 ; i = i + 4) { 
			   System.out.println(i); 
			  } 
			   
			   
			   
			  for(int i = 0 ; i < 12 ; i++) {   
			   if(i == 4) { 
			    break; 
			   } 
			   System.out.println(i);   
			  }  
			   
			  for(int i = 0 ; i < 16 ; i++) {   
			   System.out.println(i); 
			   if(i == 4) { 
			    break; 
			   } 
			    
			  }  
			   
			
			   
			  for(int i = 0 ; i < 6 ; i++) { 
			    if(i == 2) { 
			     continue; 
			   } 
			    System.out.println(i); 
			  }  
			   

	}

}
