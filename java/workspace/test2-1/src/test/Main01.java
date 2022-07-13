package test;

class Calc{
	
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
public class Main01 {

	public static void main(String[] args) {
		
		Calc c = new Calc();
		
		//plus
		int p = c.plus(150, 50);
		System.out.println("150 + 50 = " + p);
		
		//minus
		System.out.println("150 + 50 = " + c.minus(150, 50));
		
		//times
		System.out.println("150 * 50 = " + c.times(150, 50));
		
		//divide
		System.out.println("150 / 50 = " + c.divide(150, 50));
		
		
		
		
		
		
			
		
	}

}
