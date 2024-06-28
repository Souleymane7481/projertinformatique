package myWBproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Acceuil {

	protected static final JLabel txtPassword = null;
	JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Acceuil window = new Acceuil();
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
	public Acceuil() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.ITALIC, 12));
		frame.getContentPane().setBackground(SystemColor.text);
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 584, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel_1 = new JLabel("username");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		
		JLabel lblNewLabel_2 = new JLabel("password");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		
		JButton btnNewButton = new JButton("Connexion");
		btnNewButton.addActionListener(new ActionListener() {
			private JLabel txtUsername;

			public void actionPerformed(ActionEvent e) {
				ACCEUILCHEFMAINT R= new ACCEUILCHEFMAINT();
				R.frame.setVisible(true);
				frame.dispose();
				}
					
				
		
	});
	
		btnNewButton.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		btnNewButton.setForeground(new Color(0, 0, 0));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Veuillez entrer vos informations de connexion");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		
		passwordField = new JPasswordField();
		
		JButton btnNewButton_1 = new JButton("Retour");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pageconnexion R= new Pageconnexion ();
				R.frame.setVisible(true);
				frame.dispose();
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(53)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(65)
							.addComponent(passwordField, 208, 208, 208)))
					.addGap(313))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(457, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(91)
					.addComponent(btnNewButton_1)
					.addPreferredGap(ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(264))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(55)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addPreferredGap(ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addGap(77))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
