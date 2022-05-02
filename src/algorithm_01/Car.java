package algorithm_01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Car {
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	private int carID;
	Date datePurchased;
	private int mlieage;
	public enum StatusType{
		available, checkedOut, inService, discarded, selled
	}
	public StatusType st; 
	public Car(Date d, int m) {
		this.datePurchased = d;
		this.mlieage = m;
		this.carID = (int)(Math.random()*9000)+1000;
		this.st = StatusType.available;
		
	}
	public void setMlieage(int mlieage) {
		this.mlieage = mlieage;
	}
	public void setSyatus (StatusType s) {
		this.st = s;
	}
	public void printinfo() {
		System.out.println("Car carID=" + carID + ", date=" + dateFormat.format(datePurchased) + 
		", mlieage=" + mlieage + ", state=" + st );
	}
	
	
	
}
