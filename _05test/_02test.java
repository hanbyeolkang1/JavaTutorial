package _05test;

import java.util.Random;
import java.util.Scanner;

public class _02test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[1];
		Random r = new Random();   // Ctrl + shift + o
		
		for(int i = 0; i < lotto.length; i++) {
			int k = r.nextInt(100)+1;
			lotto[i] = k;
			if(lotto[i] %7==0) {
				System.out.println("행운의 숫자"+lotto[i]);
			
			}else {	
				System.out.println("조심해야 한다"+lotto[i]);
			}
		}
	}

}
