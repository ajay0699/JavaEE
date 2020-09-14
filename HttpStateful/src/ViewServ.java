

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class ViewServ
 */
@WebServlet("/ViewServ")
public class ViewServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {	
		PrintWriter pw=response.getWriter();
		HttpSession session=request.getSession(false);
		
		if(session!=null)
		{
			ArrayList a=(ArrayList) session.getAttribute("ArrayList");
			Iterator i=a.iterator();
			while(i.hasNext())
			{
				pw.println(i.next()+"<br>");
			}
			
		}else {
			pw.println("Session is not created");
		}
		}catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}

}