package Reg_log;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class registration {

	private JFrame frame;
	private JTextField s;
	private JTextField n;
	private JTextField em;
	private JTextField m;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registration window = new registration();
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
	public registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 728, 343);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRATION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(254, 11, 171, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Sitka Heading", Font.BOLD, 18));
		lblNewLabel_1.setBounds(43, 99, 59, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("email");
		lblNewLabel_1_1.setFont(new Font("Sitka Heading", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(43, 135, 59, 25);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Marks");
		lblNewLabel_1_2.setFont(new Font("Sitka Heading", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(43, 182, 59, 25);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Sno");
		lblNewLabel_1_3.setFont(new Font("Sitka Heading", Font.BOLD, 18));
		lblNewLabel_1_3.setBounds(43, 59, 59, 25);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		s = new JTextField();
		s.setBounds(143, 60, 123, 20);
		frame.getContentPane().add(s);
		s.setColumns(10);
		
		n = new JTextField();
		n.setColumns(10);
		n.setBounds(143, 100, 123, 20);
		frame.getContentPane().add(n);
		
		em = new JTextField();
		em.setColumns(10);
		em.setBounds(143, 136, 123, 20);
		frame.getContentPane().add(em);
		
		m = new JTextField();
		m.setColumns(10);
		m.setBounds(143, 183, 123, 20);
		frame.getContentPane().add(m);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 String sno=s.getText();
			 String name=n.getText();
			 String email=em.getText();
			 String marks=m.getText();
			 
			 try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/log","root","mrec");
				String q="insert into stu2 values('"+sno+"','"+name+"','"+marks+"','"+email+"')";
				Statement sta=con.createStatement();
				sta.executeUpdate(q);
				con.close();
				JOptionPane.showMessageDialog(btnNewButton, "done");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			login ln=new login();
			 ln.setVisible(true);
			 
			 
			}
		});
		btnNewButton.setBounds(276, 239, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
