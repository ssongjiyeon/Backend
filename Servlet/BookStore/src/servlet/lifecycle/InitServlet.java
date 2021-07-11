package servlet.lifecycle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/init.jsp")
public class InitServlet extends HttpServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("init call!");
	}
}
