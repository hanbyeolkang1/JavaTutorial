package _05test;

import java.util.Random;
import java.util.Scanner;

public class _00test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[6];
		
		Scanner in = new Scanner(System.in); // ctrl + shift o
		
		// 0번째 번호부터 로또 번호 입력받기
		for (int i = 0; i < lotto.length; i++) {
			System.out.println((i + 1) + "숫자를 입력하세요");
			int k = in.nextInt();  // nextInt는 키보드로 숫자만 가져온다.
			in.nextLine();  // 버퍼 지우기
			lotto[i] = k;
		// 로또 번호를 출력하는 반복문
	
			if(k %2==1) {
				System.out.println("홀");
			}else {
				System.out.println("짝");
			}
		
		}	
		
	
		}
}
