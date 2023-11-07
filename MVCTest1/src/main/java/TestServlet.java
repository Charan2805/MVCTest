

import java.io.IOException;



import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public TestServlet() {
    	super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Validation v;
		v=new Validation();
		//Date today=new Date();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>AdminHome</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<centre>");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		out.println("<h1>");
		out.println("username :"+username);
		out.println("<br>");
		out.println("password :"+password);
		out.println("</h1>");
		if(v.validate(username, password)) {
			out.println("welcome :"+username);
			HttpSession session=request.getSession(true);
			session.setAttribute(username, username);
			response.sendRedirect("Success.jsp");
			
		}
		else{
			RequestDispatcher rd=request.getRequestDispatcher("Error.jsp");
			rd.forward(request, response);
		}
		//out.println(today);
		out.println("</centre>");
		out.println("</body>");
		out.println("</html>");
		}
//		doGet(request, response);
	}


