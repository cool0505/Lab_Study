package Sign_Login;
 
public class Operator {
    
	Input input = new Input();
	insert_DAO in = new insert_DAO();
	delete_DAO del = new delete_DAO();
	edit_DAO ed = new edit_DAO();
	
    public static void main(String args[]) {
    	
    	Operator opt = new Operator();
    	opt.startwork();
    }
    
    void startwork() {
    	
    	int x;
    	
    	while(true) {
    		System.out.println("1. 입력\n2. 수정\n3. 삭제\n4. 종료\n");
        	x = input.getInteger();
    		
    		if(x == 1)
    			in.insert();
    		else if (x == 2)
    			ed.edit();
    		else if (x == 3)
    			del.delete();
    		else if (x == 4)
    			break;
    	}
    }
}