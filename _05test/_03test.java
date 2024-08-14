package _05test;

import java.util.Random;

public class _03test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();   // Ctrl + shift + o
		
		
		for(int i = 0; ; i++) {
			int k = r.nextInt(100)+1;
				System.out.println(k);
			
			
			if(k %7==0) {
				
				System.out.println("행운의 숫자"+k);
				 
				 	break;
				
				
			}else {
				
				continue;
					
			}	
		}
			
		
	}

}
