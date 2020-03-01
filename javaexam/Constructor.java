package javaexam;

public class Constructor {
	
	public Constructor(){
	System.out.println("default constructor");
	}
	public Constructor(int a,int b){
		System.out.println("parameter of" +(a+b));
		}
    public static void main(String[] args) {
	Constructor obj =new Constructor();
	Constructor obj2=new Constructor(3,4);
    }
}


     
 