package mocar;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.ActionForward;

@WebServlet("*.mc")
public class BoardFrontController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String requestURI = req.getRequestURI();
		ActionForward forward = null;
		System.out.println(requestURI);
		switch (requestURI) {
		case "/board/Boardlist.mc":
			forward = new BoardListAction().execute(req, resp);
			break;
		case "/board/BoardWrite.mc":
			forward = new ActionForward(true, req.getContextPath() + "/app/board/boardwrite.jsp");
			break;
		case "/board/BoardWriteOk.mc":
			forward = new BoardWriteOkAction().execute(req, resp);
			break;
		case "/board/BoardView.mc":
			forward = new BoardViewAction().execute(req, resp);
			break;
		case "/board/BoardModify.mc":
			forward = new BoardModifyAction().execute(req, resp);
			break;
		case "/board/BoardModifyOk.mc":
			forward = new BoardModifyOkAction().execute(req, resp);
			break;
		case "/board/DeleteBoard.mc":
			forward = new DeleteBoardAction().execute(req, resp);
			break;
			
		
		case "/board/AddReply.mc": 
			 forward = new AddReplyAction().execute(req, resp);
			break; 
		  
		case "/board/UpdateReply.mc": 
			 forward = new UpdateReplyAction().execute(req, resp); 
			break; 
			
		
			
			
		case "/board/DeleteReply.mc":
			forward = new DeleteReplyAction().execute(req, resp);
		  	break;
		 
		}

		if (forward != null) {
			if (forward.isRedirect()) { // redirect
				resp.sendRedirect(forward.getPath());
			} else { // forward
				RequestDispatcher disp = req.getRequestDispatcher(forward.getPath());
				disp.forward(req, resp);
			}
		}

	}

}
