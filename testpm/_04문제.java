package testpm;

public class _04문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 1
		
		for(int i = 100; i < 1000; i++) {
			if(i %2==1) {
		
				System.out.print(i+",");
			
			}
		}	
				System.out.println(" ");
		// 문제 2
		int sum = 0;
		for(int i = 1; i < 100; i++) {
			if(i %2==1) {
				sum += i;
			}
			
		}
					System.out.println(sum);
		
		// 문제 3
		
		for(int i = 10; i > 0; i--) {
			
			
			System.out.print(i+",");
		}
			System.out.println(" ");
			
		// 문제 4
		// int[] arr = {45,23,25,64,3,24,48}; // {}안의 숫자:value(값) 
		// [] : index 인덱스, arr[인덱스숫자] = value
		int[] arr = {45,23,25,64,3,24,48};
		for(int i = 0; i < 7; i++) {

			if(arr[i]%2 == 0) {
				System.out.print(arr[i]+",");
			}
		}
				System.out.println(" ");
				
		// 문제 6
		
		for(int i = 0; i < 7; i++) {
			if(arr[i]%2== 1) {
				System.out.print(i+",");
			}
		}
				System.out.println(" ");
		// 문제 7
		
		for(int i = 0; i < 7; i++) {
			if(i %2==1) {
				sum += i;
			}
			if(i %2==1) {
				sum += i;
			}
			if(i %2==1) {
				sum += i;
			}
			if(i %2==0) {
				sum += i;
			}
			if(i %2==1) {
				sum += i;
			}
			if(i %2==0) {
				sum += i;
			}
			if(i %2==0) {
				sum += i;
				
			}
		}
			System.out.println(sum);	
		// 문제 8
		int cnt = 0;
		for(int i = 0; i < 7; i++) {
			if(i %2==0) {
				cnt += i;
			}
			
				System.out.println(cnt);
			}
			
			
		 }
				
				
		/* 문제 13
		int[] arr1 = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,0,0,0,0,0,3,3};
		int arrlength = 1;
		int maxlength = 0;
		int cnt = 0
		
		
		for(int i = 0; i < arrlength; i ++) {
			if(arr1[i]==0) {
				cnt ++;
			}else { cnt = 0; {
				maxlength = cnt; {
					System.out.println(maxlength);
					
				}
			}
		}
	} 
	}
	*/
}
