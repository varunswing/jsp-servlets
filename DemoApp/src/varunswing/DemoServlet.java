package varunswing;

import java.awt.List;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		java.util.List<Student> studs = Arrays.asList(new Student(1, "Navin"), new Student(2, "Varun"), new Student(1, "Vipul"));
		
		
		req.setAttribute("students", studs);
		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
		rd.forward(req, res);
		
	}
}
