package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDao {

	private static Connection con =null;

	private BaseDao() {

	}

	public static Connection getConnection(){

		if(con==null){	
			 
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");  
					con=DriverManager.getConnection(  
							"jdbc:mysql://localhost:3306/game","root","");
					System.out.println("Connected");
				} catch (ClassNotFoundException e) {
					
					e.printStackTrace();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
		}
		return con;
	} 


}


