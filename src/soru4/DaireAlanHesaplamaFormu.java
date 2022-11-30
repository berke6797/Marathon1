package soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DaireAlanHesaplamaFormu {

	private JFrame frame;
	private JTextField txtYaricap;
	private	JLabel lblSonuc;
	private JLabel lblYariCap;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DaireAlanHesaplamaFormu window = new DaireAlanHesaplamaFormu();
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
	public DaireAlanHesaplamaFormu() {
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
		
	 lblYariCap = new JLabel("Dairenin yarıçapını giriniz :");
		lblYariCap.setBounds(24, 35, 171, 20);
		frame.getContentPane().add(lblYariCap);
		
		txtYaricap = new JTextField();
		txtYaricap.setColumns(10);
		txtYaricap.setBounds(223, 35, 86, 20);
		frame.getContentPane().add(txtYaricap);
		
		lblSonuc = new JLabel("");
		lblSonuc.setBounds(57, 138, 275, 20);
		frame.getContentPane().add(lblSonuc);
		
		JButton btnNewButton = new JButton("Hesapla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Daire daire= new Daire();
				double r=Double.valueOf(txtYaricap.getText());
				if (r>0) {
					String alan= daire.daireninAlaniniHesapla(r);
					lblSonuc.setText(alan);
				}else {
					lblSonuc.setText("Lütfen doğru değer giriniz ");
				}
					
				}	
		});
		
		btnNewButton.setBounds(147, 193, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
