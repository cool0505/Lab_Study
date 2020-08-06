package Sign_Login;

import java.sql.*;

public class connect_DAO {

	public Connection getDB() {
	
		Connection conn = null;
	    
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sign_up?serverTimezone=UTC", "root", "Rlanwjd67!");
	        System.out.println("Success!");
	    } catch (SQLException ex) {
	        System.out.println("SQLException:" + ex);
	    } catch (Exception e) {
	        System.out.println("Exception:" + e);
	    }
	    
	    return conn;
	}
}
