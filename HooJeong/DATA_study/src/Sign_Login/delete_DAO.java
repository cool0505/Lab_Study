package Sign_Login;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class delete_DAO {

	Input input = new Input();
	connect_DAO connect = new connect_DAO();
	
	Statement stmt =  null;
	int r = 0;
	
	public void delete() {
		
		Connection conn = connect.getDB();
		
		System.out.println("삭제 할 ID : ");
		String del_id = input.getString();
		
		try {
			stmt = conn.createStatement();
			r = stmt.executeUpdate("delete from user where ID = '" + del_id + "';");
			
			if(r==1)
				System.out.println("삭제 성공");
			else System.out.println("삭제 실패");
			
			stmt.close();
		} catch (SQLException ex) {
	        System.out.println("SQLException:" + ex);
	    } catch (Exception e) {
	        System.out.println("Exception:" + e);
	    }
	}
}
