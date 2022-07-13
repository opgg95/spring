package com.koreait.shop.user;

/*
 * 이러한 번거로움을 피하고자 클래스 정의 전에
 * import 구문을 사용하여 특정 클래스의 이름이 어떤 패키지에
 * 소속되어 있는지를 명시할 수 있다.
 */
import com.koreait.shop.board.Article;

public class Main01 {

	public static void main(String[] args) {
		Article.setCategory("공지사항");
		
		Article article = new Article(1,"첫번째글", "2022-03-28");
	}

}
