package javaswingT;

import java.util.*;

public class Prac2 {
	public static void main(String[] args) {
		
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		Scanner s = new Scanner(System.in);
		
			
			System.out.print("H HASHMAP 데이터를 입력 >>");
			while(true) {
				String num;
				num = s.next();
				if(num.equals("end")) {
					break;}
				int a;
				a = s.nextInt();
				h.put(num, a);
			}
			
			System.out.println("+++++++++++++++++++++++++++");
			System.out.println("ID\t시간(단위:분)");
			Iterator<String> keys = h.keySet().iterator();
			
		    while( keys.hasNext() ){
		            String key = keys.next();
		            Integer value = h.get(key);
		            System.out.println(key+"\t "+value);
		        }

		    System.out.println("+++++++++++++++++++++++++++");
		
		
		
		HashMap<String, Double> j = new HashMap<String, Double>();
		
			
			System.out.print("J HASHMAP 데이터를 입력 >>");
			while(true) {
				String num;
				num = s.next();
				if(num.equals("end")) {
					break;}
				Double a;
				a = s.nextDouble();
				j.put(num, a);
			}
			
			System.out.println("+++++++++++++++++++++++++++");
			System.out.println("ID\t성적");
			  
			Iterator<String> keys5 = j.keySet().iterator();
		    while( keys5.hasNext() ){
		            String key = keys5.next();
		            Double value = j.get(key);
		            System.out.println(key+"\t "+value);
		        }

		    
		
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("번호\t시간\t성적");
		Iterator<String> keys1 = h.keySet().iterator();
		Iterator<String> keys2 = j.keySet().iterator();
		 while( keys1.hasNext() ){
	            String key = keys1.next();
	            Double value = j.get(key);
	            Integer value1 = h.get(key);
	            if(value==null|| value1==null)
	            	continue;
	            System.out.println(key+"\t "+value1+"\t"+value);
	        }
		 System.out.println("+++++++++++++++++++++++++++");
		
	}
}
