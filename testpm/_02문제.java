package testpm;

public class _02문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문제 1
		int a =80;
		
		if(a >= 80) {
			System.out.println("합격");
		}else{
			System.out.println("불합격");
		}
		// 문제 2
		int level =2;
		int point =30;
		
		if(level <= 10) {
			point+=10;
		}
		System.out.println(point);
		
		// 문제 3
		int[] lotto= new int[6];
			lotto[0]=6;
			lotto[1]=12;
			lotto[2]=33;
			lotto[3]=4;
			lotto[4]=5;
			lotto[5]=26;
			lotto[2]=lotto[2]+80;
			System.out.println(lotto[2]);
			
		
		// 문제 4
			lotto[0]=6;
			lotto[1]=12;
			lotto[2]=33;
			lotto[3]=4;
			lotto[4]=5;
			lotto[5]=26;
			int sum = 0;
			if(lotto[0] %2==0) {
				sum += lotto[0] ;
			}
			if(lotto[1] %2==0) {
				sum += lotto[1];
			}
			if(lotto[2] %2==1) {
				sum += lotto[2];
			}	
			if(lotto[3] %2==0) {
				sum += lotto[3];
			}	
			if(lotto[4] %2==1) {
				sum += lotto[4];
			}
			if(lotto[5] %2==0) {
				sum += lotto[5];
			}
			System.out.println("짝수");
		
			
		// 문제 5
			lotto[0]=6;
			lotto[1]=12;
			lotto[2]=33;
			lotto[3]=4;
			lotto[4]=5;
			lotto[5]=26;
			int sum1 = 0;

			
			if(lotto[0]%2==1) {
				sum1 += lotto[0];
			}
			if(lotto[1]%2==1) {
				sum1 += lotto[1];
			}	
			if(lotto[2]%2==1) {
				sum1 += lotto[2];
			}
			if(lotto[3]%2==1) {
				sum1 += lotto[3];
			}
			if(lotto[4]%2==1) {
				sum1 += lotto[4];
			}
			if(lotto[5]%2==1) {
				sum1 += lotto[5];
			}			
			System.out.println(sum1);
			
		// 문제 6
			lotto[0]=45;
			lotto[1]=34;
			lotto[2]=64;
			lotto[3]=45;
			lotto[4]=24;
			
			System.out.println(lotto[0]+lotto[1]+lotto[2]+lotto[3]+lotto[4]);
			
		// 문제 7
		int[] b = {45,34,64,};
		// 문제 8
		int[] x = {6,5,9};
		int[] y = {4,10,6};
		int[] number = {3,2};
		
		// 문제 9
		int[] x1 = {10};
		int[] y2 = {20};
		int[] x3 = {11};
		int[] y4 = {5};
		
		
	 }
	}
