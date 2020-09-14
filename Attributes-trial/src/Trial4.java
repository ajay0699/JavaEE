

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Trial4
 */
@WebServlet("/Trial4")
public class Trial4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 public Trial4() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try
		{
			PrintWriter pw=response.getWriter();
			pw.println(request.getAttribute("book"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
