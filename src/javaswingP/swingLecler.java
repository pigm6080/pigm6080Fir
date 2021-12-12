package javaswingP;

import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class swingLecler extends Thread{

	private JFrame frame;
	private JTextField txtDrink;
	private JTextField txtCoffee;
	private JTextField txtTansan;
	private JTextField txtMoney;
	private JTextField txtlowCoffee;
	static int monwytot=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swingLecler window = new swingLecler();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	static int mymoney=0;
	private JTextField driif;
	private JTextField coffeeif;
	private JTextField tansanif;
	private JTextField waterif;
	private JTextField lowcoffeif;
	/**
	 * Create the application.
	 */
	public swingLecler() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	Dringk dri = new Dringk();
	Tansan tas = new Tansan();
	Coffee cof = new Coffee();
	Water wt = new Water();
	Coin coin = new Coin();
	LowCoffee lcof = new LowCoffee();
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;
	private JTextField txt5;
	private JTable table;
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 978, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
			
		JPanel MainPanel = new JPanel();
				
				JPanel superpanel = new JPanel();
				superpanel.setBounds(0, 0, 962, 415);
				frame.getContentPane().add(superpanel);
				superpanel.setLayout(null);
				superpanel.setVisible(false);
				
				JLabel lblNewLabel_4 = new JLabel("관리자 페이지입니다");
				lblNewLabel_4.setFont(new Font("한컴 고딕", Font.BOLD, 28));
				lblNewLabel_4.setBounds(376, 0, 308, 48);
				superpanel.add(lblNewLabel_4);
				
				JLabel lblNewLabel_5 = new JLabel("재고 현황 :");
				lblNewLabel_5.setFont(new Font("굴림", Font.PLAIN, 18));
				lblNewLabel_5.setBounds(12, 48, 98, 24);
				superpanel.add(lblNewLabel_5);
				
				txt1 = new JTextField();
				txt1.setBounds(22, 82, 58, 21);
				superpanel.add(txt1);
				txt1.setColumns(10);
				
				JLabel lblNewLabel_6 = new JLabel("물");
				lblNewLabel_6.setFont(new Font("굴림", Font.PLAIN, 15));
				lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6.setBounds(32, 113, 36, 24);
				superpanel.add(lblNewLabel_6);
				
				txt2 = new JTextField();
				txt2.setColumns(10);
				txt2.setBounds(22, 134, 58, 21);
				superpanel.add(txt2);
				
				JLabel lblNewLabel_6_1 = new JLabel("일반커피");
				lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_1.setFont(new Font("굴림", Font.PLAIN, 15));
				lblNewLabel_6_1.setBounds(22, 165, 58, 24);
				superpanel.add(lblNewLabel_6_1);
				
				txt3 = new JTextField();
				txt3.setColumns(10);
				txt3.setBounds(22, 187, 58, 21);
				superpanel.add(txt3);
				
				JLabel lblNewLabel_6_1_1 = new JLabel("이온음료");
				lblNewLabel_6_1_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
				lblNewLabel_6_1_1.setBounds(22, 218, 58, 24);
				superpanel.add(lblNewLabel_6_1_1);
				
				txt4 = new JTextField();
				txt4.setColumns(10);
				txt4.setBounds(22, 240, 58, 21);
				superpanel.add(txt4);
				
				JLabel lblNewLabel_6_1_1_1 = new JLabel("고급커피");
				lblNewLabel_6_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_1_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
				lblNewLabel_6_1_1_1.setBounds(22, 271, 58, 24);
				superpanel.add(lblNewLabel_6_1_1_1);
				
				txt5 = new JTextField();
				txt5.setColumns(10);
				txt5.setBounds(22, 299, 58, 21);
				superpanel.add(txt5);
				
				JLabel lblNewLabel_6_1_1_1_1 = new JLabel("탄산음료");
				lblNewLabel_6_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_1_1_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
				lblNewLabel_6_1_1_1_1.setBounds(22, 319, 58, 24);
				superpanel.add(lblNewLabel_6_1_1_1_1);
				
				JButton btnNewButton_6 = new JButton("물재고충전");
				btnNewButton_6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						wt.cnt++;
						txt1.setText(Integer.toString(wt.cnt));
					}
				});
				btnNewButton_6.setBounds(92, 82, 105, 24);
				superpanel.add(btnNewButton_6);
				
				JButton btnNewButton_6_1 = new JButton("일반커피충전");
				btnNewButton_6_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						lcof.cnt++;
						txt2.setText(Integer.toString(lcof.cnt));
					}
				});
				btnNewButton_6_1.setBounds(92, 133, 105, 24);
				superpanel.add(btnNewButton_6_1);
				
				JButton btnNewButton_6_2 = new JButton("이온음료충전");
				btnNewButton_6_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dri.cnt++;
						txt3.setText(Integer.toString(dri.cnt));
					}
				});
				btnNewButton_6_2.setBounds(92, 186, 105, 24);
				superpanel.add(btnNewButton_6_2);
				
				JButton btnNewButton_6_3 = new JButton("고급커피충전");
				btnNewButton_6_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						cof.cnt++;
						txt4.setText(Integer.toString(cof.cnt));
					}
				});
				btnNewButton_6_3.setBounds(92, 239, 105, 24);
				superpanel.add(btnNewButton_6_3);
				
				JButton btnNewButton_6_4 = new JButton("탄산음료충전");
				btnNewButton_6_4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						tas.cnt++;
						txt5.setText(Integer.toString(tas.cnt));
					}
				});
				btnNewButton_6_4.setBounds(92, 298, 105, 24);
				superpanel.add(btnNewButton_6_4);
				Customer1 customer1 = new Customer1();
				String[] headers = new String [] {"name","pay","cnt","money"};
				String[][] data = customer1.getCustomersTable();
				JTable table = new JTable(data,headers);
				
																	JButton btnNewButton_7 = new JButton("뒤로가기");
																	btnNewButton_7.addActionListener(new ActionListener() {
																		public void actionPerformed(ActionEvent e) {
																			superpanel.setVisible(false);
																			MainPanel.setVisible(true);
																		}
																	});
				btnNewButton_7.setBounds(22, 19, 97, 23);
				superpanel.add(btnNewButton_7);
				
				JScrollPane scrollPane = new JScrollPane(table);
				scrollPane.setBounds(414, 78, 518, 316);
				superpanel.add(scrollPane);
				frame.getContentPane().add(superpanel);
				
				JLabel lblNewLabel_7 = new JLabel("매출액");
				lblNewLabel_7.setFont(new Font("굴림", Font.PLAIN, 24));
				lblNewLabel_7.setBounds(612, 46, 72, 25);
				superpanel.add(lblNewLabel_7);
				
				JButton btnNewButton_8 = new JButton("초기화");
				btnNewButton_8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Customer1.DelTable();
					}
				});
				btnNewButton_8.setBounds(835, 50, 97, 23);
				superpanel.add(btnNewButton_8);
				
				
			
			MainPanel.setBounds(0, 0, 962, 415);
			frame.getContentPane().add(MainPanel);
			MainPanel.setLayout(null);
			
			
			
			
			
			JLabel DringkL = new JLabel("이온음료");
			DringkL.setFont(new Font("굴림체", Font.PLAIN, 19));
			DringkL.setBounds(113, 63, 85, 46);
			MainPanel.add(DringkL);
			
			JLabel DringkL_1 = new JLabel("고급커피");
			DringkL_1.setFont(new Font("굴림체", Font.PLAIN, 19));
			DringkL_1.setBounds(259, 63, 85, 46);
			MainPanel.add(DringkL_1);
			
			JLabel DringkL_2 = new JLabel("탄산음료");
			DringkL_2.setFont(new Font("굴림체", Font.PLAIN, 19));
			DringkL_2.setBounds(427, 63, 85, 46);
			MainPanel.add(DringkL_2);
			
			txtDrink = new JTextField();
			
			txtDrink.setHorizontalAlignment(SwingConstants.CENTER);
			txtDrink.setFont(new Font("굴림", Font.PLAIN, 18));
			txtDrink.setBounds(102, 22, 85, 35);
			txtDrink.setText(Integer.toString(dri.cnt));
			
			MainPanel.add(txtDrink);
			txtDrink.setColumns(10);
			
			txtCoffee = new JTextField();
			
			txtCoffee.setHorizontalAlignment(SwingConstants.CENTER);
			txtCoffee.setFont(new Font("굴림", Font.PLAIN, 18));
			txtCoffee.setColumns(10);
			txtCoffee.setText(Integer.toString(cof.cnt));
			
			txtCoffee.setBounds(255, 21, 85, 37);
			MainPanel.add(txtCoffee);
			
			
			txtTansan = new JTextField();
			
			txtTansan.setHorizontalAlignment(SwingConstants.CENTER);
			txtTansan.setFont(new Font("굴림", Font.PLAIN, 18));
			txtTansan.setColumns(10);
			txtTansan.setText(Integer.toString(tas.cnt));
			
			txtTansan.setBounds(415, 22, 85, 35);
			MainPanel.add(txtTansan);
			
										JButton btnDri = new JButton("550 원");
										
												btnDri.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														if(mymoney >= 550 && dri.cnt >0) {
															mymoney -= 550;
															monwytot += 550;
															txtMoney.setText(Integer.toString(mymoney));
															dri.cnt--;
															txtDrink.setText(Integer.toString(dri.cnt));
															String motot = Integer.toString(monwytot);
															Customer1.createCustomer("IonDrink", "550", "1", motot);
														}else {
															JOptionPane.showMessageDialog(null, "잔액이 부족합니다");
														}
														isTrue();
													}
												});
												
				
		btnDri.setBounds(102, 137, 97, 23);
		MainPanel.add(btnDri);
		
		JButton btnCof = new JButton("700 원");
		btnCof.setBounds(255, 137, 97, 23);
		MainPanel.add(btnCof);
		
			btnCof.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(mymoney >= 700 && cof.cnt >0) {
						mymoney -= 700;
						monwytot += 700;
						txtMoney.setText(Integer.toString(mymoney));
						cof.cnt--;
						txtCoffee.setText(Integer.toString(cof.cnt));
						String motot = Integer.toString(monwytot);
						Customer1.createCustomer("Coffee", "700", "1", motot);
					}else {
						JOptionPane.showMessageDialog(null, "선택 불가능합니다.");
					}
					isTrue();
				}
			});
			
			
			JButton btntan = new JButton("750 원");
			
					btntan.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if(mymoney >= 750 && tas.cnt >0) {
								mymoney -= 750;
								monwytot += 750;
								txtMoney.setText(Integer.toString(mymoney));
								tas.cnt--;
								txtTansan.setText(Integer.toString(tas.cnt));
								String motot = Integer.toString(monwytot);
								Customer1.createCustomer("Tansan", "750", "1", motot);
							}else {
								JOptionPane.showMessageDialog(null, "선택 불가능합니다.");
							}
							isTrue();
						}
					});
					
					btntan.setBounds(415, 137, 97, 23);
					MainPanel.add(btntan);
					
					txtMoney = new JTextField();
					txtMoney.setFont(new Font("굴림", Font.PLAIN, 35));
					txtMoney.setHorizontalAlignment(SwingConstants.CENTER);
					txtMoney.setBounds(768, 22, 163, 54);
					MainPanel.add(txtMoney);
					txtMoney.setColumns(10);
					txtMoney.setText(Integer.toString(mymoney));
					
					JLabel lblNewLabel = new JLabel("수량 :");
					lblNewLabel.setFont(new Font("굴림체", Font.PLAIN, 17));
					lblNewLabel.setBounds(12, 30, 69, 35);
					MainPanel.add(lblNewLabel);
					
					JLabel lblNewLabel_1 = new JLabel("사용가능금액 : ");
					lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 17));
					lblNewLabel_1.setBounds(640, 20, 116, 54);
					MainPanel.add(lblNewLabel_1);
					
					JTextField txtwater = new JTextField();
					txtwater.setText("3");
					txtwater.setHorizontalAlignment(SwingConstants.CENTER);
					txtwater.setFont(new Font("굴림", Font.PLAIN, 18));
					txtwater.setColumns(10);
					txtwater.setBounds(165, 180, 85, 35);
					MainPanel.add(txtwater);
					
					txtlowCoffee = new JTextField();
					txtlowCoffee.setText("3");
					txtlowCoffee.setHorizontalAlignment(SwingConstants.CENTER);
					txtlowCoffee.setFont(new Font("굴림", Font.PLAIN, 18));
					txtlowCoffee.setColumns(10);
					txtlowCoffee.setBounds(337, 180, 97, 35);
					MainPanel.add(txtlowCoffee);
					
					JLabel DringkL_3 = new JLabel("물");
					DringkL_3.setHorizontalAlignment(SwingConstants.CENTER);
					DringkL_3.setFont(new Font("굴림체", Font.PLAIN, 19));
					DringkL_3.setBounds(165, 204, 85, 46);
					MainPanel.add(DringkL_3);
					
					JLabel DringkL_4 = new JLabel("일반커피");
					DringkL_4.setFont(new Font("굴림체", Font.PLAIN, 19));
					DringkL_4.setBounds(349, 204, 85, 46);
					MainPanel.add(DringkL_4);
					
					
					JButton btnDri_1 = new JButton("450 원");
					btnDri_1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if(mymoney >= 450 && wt.cnt >0) {
								mymoney -= 450;
								monwytot += 450;
								txtMoney.setText(Integer.toString(mymoney));
								wt.cnt--;
								txtwater.setText(Integer.toString(wt.cnt));
								String motot = Integer.toString(monwytot);
									Customer1.createCustomer("Water", "450", "1", motot);
							}else {
								JOptionPane.showMessageDialog(null, "선택 불가능합니다.");
							}
							isTrue();
						}
					});
					btnDri_1.setBounds(163, 292, 97, 23);
					MainPanel.add(btnDri_1);
					
					JButton btnDri_2 = new JButton("500 원");
					
					btnDri_2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if(mymoney >= 450 && lcof.cnt >0) {
								mymoney -= 450;
								monwytot += 450;
								txtMoney.setText(Integer.toString(mymoney));
								lcof.cnt--;
								txtlowCoffee.setText(Integer.toString(lcof.cnt));
								String motot = Integer.toString(monwytot);
								Customer1.createCustomer("Water", "450", "1", motot);
							}else {
								JOptionPane.showMessageDialog(null, "선택 불가능합니다.");
							}
							isTrue();
						}
					});
					btnDri_2.setBounds(336, 290, 97, 23);
					MainPanel.add(btnDri_2);
					JButton btnNewButton = new JButton("1,000  원");
					btnNewButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if(mymoney+1000 > 3000) {
								JOptionPane.showMessageDialog(null, "지폐로 입력 받을수 있는 값은 3000원까지입니다.");
							}else {
								mymoney+=1000;
								txtMoney.setText(Integer.toString(mymoney));
							}
							isTrue();
						}
					});
					btnNewButton.setBounds(810, 86, 97, 23);
					MainPanel.add(btnNewButton);
					
					JButton btnNewButton_1 = new JButton("500  원");
					btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(mymoney+500 > 5000) {
							JOptionPane.showMessageDialog(null, "지폐로 입력 받을수 있는 값은 5000원까지입니다.");
						}else {
							mymoney+=500;
							txtMoney.setText(Integer.toString(mymoney));
							coin.fhun++;
						}
						isTrue();
					}
				});
					btnNewButton_1.setBounds(810, 119, 97, 23);
					MainPanel.add(btnNewButton_1);
					
					JButton btnNewButton_2 = new JButton("100  원");
					btnNewButton_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(mymoney+100 > 5000) {
							JOptionPane.showMessageDialog(null, "지폐로 입력 받을수 있는 값은 5000원까지입니다.");
						}else {
							mymoney+=100;
							txtMoney.setText(Integer.toString(mymoney));
							coin.hun++;
						}
						isTrue();
					}
			});
					btnNewButton_2.setBounds(810, 152, 97, 23);
					MainPanel.add(btnNewButton_2);
					
					JButton btnNewButton_3 = new JButton("50  원");
					btnNewButton_3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if(mymoney+50 > 5000) {
								JOptionPane.showMessageDialog(null, "지폐로 입력 받을수 있는 값은 5000원까지입니다.");
							}else {
								mymoney+=50;
								txtMoney.setText(Integer.toString(mymoney));
								coin.fif++;
							}
							isTrue();
						}
					});
					btnNewButton_3.setBounds(810, 185, 97, 23);
					MainPanel.add(btnNewButton_3);
					
					JButton btnNewButton_4 = new JButton("10  원");
					btnNewButton_4.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if(mymoney+10 > 5000) {
								JOptionPane.showMessageDialog(null, "지폐로 입력 받을수 있는 값은 5000원까지입니다.");
							}else {
								mymoney+=10;
								txtMoney.setText(Integer.toString(mymoney));
								coin.ten++;
							}
							isTrue();
						}
					});
					btnNewButton_4.setBounds(810, 218, 97, 23);
					MainPanel.add(btnNewButton_4);
					
					JLabel lblNewLabel_2 = new JLabel("투입 금액");
					lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 20));
					lblNewLabel_2.setBounds(664, 133, 109, 57);
					MainPanel.add(lblNewLabel_2);
					
					driif = new JTextField();
					driif.setText("3");
					driif.setHorizontalAlignment(SwingConstants.CENTER);
					driif.setFont(new Font("굴림", Font.PLAIN, 18));
					driif.setColumns(10);
					driif.setBounds(93, 104, 116, 28);
					driif.setText("판매불가");
					MainPanel.add(driif);
					
					coffeeif = new JTextField();
					coffeeif.setText("3");
					coffeeif.setHorizontalAlignment(SwingConstants.CENTER);
					coffeeif.setFont(new Font("굴림", Font.PLAIN, 18));
					coffeeif.setColumns(10);
					coffeeif.setBounds(241, 104, 116, 28);
					coffeeif.setText("판매불가");
					MainPanel.add(coffeeif);
					
					tansanif = new JTextField();
					tansanif.setText("3");
					tansanif.setHorizontalAlignment(SwingConstants.CENTER);
					tansanif.setFont(new Font("굴림", Font.PLAIN, 18));
					tansanif.setColumns(10);
					tansanif.setBounds(407, 99, 116, 28);
					tansanif.setText("판매불가");
					MainPanel.add(tansanif);
					
					waterif = new JTextField();
					waterif.setText("3");
					waterif.setHorizontalAlignment(SwingConstants.CENTER);
					waterif.setFont(new Font("굴림", Font.PLAIN, 18));
					waterif.setColumns(10);
					waterif.setBounds(155, 249, 116, 28);
					waterif.setText("판매불가");
					MainPanel.add(waterif);
					
					lowcoffeif = new JTextField();
					lowcoffeif.setText("3");
					lowcoffeif.setHorizontalAlignment(SwingConstants.CENTER);
					lowcoffeif.setFont(new Font("굴림", Font.PLAIN, 18));
					lowcoffeif.setColumns(10);
					lowcoffeif.setBounds(328, 249, 116, 28);
					lowcoffeif.setText("판매불가");
					MainPanel.add(lowcoffeif);
					
					JButton returnM = new JButton("반환하기");
					
					returnM.setFont(new Font("굴림", Font.PLAIN, 16));
					returnM.setBounds(640, 204, 116, 37);
					MainPanel.add(returnM);
					
					JButton superuser = new JButton("관리자계정 로그인");
					
						superuser.setBounds(716, 311, 148, 58);
						MainPanel.add(superuser);
						returnM.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								while(mymoney>0) {
									if(mymoney>=500 &&coin.fhun>0) {
										for (int i = 0; i <= coin.fhun; i++) {
											mymoney-=500;
											coin.fhun--;
											String n = Integer.toString(mymoney);
											System.out.println(n);
											txtMoney.setText(n);
											if(mymoney-500<0 || coin.fhun==0) {
												break;
											}
										}}else if(mymoney>=100 &&coin.hun>0) {
											for (int i = 0; i <= coin.hun; i++) {
												mymoney-=100;
												coin.hun--;
												txtMoney.setText(Integer.toString(mymoney));
												if(mymoney-100<0 || coin.hun==0) {
													break;
												}
											}
										}else if(mymoney>=50 &&coin.fif>0) {
											for (int i = 0; i <= coin.fif; i++) {
												mymoney-=50;
												coin.fif--;
												txtMoney.setText(Integer.toString(mymoney));
												if(mymoney-50<0 || coin.fif==0) {
													break;
												}
											}
										}else if(mymoney>=10 &&coin.ten>0) {
											for (int i = 0; i <= coin.ten; i++) {
												mymoney-=10;
												coin.ten--;
												txtMoney.setText(Integer.toString(mymoney));
												if(mymoney-10<0 || coin.ten==0) {
													break;
												}
											}
										}else {
										System.out.println(mymoney);
										JOptionPane.showMessageDialog(null, "반환할수 있는 동전이 없습니다.");
										new Exception("반환할수 있는동전이 없음.");
									}
								}
							}
						});
						
						
			
			
		
		JPanel LoginPanel = new JPanel();
		LoginPanel.setBounds(0, 0, 962, 415);
		frame.getContentPane().add(LoginPanel);
		LoginPanel.setLayout(null);
		LoginPanel.setVisible(false);
		JLabel lblNewLabel_3 = new JLabel("로그인 :");
		lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(242, 73, 173, 118);
		LoginPanel.add(lblNewLabel_3);
		superuser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPanel.setVisible(false);
				LoginPanel.setVisible(true);
			
			}
		});
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 18));
		textField.setBounds(389, 93, 274, 68);
		LoginPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("비밀번호 :");
		lblNewLabel_3_1.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_3_1.setBounds(216, 168, 173, 118);
		LoginPanel.add(lblNewLabel_3_1);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("굴림", Font.PLAIN, 18));
		passwordField.setBounds(389, 199, 274, 68);
		LoginPanel.add(passwordField);
		JButton btnNewButton_5 = new JButton("로그인");
						btnNewButton_5.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								String id = "park";
								String pw = "1234";
								
								if(id.equals(textField.getText()) && Arrays.equals(passwordField.getPassword(),"1234".toCharArray())){
									JOptionPane.showMessageDialog(null, "로그인 성공");
									
									txt1.setText(Integer.toString(wt.cnt));
									txt2.setText(Integer.toString(lcof.cnt));
									txt3.setText(Integer.toString(dri.cnt));
									txt4.setText(Integer.toString(cof.cnt));
									txt5.setText(Integer.toString(tas.cnt));
									MainPanel.setVisible(false);
									superpanel.setVisible(true);
									LoginPanel.setVisible(false);
								} else {
									JOptionPane.showMessageDialog(null,	 "로그인 실패");
								}
								
							}
							
						});
						btnNewButton_5.setFont(new Font("굴림", Font.PLAIN, 23));
						btnNewButton_5.setBounds(700, 110, 143, 126);
						LoginPanel.add(btnNewButton_5);
						
						JButton backpage = new JButton("뒤로가기");
						backpage.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								LoginPanel.setVisible(false);
								MainPanel.setVisible(true);
							}
						});
						backpage.setBounds(12, 10, 97, 49);
						LoginPanel.add(backpage);
						
						
		}
	
		
	void isTrue() {
		if(mymoney >=450 && wt.cnt>0) {
			waterif.setText("판매가능");
		}else {
			waterif.setText("판매불가");
		}
		
		
		if(mymoney >=500 && lcof.cnt>0) {
			lowcoffeif.setText("판매가능");
		}
		else {
			lowcoffeif.setText("판매불가");
		}
		
		if(mymoney >=550 && dri.cnt>0) {
			driif.setText("판매가능");
		}
		else {
			driif.setText("판매불가");
		}
		
		if(mymoney >=700 && cof.cnt>0) {
			coffeeif.setText("판매가능");
		}else {
			coffeeif.setText("판매불가");
		}
		
		if(mymoney >=750 && tas.cnt>0) {
			tansanif.setText("판매가능");
		}else {
			tansanif.setText("판매불가");
		}
		
		
		
	}
}
