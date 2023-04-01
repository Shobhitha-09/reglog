package Reg_app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class log {

	private JFrame frame;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					log window = new log();
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
	public log() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("log page");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(173, 11, 96, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel un = new JLabel("username");
		un.setFont(new Font("Tahoma", Font.BOLD, 15));
		un.setBounds(43, 58, 80, 25);
		frame.getContentPane().add(un);
		
		JLabel pa = new JLabel("password");
		pa.setFont(new Font("Tahoma", Font.BOLD, 15));
		pa.setBounds(43, 105, 80, 25);
		frame.getContentPane().add(pa);
		
		JTextField t1 = new JTextField();
		t1.setBounds(143, 62, 126, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		p1 = new JPasswordField();
		p1.setBounds(143, 109, 126, 20);
		frame.getContentPane().add(p1);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String un=t1.getText();
				String pa=p1.getText();
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reg","root","mrec");
					String q="select count(*) from login where email=? and password=?";
					PreparedStatement ps=con.prepareStatement(q);
					ps.setString(1, un);
					ps.setString(2, pa);
					ResultSet rs=ps.executeQuery();
					rs.next();
					int count=rs.getInt(1);
					if(count==0)
					{
						JOptionPane.showMessageDialog(btnNewButton, "Invalid");
						
					}
					else
					{
						JOptionPane.showMessageDialog(btnNewButton, "login");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(167, 183, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
