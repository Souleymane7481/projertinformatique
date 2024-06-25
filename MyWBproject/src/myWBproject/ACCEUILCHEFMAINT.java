package myWBproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ACCEUILCHEFMAINT {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ACCEUILCHEFMAINT window = new ACCEUILCHEFMAINT();
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
	public ACCEUILCHEFMAINT() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.text);
		frame.setBounds(100, 100, 681, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.text);
		panel.setBounds(10, 42, 278, 348);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("GESTION DES MAINTENANCES");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		GESTIONDESMAINTENANCES R= new	GESTIONDESMAINTENANCES();
		R.frame.setVisible(true);
		frame.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		btnNewButton_1.setBounds(-12, 23, 280, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("GESTION DES OPERATEURS");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GESTIONDESOPERATEURS R= new GESTIONDESOPERATEURS();
				R.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		btnNewButton_2.setBounds(0, 98, 268, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("GESTIONS DES PRESTATIONS");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FACTURATIONDESPRESTATIONS R= new FACTURATIONDESPRESTATIONS();
				R.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		btnNewButton_3.setBounds(0, 171, 268, 23);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("GESTION DES FICHES DE MAINTENANCE");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LISTEFICHESMAINTENANCE R= new LISTEFICHESMAINTENANCE();
				R.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		btnNewButton_4.setBounds(0, 231, 268, 23);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("REGLEMENT ET CLOTURE");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GESTIONADMFIN R= new GESTIONADMFIN ();
				R.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_5.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		btnNewButton_5.setBounds(0, 300, 268, 23);
		panel.add(btnNewButton_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		panel_1.setBounds(324, 42, 331, 348);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GESTION DES CLIENTS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblNewLabel.setBounds(10, 11, 220, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("DECONNEXION");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Acceuil R= new Acceuil ();
				R.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		btnNewButton.setBounds(233, 427, 156, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
