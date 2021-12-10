package javaswingT;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Lesson07 {
	public static void main(String[] args) {
		JFrame f = new JFrame("Table Prac");
		JPanel p = new JPanel();
		String[] deadings = new String[] {"id","name","countyr"};
		Object[][] data = new Object[][] {
			{"1","Padak","Korea"},
			{"2","Adasd","Frosdf"},
			{"3","dsks","sdfs"}
		};
		JTable table = new JTable(data,deadings);
		table.setPreferredScrollableViewportSize(new Dimension(700,600));
		
		table.setFillsViewportHeight(true);
		
		p.add(new JScrollPane(table));
		f.add(p);
		
		f.setVisible(true);
		f.setSize(800,400);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
