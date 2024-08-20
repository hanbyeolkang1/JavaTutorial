package _06이중for;

public class _02test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i++) {
			for(int j = 4; j >= i; j--) {	// i든 j 든 값을 조정하면 갯수가 바뀐다
				System.out.print("*");
			}
				System.out.println();
		}
		
	
	}

}
