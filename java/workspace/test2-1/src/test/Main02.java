package test;

class Student{
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
	
	
}





public class Main02 {

	public static void main(String[] args) {

		Student std = new Student();
		
		std.setAge(28);
		std.setName("유원철");
		
		System.out.println(std.getAge());
		System.out.println(std.getName());
		
		
		
		
		
		
	}

}
