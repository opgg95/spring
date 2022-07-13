package condition;

public class Main08 {

	public static void main(String[] args) {
		// char grade 선언, A,B,C가 있다. 
		// A or B or C : "Pass" 1번출력 
		// A, B, C를 제외한 다른
		// 등급이 올 경우, "Not-pass" 1번 출력
		 		
		char grade = 'A';
		
		switch (grade) {
		case 'A' :
			System.out.println("Pass");
		break;
		
		case 'B' :
			System.out.println("Pass");
		break;
		
		case 'C' :
			System.out.println("Pass");
		break;
		default :
			System.out.println("Not-pass");
			
		}
		
		
		
	}

}
