package javaexam;

import java.util.Scanner;

public class Ex_switchcase {

	public static void main(String[] args) {
	int a,b,choice;
	Scanner obj= new Scanner(System.in);
	

    System.out.println("Enter value of a");
    a=obj.nextInt();
    
    System.out.println("Enter value of b");
    b=obj.nextInt();
    
    System.out.println("1:Add, 2:Mul, 3:Sub");
       choice=obj.nextInt();
      
     switch(choice){
     
      case 1:
           System.out.println("Addition is "+(a+b));
       break;
       
       case 2:
       System.out.println("multipication is "+(a*b));
       break;
       
       case 3:
           System.out.println("substration is "+(a-b));
           break;
           
           default:
        	   System.out.println("Enter wrong choice");
        	   
             
       }
}
	


	}


