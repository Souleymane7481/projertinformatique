package myWBproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.SystemColor;

public class GESTIONDESMAINTENANCES {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GESTIONDESMAINTENANCES window = new GESTIONDESMAINTENANCES();
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
	public GESTIONDESMAINTENANCES() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.text);
		frame.getContentPane().setFont(new Font("Times New Roman", Font.ITALIC, 12));
		frame.setBounds(100, 100, 680, 494);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.text);
		panel.setBounds(10, 39, 289, 366);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("CREER UNE MAINTENANCE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DEMANDEDEMAINTENANCE R= new DEMANDEDEMAINTENANCE();
				R.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		btnNewButton_1.setBounds(20, 81, 187, 37);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("LISTE DES MAINTENANCES");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LISTEDEMANDEMAINTENANCE R= new LISTEDEMANDEMAINTENANCE();
				R.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_2.setToolTipText("LISTE DES MAINTENANCES");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		btnNewButton_2.setBounds(20, 250, 187, 37);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("GESTION DES MAINTENANCES");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblNewLabel.setBounds(10, 11, 257, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		panel_1.setBounds(325, 39, 329, 366);
		frame.getContentPane().add(panel_1);
		
		JButton btnNewButton = new JButton("RETOUR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ACCEUILCHEFMAINT R= new ACCEUILCHEFMAINT();
				R.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		btnNewButton.setBounds(219, 416, 152, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
