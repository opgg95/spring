package object;

class Character {
	
	String name;
	int age;
}
public class Main02 {

	public static void main(String[] args) {
		//
		//
		
		Character d = new Character();
		d.name = "둘리";
		d.age = 20;
		
		Character h = new Character();
		d.name = "희동";
		d.age = 3;
		
		System.out.println("이름 : " + d.name + " , 나이 : " + d.age);
		System.out.println("이름 : " + d.name + " , 나이 : " + d.age);
	}

}
