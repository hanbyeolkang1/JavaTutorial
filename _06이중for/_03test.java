package _06이중for;

public class _03test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 000*
		// 00***
		// 0*****
		// *******
		// 0만 보면 2번과 같다.
		// (1) 0을 for때리고, *을 for때리는 방법.
		// 
		/*	
		 *  (2) 일반적으로 줄을 i로 열을 j로 2번과 같이 푼다.
		 * 	i가 0일때 j는 0123
		 *  i가 1일때 j는 01234				// i 는 배열에 갯수
		 *  i가 2일때 j는 012345				// j 배열의 숫자
		 *  i가 3일때 j는 0123456
		 *  0.3
		 *  1.4
		 *  2.5
		 *  3.6
		 *  j=i+3
		 *  
		 *  int i=0; i<4
		 *  	int j=0; j<=3+i(끝점을 보고 수식 만들기)
		 *  012
		 *  01
		 *  0 을 경계로 0찍기 *찍기로 나뉨
		 *  --> if문으로 조건걸어서 바꾸기
		 *  
		 *  for(int i=0; i<4; i++) {
		 *  	for(int j=0; j<=3+i; j++) {
		 *  		if(j>=4-i-1) {
		 *  			system.out.print("*");
		 *  		}else {
	 	 *  			system.out.print("0");
	 	 *  		}
	 	 *  	}
 		 *  }
		 *	  		
		 */
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4+i; j++) {
				if(j >= 4-i-1) {
					System.out.print("*");
				}else {
					System.out.print("0");
			}
				
		}		
					System.out.println();
			
	}
		
	}

}

