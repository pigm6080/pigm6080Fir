package myJava1;
import java.util.*;
class G1 {
	public static void main(String[] args) {
		HashMap<Integer, Character> HM = new HashMap<Integer, Character>(){{
			put(0,'A');
			put(1,'B');
			put(2,'C');
		}};
		ArrayList<Integer> keys = new ArrayList<Integer>();
		for(Integer key:HM.keySet()) {
			keys.add(key);
		}
		System.out.println("�ȳ�");
		
		
		
	}
}