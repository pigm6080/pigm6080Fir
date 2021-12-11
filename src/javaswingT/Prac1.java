package javaswingT;
import java.awt.Color;

import javax.swing.*;
class Test extends JFrame{
	Test(){
		
	}
}
public class Prac1 {
	public static void main(String[] args) {
		JFrame f1= new JFrame();
		f1.setSize(300, 100);
		JTextField txt1 = new JTextField(10);
		txt1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		JTextField txt2 = new JTextField(10);
		txt2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		f1.add(txt1);
		f1.add(txt2);
		f1.setVisible(true);
		
		
	}
}
