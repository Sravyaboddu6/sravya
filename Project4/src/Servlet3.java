

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet3
 */
public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
          String name;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    PrintWriter out=response.getWriter();
		name=request.getParameter("username");
	HttpSession session=request.getSession();
	session.setAttribute("User",name);
	out.println("<a href='servlet2'>Click</a>");
		
	}

}
