package Reg_log;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	private JTextField s1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 726, 342);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(302, 11, 77, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("sno");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(48, 61, 58, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lb1 = new JLabel("name :");
		lb1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lb1.setBounds(37, 153, 171, 25);
		frame.getContentPane().add(lb1);
		
		JLabel lb2 = new JLabel("marks :");
		lb2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lb2.setBounds(37, 211, 107, 25);
		frame.getContentPane().add(lb2);
		
		s1 = new JTextField();
		s1.setBounds(122, 65, 86, 20);
		frame.getContentPane().add(s1);
		s1.setColumns(10);
		
		JButton b = new JButton("submit");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sno=s1.getText();
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/log","root","mrec");
					String q="select name,marks from stu2 where sno=?";
					PreparedStatement ps=con.prepareStatement(q);
					ps.setString(1,sno);
					ResultSet rs=ps.executeQuery();
					rs.next();
					lb1.setText("name: "+rs.getString(1));
					lb2.setText("marks: "+rs.getString(2));
						
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		b.setFont(new Font("Tahoma", Font.BOLD, 14));
		b.setBounds(103, 109, 89, 23);
		frame.getContentPane().add(b);
	}

	public void setVisible(boolean b) {
		frame.setVisible(true);
		// TODO Auto-generated method stub
		
	}

}
