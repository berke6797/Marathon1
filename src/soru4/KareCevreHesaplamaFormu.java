package soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KareCevreHesaplamaFormu {

	private JFrame frame;
	private JTextField txtKareKenar;
	private JLabel lblCevreSonuc;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KareCevreHesaplamaFormu window = new KareCevreHesaplamaFormu();
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
	public KareCevreHesaplamaFormu() {
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
		
		JLabel lblKareKenar = new JLabel("Kenar uzunluğunu giriniz :");
		lblKareKenar.setBounds(26, 39, 151, 24);
		frame.getContentPane().add(lblKareKenar);
		
		txtKareKenar = new JTextField();
		txtKareKenar.setColumns(10);
		txtKareKenar.setBounds(217, 43, 159, 20);
		frame.getContentPane().add(txtKareKenar);
		
		JButton btnNewButton = new JButton("Hesapla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Kare kare= new Kare();
				double a=Double.valueOf(txtKareKenar.getText());
				lblCevreSonuc.setText(kare.kareCevreHesapla(a));
				
				
			}
		});
		btnNewButton.setBounds(163, 181, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		 lblCevreSonuc = new JLabel("");
		lblCevreSonuc.setBounds(26, 118, 350, 24);
		frame.getContentPane().add(lblCevreSonuc);
	}

}
