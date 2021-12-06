package javabook;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.zip.CheckedOutputStream;


import javabook.User.PayType;



public class Myshop implements IShop{
	User[] users = new User[2];
	
	Product[] products = new Product[4];
	
	ArrayList<Product> cart = new ArrayList<Product>();
	
	Scanner scan = new Scanner(System.in);
	
	int selUser;
	
	String title;
	
	
	public void start() {
		System.out.println(title+" : ���� ȭ�� - ���� ����");
		System.out.println("==========================");
		int i = 0;
		
		for (User u : users) {
			System.out.printf("[%d]%s(%s)\n",i++,u.getName(),u.getPayType());
		}
		System.out.println("[x]��  ��");
		System.out.println("����  : ");
		String sel = scan.next();
		System.out.println("## "+sel+"���� ##");
		
		switch (sel) {
		case "x": System.exit(0);break;
		default:
			selUser = Integer.parseInt(sel);
			productList();
		}
	}
	public void productList() {
		System.out.println(title+" : ��ǰ ��� - ��ǰ ����");
		System.out.println("==========================");
		int i = 0;
		
		for (Product p : products) {
				System.out.print("["+i+"]");
				p.printDetail();
				i++;
		}
		System.out.println("[h]����ȭ��");
		System.out.println("[c]üũ�ƿ�");
		System.out.print("���� : ");
		String sel = scan.next();
		System.out.println("## "+sel+"���� ##");
		switch (sel) {
		case "h": start();break;
		case "c": checkOut();break;
		default:
			int psel = Integer.parseInt(sel);
			cart.add(products[psel]);
			productList();
		}
		
	}
	public void sheckOut() {
		System.out.println(title+" : üũ�ƿ�");
		System.out.println("==========================");
		int total = 0;
		int i = 0;
		
		for (Product p : cart) {
			System.out.printf("[%d]%s(%s)\n",i++,p.pname,p.price);
			total = total + p.price;
		}
		System.out.println("==========================");
		System.out.println("���� ���:"+ users[selUser].getPayType());
		System.out.println("�հ�:" +total + "�� �Դϴ�.");
		System.out.println("[p]���� , [q] �����Ϸ�");
		String sel = scan.next();
		
		switch (sel) {
		case "q": 
				System.out.println("## ������ �Ϸ� �Ǿ����ϴ�. �����մϴ� ##");
				System.exit(0);break;
		case "p": productList();break;
		default:
			checkOut();
		}
		
	}
	public void checkOut() {
		System.out.println(title+ " : üũ�ƿ�");
		System.out.println("==========================");
		int total = 0;
		int  i =0;
		for (Product p : cart) {
			System.out.printf("[%d]%s(%s)\n",i++,p.pname,p.price);
			total = total + p.price;
		}
		System.out.println("==========================");
		
		System.out.println("���� ���:"+ users[selUser].getPayType());
		System.out.println("�հ�:" +total + "�� �Դϴ�.");
		System.out.println("[p]���� , [q] �����Ϸ�");
		String sel = scan.next();
		
		switch (sel) {
		case "q": 
				System.out.println("## ������ �Ϸ� �Ǿ����ϴ�. ������ϴ� ##");
				System.exit(0);break;
		case "p": productList();break;
		default:
			checkOut();
		}	
	
	
	}
	@Override
	public void setTitle(String title) {
		this.title = title;
		
	}
	
	@Override
	public void genProduct() {
		CellPhone cp = new CellPhone("������ ��Ʈ5", 1000000, "SKT");
		products[0] = cp;
		cp = new CellPhone("���� ������7", 980000, "KT");
		products[1] = cp;
		SmartTV st = new SmartTV("�Ｚ 3D Smaert TV",5000000,"4k");
		products[2] = st;
		st = new SmartTV("LG Smart TV", 2500000, "Full HD");
		products[3] = st;
		
	}
	@Override
	public void genUser() {
		// TODO Auto-generated method stub
		User user = new User("ȫ�浿", PayType.CARD);
		users[0] = user;
		user = new User("��ΰ�",PayType.CASH);
		users[1] = user;
	}
	
}
