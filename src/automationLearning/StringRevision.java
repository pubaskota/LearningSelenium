package automationLearning;

public class StringRevision {

	public static void main(String[] args) {
		
		 // data type 
		   
		  // introvert      extrovert 
		  //  less social   speaks more 
		  //  calm          loud 
		  //  talks less    speaks more (friendly) 
		   
		   
		  // boolean -- it can hold only two values true and false 
		  // int --- 2,-2,4
		  // String ---- ‘poonam’ ,’pubaskot@gmail.com’ 
		   
		  // user defined data type 
		  // Person  -----> poonam
		  // property -----> height , weight , age , color , gender 
		  // method - talk() , walk(), sleep() 
		   
		  // Vehicle -- Toyta
		  // property - color , model , type , regNo  
		  // method - start() , stop() 
		   
		  // Bank - USAA
		  // property - accNO , addressName , accName , accType 
		  // method - withdrawl()  depoist() ,transfer
		   
		  // Data type ---- properties and method 
		  // method - action and return type 
		   
		   
		  // toUpperCase() 
		   
		  String firstName = "sharma";     // object is created 
		  String upperCaseFirstName = firstName.toUpperCase(); 
		  System.out.println(upperCaseFirstName); 
		   
		  // toLowerCase() 
		  // action - to convert every character to lowerCase  
		  // return another 
		   
		  String lastName  = "BAS"; 
		  String lowerCaseLastName = lastName.toLowerCase(); 
		  System.out.println(lowerCaseLastName); 
		   
		  //length() 
		  //action - counts number of character in string  
		  //return - int 
		   
		  String city = "dallas" ;
		  System.out.println(city); 
		  int a1 = city.length(); 
		  System.out.println(a1+ a1); 
		  System.out.println(a1); 
		  System.out.println(city.length()); 
		   

		  // Method chaining 
		   
		  String country  = "nepal" ;
		  int a2 = country.toUpperCase().toLowerCase().length(); 
		  System.out.println(a2); 
		   
		 
		   
		   
		   


	}

}
