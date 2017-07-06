package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.Users;

public class UsersDao  {
	
	
	public void select(){
	
		try {
			Connection con=BaseDao.getConnection();
			String sql ="select * from users";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())  
				System.out.println(rs.getInt("uid"));
		} catch (SQLException e) {
		
			e.printStackTrace();
		}  
		
		
	}
	public String  insert( Users obj){
		
		
			try {
				Connection con=BaseDao.getConnection();
				String sql ="INSERT INTO `users` ( `uname`, `busy`, `request`) VALUES (?, ?, ?)";
				
				
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1, obj.getUname());
				stmt.setInt(2, obj.getBusy());
				stmt.setInt(3, obj.getRequest());
				
				 stmt.executeUpdate();
				 return "Insert Was Successful";
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			return null;
			
			
		 
		
		
	}
/*	public static void main(String[] args) {
	
		UsersDao obj = new UsersDao();
		
		Users o1 = new Users(); 
		
		o1.setUname("kdghonta");
		o1.setBusy(0);
		o1.setRequest(0);
		
		
		obj.insert(o1);
		obj.select();
		
	
	}*/
	

}
