package condition;

public class Main02 {

	public static void main(String[] args) {
		int point= 75;
		
		if (point > 70 && point <= 80 ) {
			System.out.println("C학점입니다. ");
		}
		
		if (point <= 70 || point > 80) {
			System.out.println("범위를 벗어났습니다. ");
		}
		
		
		/*
		 * point 가 70보다 크고, 80이하이면 "C학점 입니다." 를 출력,
		 * point 가 70이하이고, 80보다 크면 "범위를 벗어났습니다."
		 */
		
		
		
		
	}

}
