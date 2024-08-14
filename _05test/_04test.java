package _05test;

import java.util.Random;

public class _04test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[10];
		Random r = new Random();
		
		for(int i = 0; i < lotto.length; i++) {
			int num = r.nextInt(100)+1;
			lotto[i] = num;
		}	
		for(int i = 0; i < lotto.length; i++) {
			
			if(lotto[i] %2==0) {
			
				System.out.println(lotto[i]);
			}else if(lotto[i] %2==1){
				System.out.println(lotto[i]);
			}
		
		}
	}

}
