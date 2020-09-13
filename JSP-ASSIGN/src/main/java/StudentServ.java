

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServ
 */
public class StudentServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	private Connection conn;
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/db";
			conn=DriverManager.getConnection(url,"root","root");
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
try {
			
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
		int rollno=Integer.parseInt(request.getParameter("rollno"));
		String name =request.getParameter("name");
		int age=Integer.parseInt(request.getParameter("age"));
		String address =request.getParameter("address");
		
		PreparedStatement pst=conn.prepareStatement("insert into student values(?,?,?,?)");
		pst.setInt(1,rollno);
		pst.setString(2,name);
		pst.setInt(3,age);
		pst.setString(4,address);
		
			int k=pst.executeUpdate();
			if(k>0)
			{
				pw.println("Record has been added");
				PreparedStatement retrive=conn.prepareStatement("select rollno from student");
				ResultSet rs=retrive.executeQuery();
				List<Integer> l=new ArrayList<Integer>();
				while(rs.next())
				{
					l.add(rs.getInt(1));
				}
				request.setAttribute("ArrayList", l);
				RequestDispatcher rd=request.getRequestDispatcher("Report.jsp");
				rd.forward(request, response);
				//pw.println(l);
			}
			else
			{
				pw.println("cannot add");
			}
		
			
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}

}
