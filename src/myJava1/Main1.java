package myJava1;

import java.util.Scanner;

class Circle{
	int r;
	void findRadius(int r){
		
		System.out.println("반지름 :"+ r);
		this.r = r;
	}
	void findArea(){
		System.out.println("넓이: "+r*3.14);
	}
}
class Ball extends Circle {
	void findColor(){
		System.out.println("공의 색상은 Red이다.");
	}
	void findVolume() {
		double volume = (4.0/3)*3.14*r*r*r;
		System.out.println("부피:"+volume);
		
	}
}
public class Main1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Ball b = new Ball();
		System.out.println("원의 넓이를 산출합니다.");
		System.out.print("반지름을 입력하세요:");
		int r = s.nextInt();
		b.findRadius(r);
		b.findArea();
		System.out.println();
		System.out.println("공의 부피를 산출합니다.");
		System.out.print("반지름을 입력하세요:");
		r = s.nextInt();
		b.findRadius(r);
		b.findColor();
		b.findVolume();
		
	}
}
