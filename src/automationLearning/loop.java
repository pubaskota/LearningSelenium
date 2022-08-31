package automationLearning;

public class loop {

	public static void main(String[] args) {
		

		 
		
		   
		  // for loop  
		   
		//  for(initialization ; conditionCheck ; increment/decrement)  
		
		   
		  // print from  0 - 5
		   
		  for(int i = 0 ; i < 5 ;i++) { // i- 1 , 2 , 3 
		   //System.out.println(i); // 0 , 1 , 2,3,4, 
		   System.out.println("Beautiful"); // "Beautiful" , "Beautiful" ,"Beautiful" "Beautiful"
		  // "Beautiful"
		  } 
		   
		   
		  // print 1 - 15 
		   
		  for(int i = 1 ; i < 16 ; i++) { 
		   System.out.println(i); 
		  } 
		   
		  // print 15 -1 
		   
		  for(int i = 15 ; i >= 1;i--) { 
		   System.out.println(i); 
		  } 
		   
		  // print table of 4
		   
		  for(int i = 4 ; i <= 40 ; i = i + 4) { // 4 // 8// 12//16//20//24//28//32//36//40
		   System.out.println(i); // 2 , 4 , 6 ------ 40
		  } 
		   
		  // break statement with for loop 
		   
		  for(int i = 0 ; i < 12 ; i++) {   //1 //2 //3//4
		   if(i == 4) { 
		    break; 
		   } 
		   System.out.println(i); //0 ,1  
		  }  
		   
		  for(int i = 0 ; i < 16 ; i++) {  //1 // 2 
		   System.out.println(i); // 0 ,1 ,2,3,4
		   if(i == 4) { 
		    break; 
		   } 
		    
		  }  
		   
		  // continue  
		   
		  for(int i = 0 ; i < 6 ; i++) { //1 //2 //3 // 4 //5 //6
		    if(i == 2) { 
		     continue; 
		   } 
		    System.out.println(i); // 0 ,1 ,3 ,4 ,5
		  }  
		   
		   
		   // while loop 
		   
		   
		  int a1 = 0; 
		  while(a1 < 10) { 
		   System.out.println(a1); // 0 ,1 , 2 , 3 , 4 ,5,6,7,8,9
		   a1++; // 1 // 2 // 3 // 4 // 5 //6//7//8//9//10
		  } 
		   
		  // print 1 to 15 
		   
		  int a2 = 1; 
		  while(a2 <= 15) { 
		   System.out.println(a2); 
		   a2++; 
		  } 
		   
		  // print 15 -1  
		   
		  int a3 = 15;  
		  while(a3 >= 1) { 
		   System.out.println(a3); 
		   a3 --; 
		  } 
		    
		  // table of 4
		  
		  int a4 = 4; 
		  while(a4 <= 40) { 
		   System.out.println(a4); 
		   a4 = a4 + 4; 
		  } 
		   
		  // break with while loop  
		   
		  int a = 6; 
		   
		  while(a >= 1) { 
		   System.out.println(a); // 6,5 ,4 ,3 
		   if(a == 3) { 
		    break; 
		   } 
		   a --;  
		  } 
		   
		  // continue with while 
		   
		  int a5 = 0; 
		   
		  while(a5 < 6) { 
		   if(a5 == 2) { 
		    a5 ++; // 3 
		    continue; 
		   } 
		   System.out.println(a5); // 0  ,1 ,3 , 4 ,5
		   a5 ++; // 1  // 2 // 4 // 5 //6
		  } 
		     
		   
	}
	}