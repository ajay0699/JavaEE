

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Trial3
 */
@WebServlet("/Trial3")
public class Trial3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
		request.setAttribute("book","java");
		PrintWriter pw=response.getWriter();
		pw.println("Session created");
		RequestDispatcher rd=request.getRequestDispatcher("Trial4");
		rd.forward(request,response);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
