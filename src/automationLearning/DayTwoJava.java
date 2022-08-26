package automationLearning;

public class DayTwoJava {

	public static void main(String[] args) {
		
		int a = 500;
		int b = 100;
		
		// assignment operator in java
		
		
			  a=a+1;
			  System.out.println(a);
			  //x+=1;//x=x+1
			  System.out.println(a);
			  
			  //x=x+1====> x+=1
			  int y=90;
			  System.out.println(y);
			  y=y+5;
			  System.out.println(y);
			  y+=2;//y=y+2
			  System.out.println(y);
			  
			  //y-=1===>y=y-1
			  y-=1;
			    System.out.println(y);
			    
			    //y*=2//y=y*2
			    y*=2;
			    System.out.println(y);
			    //y/=2==>y=y/2
			    y/=2;
			    System.out.println(y);
			    
			    //y%=5==>y=y%5
			    y%=5;
			    System.out.println(y);
			    
			    //java assignment operators--->
			    
			    //= int a=10
			    //+= a+=1==a=a+1
			    //-= a-=1==a=a-1
			    //*= a*=1==>a=a*1
			    // /= a/=1==>a=a/1
			    // %= a%=1==>a=a%1
			    
			   // java relational operators 
			    // ==, !=,<,>,<=,>=
			    
			    // 3<8===> output will be always boolean value (true or false )
			    
			    int s=100;
			    int t=50;
			    
			    System.out.println(s>t);
			    System.out.println(t<s);
			    System.out.println(t==s);
			    System.out.println(10==10);
			    System.out.println(4>=7);
			    System.out.println(2>=5);
			    System.out.println(1>=6);
			    System.out.println(4>=4);
			    System.out.println(6<=7);
			    System.out.println(6<=6);
			    System.out.println(6<=5);
			    System.out.println(7!=5);
			    System.out.println(1!=1);
			    
			   // logical operator 
			    
			    //and operator --&&
			    //True True ====>True
			    System.out.println(5>=4&&4==4);
			    //False True====>False 
			    System.out.println(6!=6&&5==5);
			    //True False====>False
			    System.out.println(5>3&&7<=6);
			   //False False====>False
			    System.out.println(4>5&&7>8);
			     
			    
			   //OR--||
			    //True True====>True
			    System.out.println(6==6||7!=8);
			    //False True====>True
			    System.out.println(5!=5||6>5);
			    //True False====>True
			    System.out.println(8>7||6>7);
			    //False False====>False
			    System.out.println(8!=8||7>8);
			    
			    //Not--!
			    //True---False
			    System.out.println(!(7==7));
			    //False---True
			    System.out.println(!(6<5));
			    
			    //Unary operator
			    
			    //--
			    
			    int numberone=10;
			    numberone=numberone+1;
			    System.out.println(numberone);
			    
			    //second
			    numberone+=1;
			    System.out.println(numberone);
			    
			    //++
			    numberone++;
			    System.out.println(numberone);
			    
			    //--
			    
			    int numbertwo=20;
			    numbertwo=numbertwo-1;
			    System.out.println(numbertwo);
			    
			    //second 
			    numbertwo-=1;
			    System.out.println(numbertwo);
			    
			    //third
			    
			    numbertwo--;
			    System.out.println(numbertwo);

			
		

	}

}
