package _06이중for;

public class _04test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 7-i; j++) {
				if(j >= i) {
					System.out.print("*");	
				}else {
					System.out.print("0");
				}
			}
					System.out.println();
		}
					
	}

}
