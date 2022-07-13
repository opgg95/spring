package test;

class Calc{
	//5.
	int times(int x, int y) {
		return x * y;
}
	//6.
	int divide(int x, int y) {
		int result = 0;
		if(y !=0 ) {
			result = x /y;
		}
		return result;
	}

}
//7.
public class Test202 {

	public static void main(String[] args) {
		//8.
		int a = 150;
		int b = 50;
		
		
		Calc c = new Calc();
	
		//9.
		System.out.println(c.times(a, b));
		System.out.println(c.divide(a, b));
		
		
		
	}

}
