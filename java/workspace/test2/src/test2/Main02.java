package test2;

public class Main02 {

	public static void main(String[] args) {
/*[배열]
int[][] arr = {
{ 5, 5, 5, 5, 5},
{10,10,10,10,10},
{20,20,20,20,20},
{30,30,30,30,30}
};

[출력 결과]

total=325

average=16
 * 
 */
	int [] num = new int [] { 5, 5, 5, 5, 5,10,10,10,10,10,20,20,20,20,20,30,30,30,30,30};
	int sum = 0;
	
	for(int i=0; i < num.length; i++) {
		sum += num[i];
	}
	System.out.println("total = " + sum);
	System.out.println("average = " + sum/num.length);
	
		
	}

}
