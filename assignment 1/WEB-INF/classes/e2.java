import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class e2 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		String name=req.getParameter("t3");
		String pass=req.getParameter("t4");
		if(name.equals("admin")&&pass.equals("password"))
		{
			String url=res.encodeRedirectURL("home");
			res.sendRedirect(url);
		}
		else
		{
			res.sendError(403,"Incorrect");
		}
	}
}