package javaswingT;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class login extends JFrame{
	public login() {
		JPanel panal = new JPanel();
		JLabel lavel = new JLabel("ID :");
		JLabel ps1 = new JLabel("pass woerd :");
		JTextField txtId = new JTextField(10);
		JPasswordField ps = new JPasswordField(10);
		JButton button = new JButton("Login");
		
		panal.add(lavel);
		panal.add(txtId);
		panal.add(ps1);
		panal.add(ps);
		panal.add(button);
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = "park";
				String pw = "1234";
				
				if(id.equals(txtId.getText()) && pw.equals(ps.getText())){
					JOptionPane.showMessageDialog(null, "you have loggon successfuly");
				} else {
					JOptionPane.showMessageDialog(null,	 "dasf");
				}
				
			}
		});
		
		add(panal);
		
		setVisible(true);
		setSize(600,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	
	
	
	
	}	
	public static void main(String[] args) {
		new login();
	}

}
