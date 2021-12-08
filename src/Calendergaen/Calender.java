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
				System.out.println("************이달에는 일정이 있습니다.************");
				cnta = i;
				t = true;
			}
			
		}
		
		
		printCal(t);
	}
	Plan[] p = new Plan[100];
	void printCal(boolean t) {
		int o=0;
		System.out.printf("\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t\n", "월", "화", "수", "목", "금", "토", "일");
		for (i = 0; i < week+1; i++) {
			System.out.print("\t"); // 1일이 시작하기 전 공백을 위한 반복문.
		}
		for (i = 1; i <= monthSet[month - 1]; i++) {
			System.out.printf("%d\t", i); // i를 입력한 달의 일수만큼 찍음.
			week++;
			if (week % 7 == 0) { // 요일이 일요일이 지나면
				System.out.println(); // 줄을 바꿈.
				if(t) {
					System.out.print("일정     :");
					for (int j= 0; j < i%7; j++) {
						System.out.print("\t"); // 1일이 시작하기 전 공백을 위한 반복문.
					}
					if(p[cnta].d == i) {
						
						System.out.println(p[cnta].planN);
					}
					
					
				}else {
					System.out.println("일정     :");
				}
				
				System.out.print("\t");
			}
				
		}
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
		Start();
	}
	
	
}
class Plan{
	public int y=0,m=0,d=0;
	String planN=" ";
}
