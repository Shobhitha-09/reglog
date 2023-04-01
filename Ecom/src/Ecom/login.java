package Ecom;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

    JFrame lframe;
	private JTextField t1;
	private JPasswordField t2;
	JLabel lb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.lframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		lframe = new JFrame();
		lframe.getContentPane().setForeground(Color.BLUE);
		lframe.setBounds(100, 100, 450, 300);
		lframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lframe.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("login");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(179, 22, 61, 20);
		lframe.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(30, 72, 68, 14);
		lframe.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("password");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(30, 109, 68, 14);
		lframe.getContentPane().add(lblNewLabel_1_1);
		
		t1 = new JTextField();
		t1.setBounds(125, 70, 86, 20);
		lframe.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JPasswordField();
		t2.setBounds(125, 107, 86, 20);
		lframe.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String un=t1.getText();
				String p=t2.getText();
				if(un.equals("shobi")&& p.equals("123"))
				{
					JOptionPane.showMessageDialog(btnNewButton,"valid");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton,"invalid");
				}
				    
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(162, 187, 89, 23);
		lframe.getContentPane().add(btnNewButton);
		
		
		 lb2 = new JLabel("");
		lb2.setBounds(52, 40, 238, 14);
		lframe.getContentPane().add(lb2);
		
		 lb2 = new JLabel("");
		lb2.setBounds(30, 47, 342, 20);
		lframe.getContentPane().add(lb2);
	}

	
		
		
		
		// TODO Auto-generated method stub
		
}
