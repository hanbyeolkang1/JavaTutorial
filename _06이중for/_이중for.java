package _06이중for;

public class _이중for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ex 3
		일주일은 일요일부터 시작
		하루는 0시부터 24시까지이다
		일요일부터 일주일의 시간을 
		1시간 단위로 출력해라

		for {

		for{
		}
		}
		
		
		시나리오 : 1단 부터 4단 출력

		for(int 단 = 0;  단 < 5 ; 단++1) {
		for(int i =1; i < 5 ; i++) {
			syout(단 +"*"+i =(단+1));
	*/
		
		
		for(int dan=1; dan < 5; dan++) {
			// system.out.println(dan)
			for(int i=0; i < 5; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
		}
		
		// →***
		// →***
		// →***
		// →***
		
		for(int i = 0; i < 4 ; i++){
			 for (int j =0; j < 3 ; j++){
				System.out.print("*");
			}
			 	System.out.println();
			}
		
		// 문제를 분석 후 i를 무엇으 볼것인가  i의 변화에 있다
		//			  j를 무엇으로 볼것인가 j가 반복인가
		//	i = 0 	i = 1	i = 2	i = 2
		//	j = 0 	j = 0 	j = 0	j = 0
		//		1		1		1		1
		//		2		2		2		2
	}

}
