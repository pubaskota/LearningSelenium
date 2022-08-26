package automationLearning;

public class Method {

	public static void main(String[] args) {
		
			  // type  
			  // type  object - property and method 
			  // method is action and return type 
			   
			  String name = "poonam"; 
			  System.out.println(name); 
			   
			  String city = "SanFrancisco"; 
			  System.out.println(city); 
	   
			  // string + string - string  
			  // number + string - string  
			  // string + number - string  
			  // number + number - number 
			   
			  int x = 50; 
			  int y = 10; 
			  String z = "welcome"; 
			   
			  System.out.println(x+y+z); 
			  // number + number + string - string 
			  
			  System.out.println(z+y+x);  
			  // string + number + number - string 
			   
			  System.out.println(z+z);  
			  ///string + string - "string" 
			   
			  System.out.println(x+y); 
			  // number + number - number 
			   
			  String r  = "20"; 
			  String s = "25"; 
			  System.out.println(r+s); 
			   
			   
			  // Methods  
			   
			  // length() 
			   
			  String country = "USA"; 
			  int  a1 = country.length(); 
			  System.out.println(a1); 
			   
			  // toUpperCase() 
			   
			  String city1 = "Dallas"; 
			  String a2 = city1.toUpperCase(); 
			  System.out.println(a2); 
			  System.out.println("Welcome to "+a2); 
			   
			  //toLowerCase() 
			   
			  String a3 = city1.toLowerCase(); 
			  System.out.println(a3); 
			  System.out.println("Welcome to "+a3); 
			   
			  // Concat() 
			  String place = "Italy"; 
			  String a = "I like "; 
			  String joinedString = s.concat(place); 
			  System.out.println(joinedString); 
			   
			  String a4 = place.concat(s); 
			  System.out.println(a4); 
			   
			   
			  // method chaining  
			   
			   
			  String cloth = "Dress"; 
			  System.out.println(cloth); 
			   
			  String a5 = cloth.toUpperCase(); 
			  System.out.println(a5); 
			   
			  int a6 =  a5.length(); 
			  System.out.println(a6); 
			   
			  int a7 = cloth.toUpperCase().toLowerCase().length(); 
			     //"Dress".toLowerCase().length() 
			     // "derss".length() 
			      
			  System.out.println(a7); 
			  
			  
			  // equal
			  
			  String first = "Hello World";
			  String second = "Hello World";
			  boolean result = first.equals(second);
			  System.out.println(result);
			  
			  // contains
			  String ab1 = "I am new to leave in India";
			  boolean result1 = ab1.contains("leave");
			  System.out.println(result1);
			  		
			  // substring
			  String state = "California";
			  // c a l i f o r n i a
			  // 0 1 2 3 4 5 6 7 8 9
			  
			  String result2 = state.substring(x);
			  System.out.println(result2);
			  
			      
				     
				    
				     
				    String result3 = state.substring(5,10); 
				    System.out.println(result3); 
				     
				    String result4 = state.substring(4,8); 
				    System.out.println(result4); 
				     
				    // join() 
				     
				    String qrs1 = "I am"; 
				    String qrs2 = "leaving"; 
				    String qrs3 = "Dallas"; 
				     
				    String result5 = String.join(" ", qrs1,qrs2,qrs3); 
				    System.out.println(result5); 
				     
				     
				    String str = "poonam"; 
				    String email = String.join("@", str,"gmail.com");  
				    System.out.println(email); 
				     
				    // replace() - can work with character also 
				     
				    //"poonam" , "i" "chinmay.replace('i','e') 
				    //"poonam is new city , poonam cooks his own food".replaceAll("poonam","bas") 
				     
				     
				    String str1  = "I am leaving Dallas!"; 
				    String str2 = str1.replace("Dallas", "California"); 
				    System.out.println(str2); 
				     
				     
				    String str3  = "I am leaving Dallas! and California is beautiful"; 
				    String str4 = str3.replace("i", "m"); 
				    System.out.println(str4); 
				     
				    // replaceAll() 
				    String str5  = " am leaving Dallas! and California is beautiful"; 
				    str5 = "I am leaving Nepal"; 
				    System.out.println(str5); 
				    String str6 = str5.replaceAll("Dallas", "Nepal"); 
				    System.out.println(str6); 
				     
				    // replaceFirst() 
				     
				    String str7  = " am leaving Dallas! and California is beautiful"; 
				    String str8 = str7.replaceFirst("Dallas", "Nepal"); 
				    System.out.println(str8); 
				     
				    // charAt() 
				     
				    String str10 = "kathmandu"; 
				    // 0 1 2 3 4 5 6 7 8
				    // k a t h m a n d u 
				    char result9 = str10.charAt(4); 
				    System.out.println(result9); 
				     
				    

				   // indexOf() ;
				     
				    int result11 = str10.indexOf("m"); 
				    System.out.println(result11); 
				     
				    // trim() 
				     
				    String str11 = " kathmandu "; 
				    System.out.println(str11.length()); 
				    String str12 = str11.trim(); 
				    System.out.println(str12.length()); 
				     
				    // split() 
				     
				    String str13 = "poonam-sharma-6822330306"; 
				    String [] result12 = str13.split("-"); 
				    // poonam-sharma-6822330306 on "-" // ["poonam","sharma","6822330306"] 
				    System.out.println(result12[0]); 
				    System.out.println(result12[1]); 
				    System.out.println(result12[2]); 
				     
				    String [] result13 = "poonam-sharma-6822330306".split("p"); 
				    // ["poonam-sharma-6822330" ,"306"] 
				     
				    System.out.println(result13[0]); 
				    System.out.println(result13[1]); 
				    System.out.println(result13[2]); 
				     
				    String str14 = "I am new for java class"; 
				    boolean result19 = str14.startsWith("I am"); 
				    System.out.println(result19); 
				     
				     
				    String str19 = "I am new for java class"; 
				    boolean result20 = str19.endsWith("java"); 
				    System.out.println(result20); 
				     
				    String str20 = "Frisco"; 
				     
				    // 0 1 2 3 4 5 
				    // f r i s c o 
				     
				    for(int i = 0 ; i < str20.length(); i++) { //1 //2  ----- // 6 
				      //System.out.println(i); // 0,1,2,3,4,5 
				      System.out.println(str20.charAt(i)); 
				    }  
				     
				    for(int i = str20.length()-1 ;  i >= 0 ;i--) { 
				     System.out.println(str20.charAt(i)); 
				    } 
				     
				    String str21 = "world"; 
				    String rev = ""; 
				     
				   //"dlrow"  
				    // w+""  ===> w
				       // o  + w ===> ow
				             // r  + ow ==> row
				             // l  + row ===>lrow
				       // d + lrow ===> dlrow

				     
				    for(int i = 0 ; i < str21.length();i++) { 
				     rev =  str21.charAt(i) + rev; 
				        
				    } 
				     
				    System.out.println(rev); 
				     
				    String str22 = "Dallas"; 
				    String rev2 = ""; 
				       // D a l l a s
				       // 0 1 2 3 4 5
				    for(int i = 0 ; i < 6;i++) { 
				     //System.out.println(i); 
				     //System.out.println(str22.charAt(i)); 
				      
				     rev2 = str22.charAt(i) + rev2 ; 
				                // d +  "" ==> d
				          // a + d  ==> ad
				          // l + ad ==> lad
				          // l+ lad ==> llad
				          // a + llad ==> allad
				          // s + allad==> sallad
				    } 
				    System.out.println(rev2); 
				     
				    String str23 = "Dallas"; 
				    String rev3 = ""; 
				      // D a l l a s
				     
				    for(int i = str23.length()-1 ; i >=0 ; i--) { 
				     //System.out.println(i); 
				     //System.out.println(str23.charAt(i)); 
				     rev3 = rev3 + str23.charAt(i); 
				     //      ""  + s  == >s
				     //       s + a == >sa
				     //       sa + l == >sal 
				     //       sal + l ==> sall
				     //       sall + a ==> salla
				     //       salla + D==> sallad
				    } 
				     
				    System.out.println(rev3); 
				     
				    String str24 = "world"; 
				    int counter = 0; 
				    //  0 1 2 3 4    // w o r l d
				    //  h e l l o    // 0 1 2 3 4
				     
				    for(int i = 0 ; i < str24.length();i++) { 
				     char p1 = str24.charAt(i); 
				     if(p1 == 'r') { 
				      counter = counter + 1; 
				     } 
				        
				    } 
				     
				    System.out.println(counter); 
				     
				     
				     
				     
				     
				     
				     
				     
				     
				     
				      
				     
				   } 
				   

				     
				    
				     
			   
			 } 
			 


	


