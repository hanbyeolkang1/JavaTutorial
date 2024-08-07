package _02if;

public class _00_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Basic

			영수는 게임을 개발중인데
			명중에 따라 점수를 차등 부여 하는 알고리즘을 개발 중이다.
			int point=20;
			int x=40; // x는 화살의 위치이며 화살의 위치는 달라진다.
			화살의 위치가 0에서 12사이이면 +10점
			13-20 사이이면 +9점
			21-30 사이이면 +8
			31이상이면 +7 점을 부여한다


			up1
			0부터 12사이면 +10점을 획득하고
			0-1 사이이면 보너스 점수를 획득한다. 보너스 점수는 현재 point의 10% 이다.
		*/
		
		//Basic
		int point=20;
		int x=40;
		
		if(x >=0 && x <= 12) {
			point+=10;
		}else if(x <= 20) {
			point+=9;
		}else if(x <= 30) {
			point+=8;
		}else if(x > 30) {
			point+=7;
		}
		System.out.println(point);
		
		//up1 solution
		if(x >=0 && x <= 12) {
			if(x >=0 && x <=1) {
				point += point*0.1;
			}
			point+=10;
		}else if(x <=20) {
			point+=9;
		}else if(x <=30) {
			point+=8;
		}else if(x >30)  {
			point+=7;
		}
		System.out.println(point);
		
		
		/* 수강관리 프로젝트를 진행한다
			학생의 정보는 이름 학번 나이 성적이다.
			나이가 18세 미만은 수강신청을 할 수 없다.
			성적이 60점 이상이면서 70점 미만인 학생은 수강 신청을 할 수 있지만.
			이름 뒤에 발표를 기준으로
			90점 이상이면 A
			80점 이상이면 B
			70점 이상이면 C
			60점 이상이면 D
			60점 미만이면 F라고 출력한다.*/
		
		int age =18;
		int z =90;
		int q =80;
		int c =70;
		int d =60;
		
		
		if(age > 18) {
			System.out.println("나이");
		}else {
			System.out.println("18세 미만은 수강신청을 할 수 없습니다.");
		}
		if (z >= 70);
			System.out.println("60점 이상 70점 미만인 학생은 수강신청을 할수 있습니다.");
			
		if(z >= 90) {
			System.out.println("A");
		}
		if(q >= 80) {
			System.out.println("B");
		}
		if(c >= 70) {
			System.out.println("C");
		}
		if(d >= 60) {
			System.out.println("D");
		}
		if(d < 60) {
			System.out.println("F");
		}
		
		/*
		int a = 10;
		int b = 20;
		int my =15;
		문제 a와 b는 도로의 길이이며 위치이다.
		my는 나의 위치이다
		내가 도로위에 있으면 도로위..도로위가 아니라면 도로가아님이라고 출력하시오

		up1
		만약 내가 도로 위라면
		a 지점으로 부터 5(my 위치에 따라 달라짐)만큼 떨어져 있습니다 라고 출력하시오

		up2
		up1에서 현재 my의 위치가 가까운 쪽 기준으로 출력한다
		예를들어 my 18이면 bdp 더 가까우니 b에서 부터 2거리 떨어져 있습니다
		*/
		
		int a = 10;
		int b = 20;
		int my =18;
		
		//up1
		 if( a <= my && my <= b) {
			 System.out.println("도로 위");
		 }else {
			 System.out.println("도로가 아님");
		 }
		//up2
		 if( a <= my && my <= b) {
			 System.out.println("도로 위");
			 int distanceCenter = a+(b-a)/2;
			 System.out.println(distanceCenter);
			 if(my <= distanceCenter) {
				 System.out.println("a로 부터 "+(my-a));
			 }else {
				 System.out.println("b로 부터 "+(b-my));
			 }
		 }else {
			 System.out.println("도로가 아님");
		 }

		}
					
	}

