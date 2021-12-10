package javaswingT;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Frame {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		JPanel p1 = new JPanel();
		JLabel l = new JLabel("Hello java swing");
		JButton b = new JButton("Click me!");
		JTextArea ta = new JTextArea();
		JTextField tf = new JTextField(200);
		JButton jE = new JButton("Exit");
		p.setLayout(new BorderLayout());
		p1.add(b);
		p1.add(jE);
		
		p.add(l, BorderLayout.NORTH);
		p.add(p1, BorderLayout.WEST);
		p.add(ta,BorderLayout.CENTER);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				l.setText(ta.getText());
				
				
			}
		});
		jE.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		
		f.add(p);
		
		f.setVisible(true);
		f.setPreferredSize(new Dimension(840, 840/12*9));
		f.setSize(840,840/12*9);
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
