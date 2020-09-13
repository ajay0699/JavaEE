

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypack.LoginBean;

/**
 * Servlet implementation class LoginServ
 */
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("nm");
		String pass=request.getParameter("pass");
		
		boolean b=new LoginBean().check(name,pass);
		if(b)
		{
			request.setAttribute("Namee", name);
			RequestDispatcher rd=request.getRequestDispatcher("Success.jsp");
			rd.forward(request, response);
		}else
		{
			RequestDispatcher rd=request.getRequestDispatcher("Fail.jsp");
			rd.forward(request, response);
		}
	}

}
