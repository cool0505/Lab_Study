
public class User {
	
	String User_ID;
	String User_PW;
	
	Input in = new Input();
	
	public String getUser_ID() {
		return User_ID;
	}

	public void setUser_ID(String user_ID) {
		User_ID = user_ID;
	}

	public String getUser_PW() {
		return User_PW;
	}

	public void setUser_PW(String user_PW) {
		User_PW = user_PW;
	}

	public User() {
		System.out.println("���̵�");
		User_ID=in.Input_string();
		System.out.println("��й�ȣ");
		User_PW=in.Input_string();
		
	// TODO Auto-generated constructor stub
}
	

}
