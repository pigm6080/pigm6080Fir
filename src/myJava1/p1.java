package myJava1;

import java.util.*;


public class p1 {

	public static void main(String[] args) {
			ArrayList l_1 = new ArrayList();
			List l_2 = new ArrayList();
		//	List l_3 = new List(); List 는 인터페이스, ArayList,LinkedList
			l_1.add(new Integer(3));//object 단위로 처리
			l_1.add(new Integer(7));//object 단위로 처리
			l_1.add(new Integer(4));//object 단위로 처리
			l_1.add(new Integer(9));//object 단위로 처리
			l_1.add(new Integer(0));//object 단위로 처리
			
			ArrayList l_4 = new ArrayList(l_1.subList(1, 4)); //일부만 추출하여생성
			
			System.out.println(l_1.get(2));
			System.out.println(l_4);
			Collections.sort(l_1);
			Collections.sort(l_4);
		
			print(l_1,l_4);
			l_1.remove(2);
			l_1.retainAll(l_4); //ㅣ_4에 있는 항목 제외 나머지삭제.
			
			
	}
	static void print(ArrayList i_1,ArrayList i_2) {
		System.out.println(i_1);
		System.out.println(i_2);
	}

}