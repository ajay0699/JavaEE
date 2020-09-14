

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
		ArrayList<String> l= (ArrayList<String>) request.getAttribute("ArrayList");
		PrintWriter pw=response.getWriter();
		pw.println("Inside servlet2 <br>");
		Iterator i=l.iterator();
		while(i.hasNext())
		{
			pw.println(i.next()+"<br>");
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}