package automationLearning;

public class OOPS1 {

	public static void main(String[] args) {
		
		
		
	
			  Bank poonam = new Bank("Poonam Sharma",4816,200000); 
			  System.out.println(poonam.accName); 
			  System.out.println(poonam.accNo); 
			  System.out.println(poonam.bal); 
			   
			  //  deposit amount 
			  
			  int updatedBal = poonam.deposit(50000); 
			  System.out.println(updatedBal); 
			   
			  // withdraw  
			   
			  int bal = poonam.withdrawl(200000); 
			  System.out.println(bal); 
			   
			  int currentBal = poonam.withdrawl(30000); 
			  System.out.println(currentBal); 
			   
			  // declaring array
			  
				 int [] countofTransection = new int[5] ;
				  
				  countofTransection[0] = 1000;
				  countofTransection[1] = 2000;
				  countofTransection[2] = 3000;
				  countofTransection[3] = 4000;
				  countofTransection[4] = 5000;
				  
				  // iterating over array
				  
				  for (int i = 0; i < countofTransection.length; i++) {
					System.out.println( i  + " transection " + "  amount : " +  countofTransection[i] ) ;
				}
				  
				  
				  
			   
			 } 
			  
			 
			} 
			 
			class Bank { 
			  
			 String accName; 
			 int accNo; 
			 int bal; 
			  
			 Bank(String accountName , int accountNumber , int balance){ 
			   this.accName = accountName; 
			   this.accNo = accountNumber; 
			   this.bal = balance; 
			 } 
			  
			 public int deposit(int amount) { 
			  this.bal = this.bal + amount; 
			  System.out.println("Bal updated"); 
			  return this.bal; 
			 } 
			  
			 public int withdrawl(int amount) { 
			  if(this.bal > amount) { 
			   this.bal = this.bal - amount; 
			   System.out.println("Bal updated"); 
			   return this.bal; 
			  } 
			  else { 
			   System.out.println("Insufficient Bal"); 
			   return this.bal; 
			  } 
			 } 
			  
			
			
		
		
		
	}


