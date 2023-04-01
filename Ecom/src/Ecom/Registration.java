package Ecom;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration {

	private JFrame rframe;
	private JTextField rt1;
	private JTextField rt2;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
					window.rframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		rframe = new JFrame();
		rframe.getContentPane().setBackground(Color.LIGHT_GRAY);
		rframe.getContentPane().setForeground(UIManager.getColor("Button.shadow"));
		rframe.setBounds(100, 100, 450, 300);
		rframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rframe.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setBackground(UIManager.getColor("Button.focus"));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(158, 11, 106, 31);
		rframe.getContentPane().add(lblNewLabel);
		
		JLabel run = new JLabel("User Name");
		run.setFont(new Font("Tahoma", Font.ITALIC, 13));
		run.setBounds(23, 70, 73, 23);
		rframe.getContentPane().add(run);
		
		rt1 = new JTextField();
		rt1.setBounds(125, 72, 121, 20);
		rframe.getContentPane().add(rt1);
		rt1.setColumns(10);
		
		JLabel rp = new JLabel("phone number");
		rp.setFont(new Font("Tahoma", Font.ITALIC, 13));
		rp.setBounds(23, 114, 121, 14);
		rframe.getContentPane().add(rp);
		
		rt2 = new JTextField();
		rt2.setBounds(124, 112, 122, 20);
		rframe.getContentPane().add(rt2);
		rt2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("email");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNewLabel_3.setBounds(23, 161, 73, 23);
		rframe.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(125, 164, 121, 20);
		rframe.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=rt1.getText();
				JOptionPane.showMessageDialog(btnNewButton,name+ "Done!!");
			
				login l=new login();
				l.lb2.setText(name+" plz login");
				l.lframe.setVisible(true);
				rframe.dispose();
				
			}
			
		});
		btnNewButton.setBackground(UIManager.getColor("Button.focus"));
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btnNewButton.setBounds(158, 209, 89, 23);
		rframe.getContentPane().add(btnNewButton);
	}
}
