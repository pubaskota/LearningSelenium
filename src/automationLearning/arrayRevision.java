package automationLearning;

public class arrayRevision {

	public static void main(String[] args) {
		 
		  // When to use array ?? 
		  // If we have more then one value we have to used Array
		   
		  // Program 1 
		   
		  String [] cities = new String[3]; 
		  // Array stores the value by index 
		  cities[0] = "Dallas"; 
		  cities[1]= "Frisco"; 
		  cities[2] = "Plano"; 
		   
		  // Another way to initialize array  
		  //                    0          1          2 
		  String [] cities1 = {"Dallas","Frisco","Plano"};  
		   
		   
		  // Program 2 (Array of integers) 
		   
		   
		  int [] numbers = new int[3]; 
		  numbers[0] = 11; 
		  numbers[1] = 22; 
		  numbers[2] = 33; 
		   
		  int [] numbers2 = {11,22,33}; 
		   
		  //  0  1  2 
		  // [11,22,33] 
		   
		   
		  // Program3 
		   
		   
		  // How to access the element from array  
		  //                    0         1         2          3         
		  String [] clothes = {"dress","t-shirt","pant","tops"}; 
		  System.out.println(clothes[0]); 
		  System.out.println(clothes[2]); 
		   
		  // Total number of elements in array 
		   
		  int a = clothes.length; 
		  System.out.println(a); 
		  System.out.println(clothes[clothes.length-1]); 
		   
		   
		  // program 4 (print every element of array) 
		   
		  //                         0         1            2          3
		  String [] vegetable = {"potato","cauliflower", "cabbage","tomato"}; 
		  //System.out.println(vegetable[3]); 
		   
		  for(int i = 0 ; i < 3 ; i++) {  // 1 // 2 // 3 
		   System.out.println(i); // 0 , 1 , 2 
		  } 
		   
		  for(int i = 0 ; i < vegetable.length ; i++) { 
		   System.out.println(vegetable[i]); 
		   // i ---  0 
		   // i ---  1 
		   // i ---  2 
		   // i ---  3 
		  } 
		  //                 0 1 2  3 4
		  int [] numbers3 = {1,2,3,4,5}; 
		   
		  for(int i = 0 ; i < numbers3.length ; i++) { 
		   //System.out.println(i); 
		   System.out.println(numbers3[i]); 
		  } 
		   
		  // print all the values of array in reverse  
		    //                         0         1         2        3 
		  String [] flowers = {"Rose","Lily","Orchid","Tulip"}; 
		   
		  for(int i = flowers.length-1 ; i >= 0; i--) { // 2 // 1 // 0 // -1 
		   //System.out.println(i); // 3 , 2 , 1 , 0 
		   System.out.println(flowers[i]); 
		  } 
		   
		  // Program 6 
		  // Using for each loop 
		   
		  int [] age = {2,3,4}; 
		   
		  for(int ag:age) { 
		   System.out.println(ag); 
		  } 
		   
		  String [] countries = {"japan","america","Bhutan","nepal"}; 
		  for(String country:countries) { 
		   System.out.println(country); 
		  } 
		   
		  // Program 7 
		   
		  int [] numbers4 = {10,20,30}; 
		  int sum = 0;  // 66 
		   
		  for(int i = 0 ; i <numbers4.length ; i++) { 
		   //System.out.println(numbers4[i]); 
		   sum = sum + numbers4[i]; 
		    
		   //     0  +   10    ==> 10 
		   //     10 +   20    ==> 30
		   //     30 +   30    ==> 60  
		  } 
		   
		  System.out.println(sum); 
		   
		   
		  // Program 8  
		   
		  // Average of all elements of array 
		   
		  int [] ages2 = {20,22,24,26,28}; 
		  int total = 0; 
		  // sum of all elements / totalNumberofElement 
		   
		  for(int i = 0 ; i < ages2.length ; i++) { 
		   //System.out.println(i); 
		   total = total + ages2[i]; 
		    
		  //            0   +   20   ====>  20 
		  //            20  +   22   ====>  42 
		  //            42  +   24   ====>  66 
		  //            66  +   26   ====>  92 
		  //            92 +    28   ====>  120  
		    
		  } 
		  System.out.println(total/ages2.length); 
		   
		  
		   


	}

}
