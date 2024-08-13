package for_final;

public class _03test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 비밀편지 3
		
				String c = "";		
				String word ="gehoudfkimjnlvy";
				int[] letter2={8,12,3,13,1,14,3,4};
				
				for(int i = 0; i < letter2.length; i++) {
				  
				 c += word.charAt(letter2[i]);
				}

						System.out.println(c);
	}

}
