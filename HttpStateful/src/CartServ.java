

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/**
 * Servlet implementation class CartServ
 */
@WebServlet("/CartServ")
public class CartServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		String[] names = request.getParameterValues("names");
		  ArrayList<String> a = new ArrayList<String>();
		  for(String l:names)
		  {
			  a.add(l);
		  }
	      PrintWriter pw=response.getWriter();
	      HttpSession session=request.getSession();
			session.setAttribute("ArrayList",a);
	      pw.println("Products are succesffully added inside the cart <br><br>");
	      pw.println("<a href='ViewServ'>View ur Cart</a>");
	      
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}