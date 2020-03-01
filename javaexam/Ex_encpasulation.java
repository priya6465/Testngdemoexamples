package javaexam;

public class Ex_encpasulation {

	public static void main (String[] args) {
		Student stu=new Student();
		stu.set(101, "piya");
		System.out.println(stu.get());
		System.out.println(stu.get1());
	}

	}
class Student
{
	  private int rollno;
	  private String name;
	  
	  public void set(int j,String n)
	  {
	  rollno=j;
	  name=n ;
}
	  public int get()
	  {
		  return rollno;
	  }
	  public String get1()
	  {
 		  return name;
	  }

}
