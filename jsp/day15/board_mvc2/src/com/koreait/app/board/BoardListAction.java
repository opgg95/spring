package com.koreait.app.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.action.Action;
import com.koreait.action.ActionForward;
import com.koreait.app.board.dao.BoardDAO;

public class BoardListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("BoardListAction 도착");
		ActionForward forward = new ActionForward();
		BoardDAO bdao = new BoardDAO();
		
		req.setAttribute("boardList", bdao.getBoardList());
		System.out.println("조회완료");
		forward.setRedirect(false);
		forward.setPath( req.getContextPath() + "/app/board/boardlist.jsp" );
		
		return forward;
	}

}









