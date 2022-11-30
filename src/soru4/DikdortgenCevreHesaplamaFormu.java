package soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.management.loading.PrivateClassLoader;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DikdortgenCevreHesaplamaFormu {

	private JFrame frame;
	private JTextField txtKısaKenar;
	private JTextField txtUzunKenar;
	private JLabel lblSonuc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DikdortgenCevreHesaplamaFormu window = new DikdortgenCevreHesaplamaFormu();
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
	public DikdortgenCevreHesaplamaFormu() {
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
		lblKısaKenar.setBounds(33, 48, 117, 21);
		frame.getContentPane().add(lblKısaKenar);
		
		JLabel lblUzunKenar = new JLabel("Uzun kenarı giriniz:");
		lblUzunKenar.setBounds(33, 134, 117, 21);
		frame.getContentPane().add(lblUzunKenar);
		
		txtKısaKenar = new JTextField();
		txtKısaKenar.setColumns(10);
		txtKısaKenar.setBounds(282, 48, 86, 20);
		frame.getContentPane().add(txtKısaKenar);
		
		txtUzunKenar = new JTextField();
		txtUzunKenar.setColumns(10);
		txtUzunKenar.setBounds(282, 134, 86, 20);
		frame.getContentPane().add(txtUzunKenar);
		
		lblSonuc = new JLabel("");
		lblSonuc.setBounds(112, 166, 192, 21);
		frame.getContentPane().add(lblSonuc);
		
		JButton btnNewButton = new JButton("Hesapla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dikdortgen dikdortgen= new Dikdortgen();
				double a= Double.valueOf(txtKısaKenar.getText());
				double b= Double.valueOf(txtUzunKenar.getText());
				if (a>0 && b>0) {
					lblSonuc.setText(dikdortgen.dikdorgenCevreHesapla(a, b));
				}else {
					lblSonuc.setText("Lütfen doğru değer giriniz");
				}
				
	
			}
		});
		btnNewButton.setBounds(157, 214, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
