

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Subjectserv
 */
public class Subjectserv extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String sub=request.getParameter("Subject");
			if(sub.equalsIgnoreCase("java"))
			{
				RequestDispatcher rd=request.getRequestDispatcher("j2se.jsp");
				rd.forward(request,response);		
			}else if(sub.equalsIgnoreCase("Cplusplus"))
			{
				RequestDispatcher rd=request.getRequestDispatcher("cplusplus.jsp");
				rd.forward(request,response);		
			}else
			{
				RequestDispatcher rd=request.getRequestDispatcher("ora.jsp");
				rd.forward(request,response);		
			}
		}catch(Exception ee) 
		{
			ee.printStackTrace();
		}
	}

}
