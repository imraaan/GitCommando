import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet("Validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
        String password = request.getParameter("password");
        String validUsername = "Imran";
        String validPassword = "2708";
//        PrintWriter out = new PrintWriter(System.out);
        if (username.equals(validUsername) && password.equals(validPassword)) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
        	
        	response.sendRedirect("success.jsp");
            
        } else {
        	response.sendRedirect("error.jsp");
        }
	}
}
