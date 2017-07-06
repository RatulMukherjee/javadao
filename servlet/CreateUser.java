package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bl.UsersLogic;
import entity.Users;

/**
 * Servlet implementation class Users
 */
@WebServlet("/Users")
public class CreateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		if(req.getParameter("uname") != null && req.getParameter("busy") != null && req.getParameter("request") != null )
		{
			Users u1 = new Users();
			
			u1.setUname(req.getParameter("uname"));
			u1.setBusy(Integer.parseInt(req.getParameter("busy")));
			u1.setRequest(Integer.parseInt(req.getParameter("request")));
			
			UsersLogic ul = new UsersLogic();
			
			ul.createUser(u1);
			
			resp.getWriter().print("Inserted");
			
			
			
		}
		else
		{	
			resp.getWriter().print("ghonta");
			
			
		}
			
		
		
	}

}
