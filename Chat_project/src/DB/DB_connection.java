package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_connection {
	static Connection con = null; // DB 연결을 위한 클래스
	public static Connection getConnection() {
			return con;
	}
	
	public DB_connection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("드라이버 검색 성공!!");
		} catch (ClassNotFoundException e) {
			//System.out.println("드라이버 검색 실패!!");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			System.out.println("error");
			e1.printStackTrace();
		}
		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb?serverTimezone=UTC", "root", "0000");
			//System.out.println("My-SQL 연결 성공!!");
		} catch (SQLException e) {
			//System.out.println("My-SQL 연결 실패!!");
			e.printStackTrace();
		}
	}
	

}
