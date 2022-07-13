package test2;

public class Main05 {

	public static void main(String[] args) {

/*[배열]
int[] num = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};

[출력 결과]
짝수 : 20
홀수 : 25
 * 
 */
	int[] num = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9};
	int even = 0;	// 짝수
	int odd = 0;	// 홀수
	
	for( int i=0; i<num.length; i++ ) {
		if( num[i] % 2 == 0) {
			even += num[i];
			} else {// 홀수
				odd += num[i];
				
			}
	}
	System.out.println("짝수 : " + even);
	System.out.println("홀수 : " + odd);

	}
	}
