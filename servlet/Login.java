package servlet;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Login")
public class Login extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	public Login() {
		super();
	}	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		resp.addHeader("Access-Control-Allow-Origin", "*");

		
		//resp.getWriter().print(req.getParameter("accno"));
		if(req.getParameter("accno") != null){
			if(req.getParameter("accno").equalsIgnoreCase("100124")){
				String json="{\"error\":\"null\",\"data\":[{\"date\":\"2017-06-21\",\"totalCalls\":\"361\",\"totalTime\":\"0:21\",\"totalCharge\":\"0.00469\"},{\"date\":\"2017-06-22\",\"totalCalls\":\"26313\",\"totalTime\":\"1143:59\",\"totalCharge\":\"15.329464000000154\"},{\"date\":\"2017-06-23\",\"totalCalls\":\"28848\",\"totalTime\":\"1269:51\",\"totalCharge\":\"17.016081200000027\"}]}";
				resp.getWriter().print(json);
			}
		}else
			resp.getWriter().print("ghonta");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.getWriter().print("mukhe ne! "+req.getParameter("name"));
	}
	

}
