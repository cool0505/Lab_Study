package Action;
import java.util.StringTokenizer;
public class Calculate {
	String math=null;
	String scmath=null;
	public void SetCalculate (String x) {
		if(math==null) { 
			math=x;

		}
		else {
		math=math+x;

		}
	}
	public void SecCalculate (String x) {
		if(scmath==null) { 

			scmath=x;
		}
		else {
		scmath=scmath+x;
		}
	}
	public String output() {
		if (math.length()>6) {
			
		}
		return math;
	}
	
	public String Finish() {
	        StringTokenizer st = new StringTokenizer(scmath, ","); // '&'�� ���й���
	 
	        int count = st.countTokens(); // ���� ����(&)�� ���е� ���ڿ�(��ū)�� ������ count
	        System.out.println("��ū�� ������ :" + count);
	 
	        for (int i = 0; i < count; i++) {
	            String token = st.nextToken(); // �� ��ū ���
	            System.out.println(token);
		
	}
	        return "sadsad";

}
}
