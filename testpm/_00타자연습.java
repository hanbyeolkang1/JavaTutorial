package testpm;

import java.util.Random;
import java.util.Scanner;

public class _00타자연습 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] a = {"diamond","clover","space","heart"};
		String[] b = {"다이아몬드","클로버","스페이스","하트"};
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		int aToType = r.nextInt (a.length -1);  // 이렇게 하면 a 라는 배열에 4가지중 하나를 가져온다
		
		
			System.out.println("타자 게임에 오신것을 환영합니다.");
			System.out.println("다음 단어를 입력하세요.");
		for(int i = 0; i < a.length; i++) {
			if(a ==b) {
				System.out.println("정답입니다"+"보너스"+a[i]);
			}else {
				System.out.println("틀렸습니다. 정답은:");
			}
		}
	}

}
