package soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KareAlanHesaplamaFormu {

	private JFrame frame;
	private JTextField textKenar;
	private Kare kare;
	JLabel lblKareAlanSonuc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KareAlanHesaplamaFormu window = new KareAlanHesaplamaFormu();
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
	public KareAlanHesaplamaFormu() {
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
		lblKareKenar.setBounds(21, 47, 151, 24);
		frame.getContentPane().add(lblKareKenar);
		
		textKenar = new JTextField();
		textKenar.setBounds(240, 49, 86, 20);
		frame.getContentPane().add(textKenar);
		textKenar.setColumns(10);
		
		JButton btnNewButton = new JButton("Hesapla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Kare kare= new Kare();
				double a=Double.valueOf(textKenar.getText()) ;
			lblKareAlanSonuc.setText(kare.kareAlanHesapla(a));	;
			}
		});
		btnNewButton.setBounds(136, 157, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		lblKareAlanSonuc = new JLabel("");
		lblKareAlanSonuc.setBounds(21, 112, 305, 20);
		frame.getContentPane().add(lblKareAlanSonuc);
	}
}
