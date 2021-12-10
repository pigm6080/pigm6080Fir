package javaswingT;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lesson6 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lesson6 window = new Lesson6();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Lesson6() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Lesson6");
		frame.setBounds(100, 100, 800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel startPage = new JPanel();
		startPage.setBounds(0, 10, 782, 551);
		frame.getContentPane().add(startPage);
		startPage.setLayout(null);
		
		JButton buttonnext = new JButton("GO To NEXT");
		buttonnext.setBounds(55, 67, 197, 404);
		startPage.add(buttonnext);
		
		JPanel lstpage = new JPanel();
		lstpage.setBounds(0, 0, 782, 561);
		frame.getContentPane().add(lstpage);
		lstpage.setLayout(null);
		
		JButton buttonbefore = new JButton("go to Last");
		buttonbefore.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		buttonbefore.setBounds(379, 250, 150, 58);
		lstpage.add(buttonbefore);
		
		lstpage.setVisible(false);
		
		buttonnext.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lstpage.setVisible(true);
				startPage.setVisible(false);
			}
		});
		buttonbefore.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lstpage.setVisible(false);
				startPage.setVisible(true);
			}
		});
		
		
		
	}
}
