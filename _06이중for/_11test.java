package _06이중for;

public class _11test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		000*
		00***
		0*****
		*******
		0*****
		00***
		000*
		*/
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4+i; j++) {
				if(j >= 4-i-1) {
					System.out.print("*");
				}else {
					System.out.print("0");
				}
			}
					System.out.println();
		}
					
					
			for(int a = 1; a < 4; a++) {
				for(int b = 0; b < a+3; b++) {			// a[0] => b[0] a[1] => b[1] a[2] => b[2] a[3] => [b3]
					if(b >= a) {
						System.out.print("*");
					}else {
						System.out.print("0");
					}
				
				}
				
						System.out.println();
			}
		
		
	}

}
