package _06이중for;

public class _11test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 3; i < 7; i ++) {
			for(int j = 0; j <= i; j++) {
				
				System.out.print("*");
			}
				System.out.println();
		}
		for(int i = 0; i < 6; i++) {
			for(int j = 6; j >= i; j--) {
				System.out.print("*");
			}
				System.out.println();
		}
	}

}
