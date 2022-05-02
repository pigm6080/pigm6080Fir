package algorithm_01;
import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;

import algorithm_01.Car.StatusType;


public class datePurchased {
	public static void EqualscarId(Car[] c) throws Exception {
		for (Car car : c) {
			for (Car car2 : c) {
				if(car == car2) {
					throw new Exception();
				}
			}
			
		}
		
	}
	public static void main(String[] args) throws ParseException  {
		try {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = dateFormat.parse("2016-03-02");
		Date date2 = dateFormat.parse("2022-09-01");
		Date date3 = dateFormat.parse("2012-07-05");
		Date date4 = dateFormat.parse("2032-03-12");
		Date date5 = dateFormat.parse("2012-05-23");
		System.out.println(dateFormat.format(date1));
		
		Car[] c = new Car[] {
			new Car(date1,50),
			new Car(date2,50),
			new Car(date3,50),
			new Car(date4,50),
			new Car(date5,50)
		};
		
		for (Car car : c) {
			car.printinfo();
		}
		c[0].setSyatus(StatusType.discarded);
		System.out.println("변경후");
		for (Car car : c) {
			car.printinfo();
		}
		
		for(int i = 0; i < c.length; i++) {
	        for(int j = 0 ; j < c.length - i - 1 ; j++) {
	            if(c[j].datePurchased.after(c[j+1].datePurchased)) {
	            	Car temp = c[j+1];
	                c[j+1] = c[j];
	                c[j] = temp;
	            }
	        }
	    }
		
		System.out.println("정렬후");
		for (Car car : c) {
			car.printinfo();
		}
		
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
