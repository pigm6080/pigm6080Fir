package myJava1;

import java.util.*;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.println("�̸��� �Է��ϼ��� :");
			String ss = s.next();
			a.add(ss);
		}
		for (int i = 0; i < a.size(); i++) {
			String name = a.get(i);
			System.out.println(name + " ");
		}
		int longst = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(longst).length()<a.get(i).length()) {
				longst = i;
			}
		}
		System.out.println("\n���� �� �̸��� : " + a.get(longst));
		
		
		
		
	}

}
