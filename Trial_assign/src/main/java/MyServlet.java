

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		List l=new ArrayList();
		l.add("Ajay");
		l.add("Ashu");
		l.add("Dhruv");
		l.add("Mayuri p");
		l.add("Mayuri");
		l.add("Menesh");
		
		HttpSession session=request.getSession();
		session.setAttribute("ArrayList",l);
		PrintWriter pw=response.getWriter();
		pw.println("Session Created");
	}

}
