import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class e1 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		String name=req.getParameter("t1");
		String pass=req.getParameter("t2");
		if(name.equals("admin")&&pass.equals("password"))
		{
			PrintWriter pw=res.getWriter();
			pw.println("LOGIN SUCCESSFUL");
		}
		else
		{
			res.sendError(403);
		}
	}
}