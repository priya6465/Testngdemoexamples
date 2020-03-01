package javaexam;

import java.util.Scanner;

public class Ex_addition {

	public static void main(String[] args) {
	int a,b,sum;
    Scanner obj=new Scanner(System.in);
  
  System.out.println("Enter value of a");
  a=obj.nextInt(); 
  
  System.out.println("Enter value of b");
  b=obj.nextInt();
    
 sum=a+b;
    
   System.out.println("total is"+sum);	  
	}

}
