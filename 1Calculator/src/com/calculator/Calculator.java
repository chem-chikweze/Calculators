package com.calculator;

import java.awt.EventQueue;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFormattedTextField;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.UIManager;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double ans, num;
	int calculation;
	
	public void arithmetiOperation() {
		
		switch(calculation) {
		case 1: //addition
			ans = num + Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;		
		case 2: //substraction
			ans = num - Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		case 3: //multiplication
			ans = num * Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		case 4: //division
			ans = num / Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;

			
		}
	}
	/**
	 * Launch the application.
	 */
	
	
	
	public static void main(String[] args) {
		
		try {
            //here you can put the selected theme class name in JTattoo
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws MalformedURLException 
	 */
	public Calculator() throws MalformedURLException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws MalformedURLException 
	 */
	private void initialize() throws MalformedURLException {
		java.net.URL url = ClassLoader.getSystemResource("/ch.ico");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.createImage(url);
		Image icon;
		frame = new JFrame();
		frame.setIconImage(img);

		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("chem"));
		frame.getContentPane().setBackground(new Color(230, 230, 250));
		frame.getContentPane().setForeground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 412, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField.setHorizontalAlignment(SwingConstants.TRAILING);
		textField.setBounds(10, 59, 380, 64);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("github: chem-chikweze");
		lblNewLabel.setBounds(10, 10, 137, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel myLabel = new JLabel("");
		myLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		myLabel.setBackground(new Color(153, 180, 209));
		myLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		myLabel.setBounds(105, 10, 285, 35);
		frame.getContentPane().add(myLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 0));
		panel.setBounds(0, 0, 398, 136);
		frame.getContentPane().add(panel);
		
		JButton button1 = new JButton("1");
		button1.setBounds(10, 146, 85, 46);
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"1");
			}
			
		});
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("2");
		button2.setBounds(105, 146, 85, 46);
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
			
		});
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.setBounds(200, 146, 85, 46);
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
			
		});
		frame.getContentPane().add(button3);
		
		JButton btnNewButton_1_3_1_1 = new JButton("4");
		btnNewButton_1_3_1_1.setBounds(10, 214, 85, 46);
		btnNewButton_1_3_1_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
			}
			
		});
		frame.getContentPane().add(btnNewButton_1_3_1_1);
		
		JButton btnNewButton_4_1_1 = new JButton("5");
		btnNewButton_4_1_1.setBounds(105, 214, 85, 46);
		btnNewButton_4_1_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
			
		});
		frame.getContentPane().add(btnNewButton_4_1_1);
		
		JButton btnNewButton_1_1_2_1_1 = new JButton("6");
		btnNewButton_1_1_2_1_1.setBounds(200, 214, 85, 46);
		btnNewButton_1_1_2_1_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
			}
			
		});
		frame.getContentPane().add(btnNewButton_1_1_2_1_1);
		
		JButton btnNewButton_1_3_1_1_1 = new JButton("7");
		btnNewButton_1_3_1_1_1.setBounds(10, 285, 85, 46);
		btnNewButton_1_3_1_1_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"7");
			}
			
		});
		frame.getContentPane().add(btnNewButton_1_3_1_1_1);
		
		JButton btnNewButton_4_1_1_1 = new JButton("8");
		btnNewButton_4_1_1_1.setBounds(105, 285, 85, 46);
		btnNewButton_4_1_1_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"8");
			}
			
		});
		frame.getContentPane().add(btnNewButton_4_1_1_1);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(200, 285, 85, 46);
		btn9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText("9");
			}
			
		});
		frame.getContentPane().add(btn9);
		
		JButton button0 = new JButton("0");
		button0.setBounds(105, 357, 85, 46);
		button0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+ "0");
			}
			
		});
		frame.getContentPane().add(button0);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBounds(305, 146, 85, 46);
		btnPlus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation =1;
				myLabel.setText(textField.getText()+ "+");
				textField.setText("");
			}
			
		});
		frame.getContentPane().add(btnPlus);
		
		JButton buttonSub = new JButton("-");
		buttonSub.setBounds(305, 214, 85, 46);
		buttonSub.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 2;
				myLabel.setText(textField.getText()+ "-");
				textField.setText("");
			}
		});
		frame.getContentPane().add(buttonSub);
		
		JButton btnMul = new JButton("*");
		btnMul.setBounds(305, 285, 85, 46);
		btnMul.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 3;
				myLabel.setText(textField.getText()+ "*");
				textField.setText("");
				}
		});
		frame.getContentPane().add(btnMul);
		
		JButton buttonDot = new JButton(".");
		buttonDot.setBounds(10, 357, 85, 46);
		buttonDot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+".");
			}
			
		});
		frame.getContentPane().add(buttonDot);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setBounds(305, 357, 85, 46);
		btnDiv.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 4;
				myLabel.setText(textField.getText()+ "/");
				textField.setText("");
			}		
		});
		frame.getContentPane().add(btnDiv);
		
		JButton buttonBack = new JButton("BACK");
		buttonBack.setBounds(200, 357, 85, 46);
		buttonBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int length = textField.getText().length();
				int number = textField.getText().length() - 1;
				
				String store;
				if(length>0) {
					StringBuilder sb = new StringBuilder(textField.getText());
					sb.deleteCharAt(number);
					store = sb.toString();
					textField.setText(store);
				}			}
			
		});
		frame.getContentPane().add(buttonBack);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setBackground(new Color(169, 169, 169));
		btnClear.setBounds(10, 431, 180, 46);
		btnClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myLabel.setText("");
				textField.setText("");
			}
			
		});
		frame.getContentPane().add(btnClear);
		
		JButton btnNewButton_1_3_1_1_1_1_1_1 = new JButton("RESULT");
		btnNewButton_1_3_1_1_1_1_1_1.setBackground(new Color(169, 169, 169));
		btnNewButton_1_3_1_1_1_1_1_1.setBounds(200, 431, 188, 46);
		btnNewButton_1_3_1_1_1_1_1_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				arithmetiOperation();
				myLabel.setText(Double.toString(ans));
			}
			
		});
		frame.getContentPane().add(btnNewButton_1_3_1_1_1_1_1_1);
		
	
	}
}
