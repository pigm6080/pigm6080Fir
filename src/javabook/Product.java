package javabook;

public abstract class Product{
	String pname;
	int price;
	public void printDetail() {
			System.out.print("��ǰ��:" + pname+",");
			System.out.print("�Ű�: " + price +",");
			printExtra();
	}
	public abstract void printExtra();
}