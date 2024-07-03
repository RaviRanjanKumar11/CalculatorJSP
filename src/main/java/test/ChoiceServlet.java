package test;
import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/choice")
public class ChoiceServlet extends GenericServlet
{

public void service(ServletRequest req,ServletResponse res)
throws ServletException,IOException
{
	String s1=req.getParameter("s1");
	
	if(s1.equals("add"))
	{
		RequestDispatcher rd=req.getRequestDispatcher("ad");
		rd.forward(req,res);
		
    }
	  else if(s1.equals("sub")) 
	{
		RequestDispatcher rd=req.getRequestDispatcher("sb");
		rd.forward(req,res);
	}
	  else if(s1.equals("mult")) 
		{
			RequestDispatcher rd=req.getRequestDispatcher("mt");
			rd.forward(req,res);
		}
	  else if(s1.equals("div")) 
		{
			RequestDispatcher rd=req.getRequestDispatcher("dv");
			rd.forward(req,res);
		}
	  else
	  {
			RequestDispatcher rd=req.getRequestDispatcher("mdv");
			rd.forward(req,res);
		}
  }
}
