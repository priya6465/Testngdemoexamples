package javaexam;

public class Ex_poly {
	public static void test(int i){
	System.out.println("value  of i "+i );
     }

   public static void test(double i,int y){
   System.out.println("value of i and y "+i +"  " +y);
   }
   
   public static void test(String i,String y){
	   System.out.println("value of i and y "+i +"  " +y);
   }
   public static void main(String[] args) {
		
		test (1);
		test(66.0,12);
		test("priya","ravi");
		
	}
   
}
