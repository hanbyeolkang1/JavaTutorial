package testpm;

public class _01문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 기본 문제1
		int[] rest = new int[5];
		
		rest[0]=30;
		rest[1]=40;
		rest[2]=50;
		rest[3]=60;
		rest[4]=55;
		System.out.println(rest[0]+"/"+rest[1]+"/"+rest[2]+"/"+rest[3]+"/"+rest[4]);
		
		// 기본 문제2
		String name = null;
		name = ("kim/"+"lee/"+"park");
		System.out.println(name);
		
		// 기본 문제3
		int[] lotto = new int[6];
		
		lotto[0]=6;
		lotto[1]=12;
		lotto[2]=33;
		lotto[3]=4;
		lotto[4]=5;
		lotto[5]=26;
		lotto[2]=lotto[2]+2;
		System.out.println(lotto[0]+"/"+lotto[1]+"/"+lotto[2]+"/"+lotto[3]+"/"+lotto[4]+"/"+lotto[5]);
		
		// 기본 문제4
		lotto[0]=6;
		lotto[1]=12;
		lotto[2]=33;
		lotto[3]=4;
		lotto[4]=5;
		lotto[5]=26;
		System.out.println(lotto[0]+"/"+lotto[1]+"/"+lotto[2]+"/"+lotto[3]+"/"+lotto[4]+"/"+lotto[5]);
		lotto[0]=6;
		lotto[1]=12;
		lotto[2]=33;
		lotto[3]=4;
		lotto[4]=5;
		lotto[5]=26;
		lotto[0]=lotto[0]+lotto[2]+lotto[4];
		lotto[2]=lotto[0]+lotto[2]+lotto[4];
		lotto[4]=lotto[0]+lotto[2]+lotto[4];
		System.out.println(lotto[0]+"/"+lotto[2]+"/"+lotto[4]);
		
		// 중 문제5
		lotto[0]=6;
		lotto[1]=12;
		lotto[2]=33;
		lotto[3]=4;
		lotto[4]=5;
		lotto[5]=26;
		lotto[0]=lotto[0]+lotto[1];
		lotto[1]=lotto[1]+lotto[2];
		lotto[2]=lotto[2]+lotto[3];
		lotto[3]=lotto[3]+lotto[4];
		lotto[4]=lotto[4]+lotto[5];
		
		System.out.println(lotto[0]+"/"+lotto[1]+"/"+lotto[2]+"/"+lotto[3]+"/"+lotto[4]+"/"+lotto[5]);
		
		// 중 문제6
		int a = 4;
		System.out.println(a%4!=0);
		
		// 중 문제7
		int money =2750;
		int pay =10000;
		int b =pay-money;
		
		System.out.println();
		System.out.println(pay-money);
		System.out.println("천원:"+"7개/"+"백원:"+"2개/"+"십원:"+"5개");
		
		
		// 상 문제8
		int xA =700;
		int yA =500;
		int xB =900;
		int yB =300;
		
		int xC =650;
		int yC =150;
		
		boolean result1 = (xB > xC && xA < xC) && (yB < yC && yA > yC);
		System.out.println(result1);
	}
	

}