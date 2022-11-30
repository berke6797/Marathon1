package soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DikdortgenAlanHesaplamaFormu {

	private JFrame frame;
	private JTextField txtKısakenar;
	private JTextField txtUzunKenar;
	private JButton btnNewButton;
	private JLabel lblSonuc ;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DikdortgenAlanHesaplamaFormu window = new DikdortgenAlanHesaplamaFormu();
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
	public DikdortgenAlanHesaplamaFormu() {
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
		
		JLabel lblKısaKenar = new JLabel("Kısa kenarı giriniz:");
		lblKısaKenar.setBounds(46, 49, 117, 21);
		frame.getContentPane().add(lblKısaKenar);
		
		JLabel lblUzunKenar = new JLabel("Uzun kenarı giriniz:");
		lblUzunKenar.setBounds(46, 110, 117, 21);
		frame.getContentPane().add(lblUzunKenar);
		
		txtKısakenar = new JTextField();
		txtKısakenar.setBounds(262, 49, 86, 20);
		frame.getContentPane().add(txtKısakenar);
		txtKısakenar.setColumns(10);
		
		txtUzunKenar = new JTextField();
		txtUzunKenar.setBounds(262, 110, 86, 20);
		frame.getContentPane().add(txtUzunKenar);
		txtUzunKenar.setColumns(10);
		
		JButton btnNewButton = new JButton("Hesapla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dikdortgen dikdortgen= new Dikdortgen();
				double a= Double.valueOf(txtKısakenar.getText());
				double b= Double.valueOf(txtUzunKenar.getText());
				lblSonuc.setText(dikdortgen.dikdortgenAlanHesapla(a, b));
				
			
							}
		});
		btnNewButton.setBounds(155, 187, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		 lblSonuc = new JLabel("");
		lblSonuc.setBounds(107, 153, 192, 21);
		frame.getContentPane().add(lblSonuc);
	}

}
