package tr.edu.deu.ceng.coffie.entity.applicationform;

import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class DEFTERLER {

	private JFrame frame;
	private BDEFTERLER defterler_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DEFTERLER window = new DEFTERLER();
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
	public DEFTERLER() {
		initialize();
	}

	private JFrame parent;
	public DEFTERLER(JFrame parent) {
		this.parent = parent;
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
		BDEFTERLER defterler =null;
		try {
			defterler_1=new BDEFTERLER("resources/background2.jpg",parent,frame);
			frame.getContentPane().add(defterler_1);
		}catch(IOException e) {
			e.printStackTrace();
		}
		defterler_1.helaldogukan();
	}

}
