package mocar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.ActionForward;
import dao.BoardDAO;

public class DeleteBoardAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) {
		ActionForward forward = new ActionForward();
		BoardDAO bdao = new BoardDAO();
		int boardnum = Integer.parseInt(req.getParameter("boardnum"));
//		boolean boardnum = req.getParameter("boardnum");
		if(bdao.deleteBoard(boardnum)) {
			forward.setRedirect(true);
			forward.setPath(req.getContextPath()+ "/board/BoardView.mc?boardnum=" + boardnum);
		}
		return forward;
	}

}
