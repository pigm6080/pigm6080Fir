package Calendergaen;

import java.util.*;

public class pp {

	public static void main(String[] args) {
		HashMap<String, Double> j = new HashMap<String, Double>();
		Scanner s = new Scanner(System.in);
		String num;
		Double a;
		while(true) {
			System.out.print("h HASHMAP 데이터를 입력 >>");
			num = s.next();
			a = s.nextDouble();
			j.put(num, a);
			if(num.equals("end"))
				break;
			System.out.println("+++++++++++++++++++++++++++");
			System.out.println("ID\t성적");
			  
			Iterator<String> keys = j.keySet().iterator();
		    while( keys.hasNext() ){
		            String key = keys.next();
		            Double value = j.get(key);
		            System.out.println(key+"\t "+value);
		        }

		    System.out.println("+++++++++++++++++++++++++++");
		}
		
		
		
	}
		
		

	

}
