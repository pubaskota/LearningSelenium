package automationLearning;

public class BankAccount {
	// default constructor
	
	String accountName = "Saving";
	int accountNumber = 12345;
	int initialbalance = 35000;
	int withdrawAmount = 25000;
	
	
	

	public  int deposit() {
		BankAccount account = new BankAccount();
		int depositAmount = account.initialbalance -   account.withdrawAmount ;
		System.out.println("the deposit amount is "+ depositAmount);
		return depositAmount ;
		
	}
	
	
	public  static void withdraw() {
		BankAccount account = new BankAccount();
		int withdraw = account.initialbalance - account.deposit();  ;
		System.out.println("the Withdraw amount is  " + withdraw);
		
		
	}
	
	
	

}
