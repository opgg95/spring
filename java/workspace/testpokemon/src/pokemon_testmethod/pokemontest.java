package pokemon_testmethod;

import java.util.Random;
import java.util.Scanner;

public class pokemontest {

	public static void main(String[] args) {
		System.out.println("○●○●○●○● 포켓몬 빵을 사서  뮤츠를 뽑으려면 얼마가 들까?○●○●○●○●");
		Scanner sc = new Scanner(System.in);
		
		String[] bread = new String[7];
		bread[0] = "돌아온 고오스 초코케잌";
		bread[1] = "돌아온 로켓단 초코롤";
		bread[2] = "파이리의 화르륵 핫소스팡";
		bread[3] = "디그다의 딸기 카스타드 빵";
		bread[4] = "꼬부기의 달콤파삭 꼬부기 빵";
		bread[5] = "피카피카 촉촉치즈케잌";
		bread[6] = "푸린의 푹신푹신 딸기크림빵";
		
		for(int i = 0; i < bread.length; ++i) {
			System.out.println("["+(i+1)+"]  "+bread[i]+"\n");	
		} 
		System.out.println("빵을 선택해주세요 :");
		 
		int input = sc.nextInt();
		System.out.println( bread[input-1] +"을 선택했습니다.");
		
		Random random = new Random();
		
		int mutz = 150; // 뮤츠의 번호
		int count = 0; // 빵 뽑은 갯수
		int price = 1500; // 빵 가격
		while(true) {
			count++;
			int randomNumber = random.nextInt(151)+1;
			if(randomNumber == 151) { 
				System.out.println("당첨! 뮤츠를 뽑았습니다!");
				break;
				
			} 
		}
		
		System.out.println(count+"개의 빵을 구매했습니다.");
		System.out.println(count*price+"원을 사용했습니다.");
		
	}

}
