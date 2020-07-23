public class For {

	public static void main(String[] args) {
		// 이중 for문 사용하여 다음과 같은 모양을 출력
		// *
		// **
		// ***
		// ****
		// *****
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}	
	}
}
