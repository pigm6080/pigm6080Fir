package algorithm_01;

import java.util.Scanner;

public class HW_01 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name =" ";
		String pw =" ";
		int num;
		while(true) {
			System.out.println("=====로그인 프로그램 작동중 =====");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			num = s.nextInt();
		
			if(num == 1) {
				System.out.println("=====회원가입창 작동중 ====");
				System.out.print("아이디 :");
				name = s.next();
				System.out.print("비밀번호:");
				pw = s.next();
			}else if(num ==2) {
				System.out.print("아이디 :");
				String name1 = s.next();
				System.out.print("비밀번호 :");
				String pw1 = s.next();
				
				if(!name.equals(name1) || pw.equals(pw1)) {
					System.out.println("아이디나 비밀번호가 틀립니다.");
				}else {
					System.out.println("로그인 성공 ");
					break;
				}
				
			}
		
		
		
		}
		
	}
}
