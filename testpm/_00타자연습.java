package testpm;

import java.util.Random;
import java.util.Scanner;

public class _00타자연습 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] a = {"diamond","clover","space","heart","","royalflysh","straightflush","fourofakind","fullhouse"};
		String[] b = {"다이아몬드","클로버","스페이스","하트","로얄플러쉬","스트레이트플러쉬","포카드","풀하우스"};
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		int score = 0;
		
		
			
		for(int i = 0; i < 10; i++) {
			int aToType = r.nextInt(a.length);  // 이렇게 하면 a 라는 배열에 4가지중 하나를 가져온다
			System.out.println("다음 단어를 입력하세요.");
			System.out.println(a[aToType]);
			String inputb = in.next();
			if(b[aToType].equals(inputb)) {
					score += 20;
					
				System.out.println("정답입니다");
			}else {
				System.out.println("틀렸습니다. 정답은:");
			}
				System.out.println("현재 점수는"+score+"입니다");
		}
			if(score == 100) {
				System.out.println("100점 달성");
			}else {
				System.out.println("최정점수"+score+"점");
			}
	}

}
