package myWBproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;

public class DEMANDEDEMAINTENANCE {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DEMANDEDEMAINTENANCE window = new DEMANDEDEMAINTENANCE();
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
	public DEMANDEDEMAINTENANCE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.text);
		frame.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		frame.getContentPane().setFont(new Font("Times New Roman", Font.ITALIC, 12));
		frame.setBounds(100, 100, 686, 517);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("SAISIR UNE DEMANDE DE MAINTENANCE");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		
		JLabel lblNewLabel_1 = new JLabel("DESCRIPTION");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("DATE DE DEMANDE");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("TYPE DE MAINTENANCE");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("RETOUR");
		btnNewButton.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GESTIONDESMAINTENANCES R= new GESTIONDESMAINTENANCES();
				R.frame.setVisible(true);
				frame.dispose();
			}
		});
		
		JButton btnNewButton_1 = new JButton("VALIDER");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Maintenance crée avec succès !");
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_4)
								.addComponent(lblNewLabel_3))
							.addGap(22)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_2, 343, 343, 343)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(textField_3, 343, 343, 343)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(25)
											.addComponent(btnNewButton)
											.addPreferredGap(ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
											.addComponent(btnNewButton_1)
											.addGap(23))
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(textField, Alignment.LEADING)
											.addComponent(textField_1, Alignment.LEADING, 343, 343, Short.MAX_VALUE))))))
						.addComponent(lblNewLabel))
					.addContainerGap(172, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addGap(31)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addGap(56)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(44)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4))
					.addGap(57)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3))
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton))
					.addGap(74))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
