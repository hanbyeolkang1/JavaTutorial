package _06이중for;

public class _06test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 0;
		int[] a= {34,55,23,56,34,45,34};
		int[] b= {36,49};
		/* b배열의 값보다 큰 값이 a 배열의 값에 모두 몇개가 있는가?
		 * 각각 카운팅 하시오
		 * 출력은
		 * a 배열의 값에는 36번호 보다 큰 숫자가 ??개 있습니다.
		 * a 배열의 값에는 49번호 보다 큰 숫자가 ??개 있습니다.
		 */
			for(int j = 0; j < b.length; j ++) {
				
				for(int i = 0; i < a.length; i++) {
					if(b[j] < a[i]) {
						cnt++;
					}
						
				}
						System.out.println("a 배열의 값에는"+b[j]+"보다 큰 숫가"+cnt+"개 있습니다.");
							cnt = 0;
				
			 }
			
						
			
	}

}
