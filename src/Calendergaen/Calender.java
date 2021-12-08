package Calendergaen;
import java.util.*;
public class Calender {
	int year = 0, month = 0, week = 0, day = 0, i = 0;
	static int cntp=0;
	static int cnta=0;
	int monthSet[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	public Scanner s = new Scanner(System.in);
	Calender(){}
	void Start() {
		System.out.println("원하는 연도를 입력하세요.");
		year = s.nextInt();
		System.out.println("월을 입력하세요.");
		month = s.nextInt();
		if (month < 1 || month > 12) {
			System.out.println("1월에서 12월 사이의 달을 입력해주세요.");
		}
		System.out.println("");
		yearmomth();
	}
	void yearmomth() {
		boolean t = false;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) 
			monthSet[1] = 29; 
		else
			monthSet[1] = 28; 

		day = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		for (i = 0; i < month - 1; i++) {
			day += monthSet[i];
		}
		week = day % 7;
		
		for (int i = 0; i < cntp; i++) {
			if(year == p[i].y && month == p[i].m) {
				System.out.println("***************이달에는 일정이 있습니다.***************");
				cnta = i;
				t = true;
			}
			
		}
		
		
		printCal(t);
	}
	Plan[] p = new Plan[100];
	int u=0;
	void printCal(boolean t) {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t\n", "월", "화", "수", "목", "금", "토", "일");
		for (i = 0; i < week; i++) {
			System.out.print("\t"); // 1일이 시작하기 전 공백을 위한 반복문.
		}
		for (i = 1; i <= monthSet[month - 1]; i++) {
			boolean l=false; 
			u++;
			if(p[cnta].d == u) {
				l = true;
			}
			if(t &&l) {	
				System.out.printf("%s\t",p[cnta].planN);
				week++;
				continue;
			}
			
			System.out.printf("%d\t", i); // i를 입력한 달의 일수만큼 찍음.
			week++;
			
			if (week % 7 == 0) { // 요일이 일요일이 지나면
				System.out.println(); // 줄을 바꿈.
			}	
		}
		System.out.println();
	}
	
	void add() {
		p[cntp] =new Plan();
		System.out.println("추가하실 년도를 입력해주세요");
		int a = s.nextInt();
		System.out.println(cntp);
		System.out.println(a);
		p[cntp].y = a;
		System.out.println("추가하실 월을 입력해주세요");
		p[cntp].m = s.nextInt();
		System.out.println("추가하실 일을 입력하주세요");
		p[cntp].d = s.nextInt();
		System.out.println("그날의 일정을 입력해주세요");
		p[cntp].planN = s.next();
		System.out.println("추가 완료 되었습니다.");
		cntp++;
	}
	void tot() {
		System.out.println("모든 일정 출력중..");
		for(int a=0;a<cntp;a++) {
			System.out.println("일정 년도:" + p[a].y + " 월: " + p[a].m + " 일 : " + p[a].d + " 그날 일정 :" + p[a].planN);
		}
		
	}
	void cor() {
		tot();
		System.out.println("수정하실 스케줄을 입력해주세요");
		String cName = s.next();
		int y = 0;
		boolean cor = false;
		for(int a=0;a<cntp;a++) {
			if(cName.equals(p[a].planN)) {
				y = a;
				cor = true;
			}
		}
		if(cor) {
			System.out.println("몇년도로 변경할까요?");
			p[y].y = s.nextInt();
			
			System.out.println("몇월도로 변경할까요?");
			p[y].m = s.nextInt();
			
			System.out.println("몇일도로 변경할까요?");
			p[y].d = s.nextInt();
			
			System.out.println("변경 완료 되었습니다.");
				
		}else {
			System.out.println("선택하신 일정은 없는 일정입니다.");
		}
		
		
		
		
	}
	
}
class Plan{
	public int y=0,m=0,d=0;
	String planN=" ";
	
}
