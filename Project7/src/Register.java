
import java.sql.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
		String name,pass,email,country;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		name=request.getParameter("username");
		pass=request.getParameter("userpass");
		email=request.getParameter("useremail");
		country=request.getParameter("usercountry");
		try {
			Class.forName("com.mysql.jdbc.Driver");out.println("rows updated1");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/sravya_db","root","");out.println("rows updated2");
	        Statement st= c.createStatement();out.println("rows updated3");
			int count=st.executeUpdate("insert into sravya_db.student values('"+name+"','"+pass+"','"+email+"','"+country+"')");out.println("rows updated4");
			out.println(count+"rows updated");
		}
		catch(Exception e) {
			
		}
		
	}

}
