package javaexam;

public class Encapsulationeg {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public static void main(String[] args) {
		
		Encapsulationeg obj=new Encapsulationeg();
		obj.setAge(45);
		obj.setName("ppp");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
	
}

}
