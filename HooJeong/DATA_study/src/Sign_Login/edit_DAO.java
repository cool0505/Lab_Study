package Sign_Login;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class edit_DAO {

	Input input = new Input();
	connect_DAO connect = new connect_DAO();
	
	Statement stmt =  null;
	int r = 0;
	
	public void edit() {
		
		Connection conn = connect.getDB();
		
		System.out.println("수정 할 ID : ");
		String where_id = input.getString();
		System.out.println("수정 내용 : \nex) Name/ID/PW = '변경사항'");
		String ed_content = input.getString();
		
		try {
			stmt = conn.createStatement();
			r = stmt.executeUpdate("update user set " + ed_content + " where ID = '" + where_id + "';");
			if(r==1)
				System.out.println("수정 성공");
			else System.out.println("수정 실패");
			
			stmt.close();
		} catch (SQLException ex) {
	        System.out.println("SQLException:" + ex);
	    } catch (Exception e) {
	        System.out.println("Exception:" + e);
	    }
	}
}
