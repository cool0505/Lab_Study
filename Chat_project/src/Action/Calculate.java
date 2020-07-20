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
	        StringTokenizer st = new StringTokenizer(scmath, ","); // '&'는 구분문자
	 
	        int count = st.countTokens(); // 구분 문자(&)로 구분된 문자열(토큰)의 개수를 count
	        System.out.println("토큰의 개수는 :" + count);
	 
	        for (int i = 0; i < count; i++) {
	            String token = st.nextToken(); // 각 토큰 출력
	            System.out.println(token);
		
	}
	        return "sadsad";

}
}
