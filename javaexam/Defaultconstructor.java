package javaexam;

public class Defaultconstructor {
	int a,b;
	Defaultconstructor(){
	System.out.println("default constructor");
	a=12;
	b=556;
	}
	void disp()
	{
System.out.println("value of a" +a);
System.out.println("value of b" +b);
}

 public static void main(String args[])
 {
	 Defaultconstructor obj=new Defaultconstructor();
	 obj.disp();
 }
	 
 }


