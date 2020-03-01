package javaexam;

class Rectangle
{
	int lenght,widht,res;
	Rectangle(int x,int y)
	{
		lenght=x;
		widht=y;
		
	}
	void rectArea()
	{
		res=lenght*widht;
		System.out.println("Area of reacangle is"+res);
	}
}

public class Testparameterised {

	public static void main(String[] args) {
     Rectangle obj=new Rectangle(10,20);
     obj.rectArea();
	}
}
