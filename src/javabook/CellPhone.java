package javabook;

public class CellPhone extends Product {
	String carrier;
	public CellPhone(String pname,int price,String carrier) {
		this.pname = pname;
		this.price = price;
		this.carrier = carrier;
	}
	@Override
	public void printExtra() {
		System.out.println("��Ż�:" + carrier);
	}	
	

}
