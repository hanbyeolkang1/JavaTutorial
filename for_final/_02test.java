package for_final;

public class _02test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 현상수배 2
		int maxvalue = 0;
		int maxindex = 0;
		int[] letter={8,12,4,13,25,14,4,5};
				for(int i = 0; i < 8; i++) {
					if(letter[i] %2==0) {
						maxindex = i;
					}
				}
						System.out.println(maxvalue);
	}

}
