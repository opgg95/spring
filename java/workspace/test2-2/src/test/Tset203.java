package test;

class Calc2{
	
	int plus(int x, int y) {
		return x + y;
	}
	
	int minus(int x, int y) {
		return x - y;
	}
	
	int times(int x, int y) {
		return x * y;
	}
	
	int divide(int x, int y) {
		int result = 0;
		if(y !=0 ) {
			result = x /y;
		}
		return result;
	}

}

public class Tset203 {

	public static void main(String[] args) {
		//10.
		Calc2 c = new Calc2();
		
		//11.
		//System.out.println(c);
		
		int a = 150;
		int b = 50;
		
		//12.
		System.out.println("150 + 50 = " + c.plus(a, b));
		System.out.println("150 - 50 = " + c.minus(a, b));
		
		//13.
		System.out.println("150 * 50 = " + c.times(a, b));
		System.out.println("150 / 50 = " + c.divide(a, b));
		
		
		
	}

}
