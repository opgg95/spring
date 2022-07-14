package mocar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import action.Action;
import action.ActionForward;
import dao.UserDAO;
import dao.UserDTO;

public class mypage_memberAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) {
		UserDAO udao = new UserDAO();
		ActionForward forward = new ActionForward();
		
		String userid = req.getParameter("userid");
		String userpw = req.getParameter("userpw");
		
		return forward;
	}

}
