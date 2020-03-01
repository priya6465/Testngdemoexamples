package javaexam;

public class Encapsulation {
       private int a;
	public void settingvalue(int b) {
	a=b;
	}
	
	public  int gettingvalue(){
		return a;
	}
	
	//call in the main method//
public static void main(String[] args)
{
	Encapsulation obj=new Encapsulation();
	obj.settingvalue(30);
	System.out.println(obj.gettingvalue());
}
}
