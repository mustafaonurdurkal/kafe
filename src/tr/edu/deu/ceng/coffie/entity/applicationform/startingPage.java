package tr.edu.deu.ceng.coffie.entity.applicationform;

import java.awt.EventQueue;
import java.io.IOException;
import javax.swing.*;


public class startingPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					startingPage window = new startingPage();
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
	public startingPage() {
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
		Bpanel dogi=null;
		try {
			dogi=new Bpanel("resources/background.jpg");
			frame.getContentPane().add(dogi);
		}catch(IOException e) {
			e.printStackTrace();
		}
		frame.setUndecorated(true);
		    dogi.mertcumali();
	}

}
