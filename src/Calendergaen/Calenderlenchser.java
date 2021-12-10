package Calendergaen;
import java.util.*;
public class Calenderlenchser {
	Scanner s = new Scanner(System.in);
	private String[] ps = new  String[2];
	static int cnt = 0;
	void Start(){
		Calender c = new Calender();
		pwtest();
		
		System.out.println("다이어리 프로그램을 시작합니다..");
		while(true) {
		System.out.println("메뉴를 선택해 주세요");
		System.out.println("1) 날짜 보기  2) 새일정 추가 3) 모든 일정 모아서 보기  4) 일정 수정하기");
		int n = s.nextInt();
		switch (n) {
		case 1: {
			c.Start();
			break;
		}
		case 2: {
			c.add();
			break;
		}
		case 3: {
			c.tot();
			break;
		}
		case 4: {
			c.cor();
			break;
		}
	}
}
}
	void pwtest() {
		String id,pw;
		while(true) {
			System.out.println("첫아이디를 입력해주세요:");
			ps[0] = s.next();
			System.out.println("첫 비밀번호를 입력해주세요 :");
			ps[1] = s.next();
			System.out.println("아이디,비밀번호설정이 완료 되었습니다.");
			System.out.println("아이디를 입력해주세요 ("+(5-cnt)+"번의기회가 남았습니다.)");
			id = s.next();
			if(ps[0].equals(id)) {
				System.out.println("비밀번호를 입력해주세요");
				pw = s.next();
				if(ps[1].equals(pw)) {
					System.out.println("로그인 성공");
					break;
				}else {
						System.out.println("비밀번호가 틀립니다.");
						cnt++;
					}
				
			}else {
				System.out.println("아이디가 틀립니다.");
				cnt++;
			}
			if(cnt >5) {
				System.exit(0);
			}
		}
	}

}
