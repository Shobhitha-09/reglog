package Ecom;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class product {

	private JFrame frame;
	int i=0;
	int bill=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					product window = new product();
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
	public product() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 460, 328);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("amazon");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(161, 27, 83, 21);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\b2.png"));
		lblNewLabel_1.setBounds(28, 71, 131, 146);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\b1.PNG"));
		lblNewLabel_2.setBounds(241, 81, 96, 136);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lb = new JLabel("cart:");
		lb.setFont(new Font("Tahoma", Font.BOLD, 13));
		lb.setBounds(319, 45, 83, 14);
		frame.getContentPane().add(lb);
		
		JComboBox c1 = new JComboBox();
		c1.setFont(new Font("Tahoma", Font.BOLD, 13));
		c1.setModel(new DefaultComboBoxModel(new String[] {"select", "pdf", "ppt"}));
		c1.setBounds(38, 228, 86, 22);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"select", "pdf", "kindal", "ppt"}));
		c2.setFont(new Font("Tahoma", Font.BOLD, 13));
		c2.setBounds(241, 228, 86, 22);
		frame.getContentPane().add(c2);
		
		JButton b1 = new JButton("add to cart");
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("cart: "+i);
				int p=120;
				String t=(String) c1.getSelectedItem();
                bill=i*p;
				
				JOptionPane.showMessageDialog(b1, "price: "+p+"\n t: "+t+"bill: "+bill);
				
				
				
			
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 13));
		b1.setBounds(10, 255, 119, 23);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("add to cart");
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("cart: "+i);
				int p=125;
				String t=(String) c2.getSelectedItem();
				bill=i*p;
				
				JOptionPane.showMessageDialog(b2, "price: "+p+"\n t: "+t+"bill: "+bill);
			
				
			}
		});
		b2.setFont(new Font("Tahoma", Font.BOLD, 13));
		b2.setBounds(241, 255, 119, 23);
		frame.getContentPane().add(b2);
		
		JLabel lblNewLabel_3 = new JLabel("120/-");
		lblNewLabel_3.setBounds(28, 46, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("125/-");
		lblNewLabel_4.setBounds(240, 56, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lb2 = new JLabel("bill:");
		lb2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lb2.setBounds(347, 97, 65, 14);
		frame.getContentPane().add(lb2);
		
		JButton btnNewButton = new JButton("buy");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb2.setText("bill: "+bill);
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(355, 169, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
