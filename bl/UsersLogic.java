package bl;

import dao.UsersDao;
import entity.Users;

public class UsersLogic {
	
	private UsersDao udao;
	
	public UsersLogic()
	{
		this.udao = new UsersDao();
		
	}
	
	public String createUser(Users obj){
		
		
		 String result=this.udao.insert(obj);
		 System.out.println(result);
		 return result;
	}
/*	public static void main(String[] args) {
		
		UsersLogic obj = new UsersLogic();
		
		Users o1 = new Users();
		o1.setUname("dabba123123");
		o1.setBusy(0);
		o1.setRequest(0);
		
		obj.createUser(o1);
	}*/
	
	

}
