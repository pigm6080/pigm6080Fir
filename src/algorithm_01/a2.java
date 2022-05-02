package algorithm_01;

import java.text.SimpleDateFormat;
import java.util.Date;
public class a2 {
	
	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try{
		Date date1 = dateFormat.parse("2016-03-02");
		Date date2 = dateFormat.parse("2022-09-01");
		Date date3 = dateFormat.parse("2012-07-05");
		Customer c1 = new Customer("홍길동","운전면허있음");
		Customer c2 = new Customer("김성실", "면허없음");
		
		Car[] c = new Car[] {
				new Car(date1,50),
				new Car(date2,50),
				new Car(date3,50),
		};
		c1.printinfo();
		c2.printinfo();
		for (Car car : c) {
			car.printinfo();
		}
		c1.addPiont(300000);
		System.out.println("추가후");
		
		c1.printinfo();
		c2.printinfo();
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
