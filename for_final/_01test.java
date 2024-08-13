package for_final;

public class _01test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		// 큰놈 1
		int[] letter = { 8, 12, 4, 13, 2, 14, 4, 5 };
		int maxvalue = 0;
		int maxindex = 0;
		for (int i = 0; i < 8; i++) {
			if (letter[i] > maxvalue) {
				maxvalue = letter[i];
				maxindex = i;

			}

		}
				System.out.println(maxindex);

	
		
	}
				
}