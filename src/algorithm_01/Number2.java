package algorithm_01;

import java.util.Scanner;

public class Number2 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
	
		System.out.print("윗변의 별표 갯수는 :");
		
		int n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 5-i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		
	}
	
}
