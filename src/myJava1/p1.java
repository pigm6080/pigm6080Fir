package myJava1;

import java.util.*;


public class p1 {

	public static void main(String[] args) {
			ArrayList l_1 = new ArrayList();
			List l_2 = new ArrayList();
		//	List l_3 = new List(); List �� �������̽�, ArayList,LinkedList
			l_1.add(new Integer(3));//object ������ ó��
			l_1.add(new Integer(7));//object ������ ó��
			l_1.add(new Integer(4));//object ������ ó��
			l_1.add(new Integer(9));//object ������ ó��
			l_1.add(new Integer(0));//object ������ ó��
			
			ArrayList l_4 = new ArrayList(l_1.subList(1, 4)); //�Ϻθ� �����Ͽ�����
			
			System.out.println(l_1.get(2));
			System.out.println(l_4);
			Collections.sort(l_1);
			Collections.sort(l_4);
		
			print(l_1,l_4);
			l_1.remove(2);
			l_1.retainAll(l_4); //��_4�� �ִ� �׸� ���� ����������.
			
			
	}
	static void print(ArrayList i_1,ArrayList i_2) {
		System.out.println(i_1);
		System.out.println(i_2);
	}

}