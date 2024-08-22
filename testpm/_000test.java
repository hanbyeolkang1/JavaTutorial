package testpm;

import java.util.Random;

public class _000test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] array = {10, 20, 30, 40, 50};
	        Random random = new Random();

	        // 배열을 랜덤하게 섞기 (Fisher-Yates shuffle 알고리즘)
	        for (int i = array.length - 1; i > 0; i--) {
	            int j = random.nextInt(i + 1);
	            // 인덱스 i와 j를 교환
	            int temp = array[i];
	            array[i] = array[j];
	            array[j] = temp;
	        }

	        // 랜덤하게 섞인 배열의 값을 출력
	        for (int value : array) {
	            System.out.println("Value: " + value);
	        }
	}

}
