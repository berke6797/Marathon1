package soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DaireCevreHesaplamaFormu {

	private JFrame frame;
	private JTextField txtYariCap;
	private JLabel lblSonuc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DaireCevreHesaplamaFormu window = new DaireCevreHesaplamaFormu();
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
	public DaireCevreHesaplamaFormu() {
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
		
		JLabel lblYariCap = new JLabel("Dairenin yarıçapını giriniz :");
		lblYariCap.setBounds(33, 38, 171, 20);
		frame.getContentPane().add(lblYariCap);
		
		txtYariCap = new JTextField();
		txtYariCap.setBounds(239, 38, 86, 20);
		frame.getContentPane().add(txtYariCap);
		txtYariCap.setColumns(10);
		
		 lblSonuc = new JLabel("");
		lblSonuc.setBounds(50, 100, 275, 20);
		frame.getContentPane().add(lblSonuc);
		
		JButton btnNewButton = new JButton("Hesapla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Daire daire= new Daire();
				if(Double.valueOf(txtYariCap.getText())>0) {
				String cevre= daire.daireCevreHesapla(Double.valueOf(txtYariCap.getText()));
				lblSonuc.setText(cevre);
				}else {

					lblSonuc.setText("Lütfen doğru değer giriniz ");
				}
				}
		
		});
		btnNewButton.setBounds(144, 153, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
