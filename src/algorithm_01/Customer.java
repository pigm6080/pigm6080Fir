package algorithm_01;

import java.util.ArrayList;

public class Customer {
	
	int CustomerID;
	String name;
	String driverLicense;
	int creditPoints;
	public enum CustomerStayusType{
		Silver, Gold, Diamond
	}
	CustomerStayusType cStatus;

	public Customer(String n,String d) {
		this.CustomerID = (int)(Math.random()*9000)+1000;
		this.name = n;
		this.driverLicense = d;
		cStatus = CustomerStayusType.Silver;
		creditPoints = 0;
	}
	int totalRental=0;
	void promote() {
		
		if(totalRental >= 0 && totalRental<=100000) {
			cStatus = CustomerStayusType.Silver;
		}else if(totalRental >= 100000 && totalRental <=500000) {
			cStatus = CustomerStayusType.Gold;
		}else {
			cStatus = CustomerStayusType.Diamond;
		}
	}
	public void printinfo() {
		promote();
		System.out.println("Customer CustomerID=" + CustomerID + ", name=" + name + 
		", driverLicense=" + driverLicense + ", creditPoints=" + creditPoints + ",cStatus="+cStatus );
	}
	public void addPiont(int a) {
		this.creditPoints += a;
		totalRental += creditPoints;
		
	}
	
	
	
	
}
