package javaswingT;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;

import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import com.mysql.cj.xdevapi.Table;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class Customer_App {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField Name;
	private JTextField Age;
	private JTextField BirthDay;
	private JTextField Phone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_App window = new Customer_App();
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
	public Customer_App() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Customer customer = new Customer();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 672, 462);
		
		JPanel TablePanel = new JPanel();
		TablePanel.setBackground(Color.WHITE);
		TablePanel.setBounds(0, 0, 656, 400);
		
		TablePanel.setVisible(false);
		String[] headers = new String [] {"name","phone","gender","age","Note"};
		String[][] data = customer.getCustomersTable();
		TablePanel.setLayout(null);
		JTable table = new JTable(data,headers);
		table.setRowHeight(30);
		table.setFont(new Font("Sanserif", Font.BOLD, 15));
		table.setAlignmentX(0);
		table.setSize(400,300);
		table.setPreferredScrollableViewportSize(new Dimension(400,300));
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(108, 74, 518, 316);
		TablePanel.add(scrollPane);
		frame.getContentPane().add(TablePanel);
		
		JTextField serch = new JTextField();
		serch.setFont(new Font("굴림", Font.PLAIN, 21));
		serch.setBounds(108, 31, 518, 31);
		TablePanel.add(serch);
		serch.setColumns(10);
		
		
		serch.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				String val = serch.getText();
				TableRowSorter<TableModel> trs = new TableRowSorter<>(table.getModel());
				table.setRowSorter(trs);
				trs.setRowFilter(RowFilter.regexFilter(val));
				
			}
		});
		TableColumnModel columnModels = table.getColumnModel();
		columnModels.getColumn(0).setPreferredWidth(40);
		columnModels.getColumn(2).setPreferredWidth(20);
		columnModels.getColumn(3).setPreferredWidth(15);
		
		
		
		
		JPanel MainPanel = new JPanel();
		MainPanel.setBackground(Color.WHITE);
		MainPanel.setBounds(0, 0, 656, 400);
		frame.getContentPane().add(MainPanel);
		MainPanel.setLayout(null);
		MainPanel.setVisible(false);
		JLabel lblNewLabel_2 = new JLabel("WelCome This is Main Panel");
		lblNewLabel_2.setFont(new Font("Bodoni MT", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(237, 10, 246, 15);
		MainPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("굴림체", Font.BOLD, 21));
		lblNewLabel_3.setBounds(106, 62, 150, 45);
		MainPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Age");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("굴림체", Font.BOLD, 21));
		lblNewLabel_3_1.setBounds(106, 132, 150, 45);
		MainPanel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Gender");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("굴림체", Font.BOLD, 21));
		lblNewLabel_3_2.setBounds(106, 195, 150, 45);
		MainPanel.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Phone");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setFont(new Font("굴림체", Font.BOLD, 21));
		lblNewLabel_3_3.setBounds(376, 62, 150, 45);
		MainPanel.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("BirthDay");
		lblNewLabel_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4.setFont(new Font("굴림체", Font.BOLD, 21));
		lblNewLabel_3_4.setBounds(376, 132, 150, 45);
		MainPanel.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("Note");
		lblNewLabel_3_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_5.setFont(new Font("굴림체", Font.BOLD, 21));
		lblNewLabel_3_5.setBounds(376, 200, 150, 45);
		MainPanel.add(lblNewLabel_3_5);
		
		Name = new JTextField();
		Name.setFont(new Font("Bauhaus 93", Font.PLAIN, 19));
		Name.setBounds(248, 76, 116, 31);
		MainPanel.add(Name);
		Name.setColumns(10);
		
		Age = new JTextField();
		Age.setFont(new Font("Bauhaus 93", Font.PLAIN, 19));
		Age.setColumns(10);
		Age.setBounds(248, 146, 116, 31);
		MainPanel.add(Age);
		
		BirthDay = new JTextField();
		BirthDay.setFont(new Font("Bauhaus 93", Font.PLAIN, 19));
		BirthDay.setColumns(10);
		BirthDay.setBounds(501, 132, 116, 31);
		MainPanel.add(BirthDay);
		
		Phone = new JTextField();
		Phone.setFont(new Font("Bauhaus 93", Font.PLAIN, 19));
		Phone.setColumns(10);
		Phone.setBounds(501, 71, 116, 31);
		MainPanel.add(Phone);
		
		JComboBox Gender = new JComboBox(new String[] {"Male","Femel"});
		Gender.setFont(new Font("굴림", Font.PLAIN, 15));
		Gender.setBackground(Color.WHITE);
		Gender.setBounds(255, 208, 109, 32);
		MainPanel.add(Gender);
		
		JTextArea notetxt = new JTextArea();
		notetxt.setFont(new Font("Monospaced", Font.PLAIN, 17));
		notetxt.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		notetxt.setBounds(501, 207, 123, 142);
		MainPanel.add(notetxt);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String nametxt = Name.getText();
				String agetxt = Age.getText();
				String phonetxt = Phone.getText();
				String gender = Gender.getSelectedItem().toString();
				String note = notetxt.getText();
				
				customer.createCustomer(nametxt, phonetxt, gender, agetxt, note);
				JOptionPane.showInternalMessageDialog(null, "your data has been saxca sfd");
				MainPanel.setVisible(false);
				TablePanel.setVisible(true);
			}
		});
		
		btnNewButton.setBounds(275, 315, 156, 59);
		MainPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TablePanel.setVisible(false);
				MainPanel.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(12, 37, 66, 83);
		TablePanel.add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 656, 423);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("login :");
		lblNewLabel.setBounds(177, 137, 43, 19);
		lblNewLabel.setFont(new Font("Bell MT", Font.BOLD, 16));
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(250, 137, 140, 21);
		textField.setToolTipText("ID");
		textField.setColumns(10);
		panel.add(textField);
		
		JLabel lblNewLabel_1 = new JLabel("pass :");
		lblNewLabel_1.setBounds(177, 173, 75, 20);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setFont(new Font("Bell MT", Font.BOLD, 17));
		panel.add(lblNewLabel_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(424, 137, 63, 56);
		panel.add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("pig") && Arrays.equals(passwordField.getPassword(),"1234".toCharArray())){
					System.out.println("Welcome");
					panel.setVisible(false);
					MainPanel.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "you is id and pass false");
				}
				
			}
		});
		
		
		passwordField = new JPasswordField();
		passwordField.setBounds(250, 175, 140, 21);
		panel.add(passwordField);
		
		frame.setJMenuBar(bar());
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
	}
	public JMenuBar bar() {
		JMenuBar bar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu aboutMenu = new JMenu("About");
		
		bar.add(fileMenu);
		bar.add(aboutMenu);
		
		JMenuItem oprnFile= new JMenuItem("open");
		JMenuItem exit = new JMenuItem("Extd");
		fileMenu.add(oprnFile);
		fileMenu.addSeparator();
		fileMenu.add(exit);
		
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		return bar;
	}
}
