package tr.edu.deu.ceng.coffie.entity.applicationform.cart;

import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.JFrame;

public class Cart {

	private JFrame frame;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cart window = new Cart();
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
	public Cart() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1280, 720);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);

		frame.setVisible(true);
		BCart cart =null;
		try {
			cart=new BCart("resources/background2.jpg");
			frame.getContentPane().add(cart);
		}catch(IOException e) {
			e.printStackTrace();
		}
		cart.SuleymanDemirel();
	}

}
