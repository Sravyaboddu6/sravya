

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   String user,pass;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		//out.println("Hello Everyone");
		user=request.getParameter("user");
		pass=request.getParameter("pass");
		request.setAttribute("User",user);
		//out.println("Username"+user+"Password"+pass);
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		out.println();
		if(user.contentEquals("Sravya")&&pass.equals("Sravya"));
		
		{
			response.sendRedirect("servlet2?");
		}
	}

}
