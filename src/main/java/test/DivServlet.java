package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/dv")
public class DivServlet extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)
	throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		try
		{
			int x=Integer.parseInt(req.getParameter("v1"));
			int y=Integer.parseInt(req.getParameter("v2"));
			int z=x/y;
			
			pw.println("<html><head></head><body><br><center><h8>");
			pw.print("div"+z+"<br>");
			pw.println("</h8></body></center></html>");
			
			
			}
		catch(Exception e)
		{
			pw.println("enter only Inteer value<br>");
		}
		RequestDispatcher rd=req.getRequestDispatcher("input.html");
		rd.include(req, res);
	}	
	}