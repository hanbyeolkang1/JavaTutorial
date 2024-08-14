package for_final;

public class _03test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 비밀편지 3
		
				String c = "";		
				String word ="gehoudfkimjnlvy";
				int[] letter={8,12,3,13,1,14,3,4};
				
				for(int i = 0; i < letter.length; i++) {
				  
				 c += word.charAt(letter[i]);
				}

						System.out.println(c);
	}

}
