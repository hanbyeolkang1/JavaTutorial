package _06이중for;

public class _00Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	*
		//	**
		//	***
		//	****
		// 1 줄을 출력
		// 2 줄에서 1열의 순서대로 * 출력
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
				System.out.println();
		}
		 String id ="abc*";
		 String sign="*^$";	// 특수문자를 정의 ( *나 ^ 나 $ 나 특수문자)
		// 문제 id에 특수문자가 있는가?
		 int cnt = 0;
		 for(int i = 0; i < sign.length(); i++) {
			 for(int j = 0; j < id.length(); j++) {
				 if(sign.charAt(i)==id.charAt(j)) {
					 	cnt++;
				 }
				 
				 }
			
			 }
		 if(cnt>0) {
			 System.out.println("특수문자 찾기");
			 
		 }
	}

}
