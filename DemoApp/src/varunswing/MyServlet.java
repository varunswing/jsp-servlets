package varunswing;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter out = res.getWriter();
		out.print("Hi ");
		
		ServletConfig cg = getServletConfig();
		String str = cg.getInitParameter("name");
		out.println(str);
		
		ServletContext ct = getServletContext();
		String pn = ct.getInitParameter("phone");
		out.println("Using " + pn);
		
		
	}

}
