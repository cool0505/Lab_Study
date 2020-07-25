package Sign_Login;

import java.sql.*;

public class insert_DAO {

	Input input = new Input();
	connect_DAO connect = new connect_DAO();
	
	Statement stmt =  null;
	int r = 0;
	
	public void insert() {
		
		Connection conn = connect.getDB();
		
		System.out.println("name : ");
		String name = input.getString();
		System.out.println("ID : ");
		String id = input.getString();
		System.out.println("PW : ");
		String pw = input.getString();
		
		try {
			stmt = conn.createStatement();
			r = stmt.executeUpdate("insert into user" + "(Name, ID, PW) value ('"
					+ name + "','" + id + "','" + pw + "')");
			if(r==1)
				System.out.println("추가 성공");
			else System.out.println("추가 실패");
			
			stmt.close();
		} catch (SQLException ex) {
	        System.out.println("SQLException:" + ex);
	    } catch (Exception e) {
	        System.out.println("Exception:" + e);
	    }
	}
}
