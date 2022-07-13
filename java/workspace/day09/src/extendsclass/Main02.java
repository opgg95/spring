package extendsclass;

public class Main02 {

	public static void main(String[] args) {
		QNAArticle qna = new QNAArticle();
		qna.setNum(1);
		qna.setTitle("첫 번째 질문입니다.");
		qna.setAnswer("첫 번째 답변입니다.");
		
		
//		System.out.println(qna.getNum());
//		System.out.println(qna.getTitle());
//		System.out.println(qna.getAnswer());
		
		System.out.println("질문/답변 [글번호 = " + qna.getNum()
		+ ", 제목 = " + qna.getTitle()
		+ ", 답변 = " + qna.getAnswer());
		
		System.out.println(qna.toString());
		
		System.out.println("======================");
		
		FileArticle file = new FileArticle();
		file.setNum(10);
		file.setTitle("10번째 자료입니다.");
		file.setFileName("day10.ppt");
		System.out.println(file.toString());
	}

}
