package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDB {	

	Connection con = DB_connection.getConnection();
	public int Login(String username,String password) {
		 String SQL = "Select * From login where id = ? ";
		 PreparedStatement pstmt;
		 ResultSet rs;
		try {
			pstmt = con.prepareStatement(SQL);
			pstmt.setString(1, username);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				if(rs.getString(2).equals(password)){
					return 1;
				}
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
		 
		 
	}
	


}
