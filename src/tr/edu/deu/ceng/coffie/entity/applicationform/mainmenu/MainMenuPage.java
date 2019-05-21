package tr.edu.deu.ceng.coffie.entity.applicationform.mainmenu;

import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.JFrame;

public class MainMenuPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenuPage window = new MainMenuPage();
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
	public MainMenuPage() {
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
		Bmainpanel mainpanel=null;
		try {
			mainpanel=new Bmainpanel("resources/background2.jpg");
			frame.getContentPane().add(mainpanel);
		}catch(IOException e) {
			e.printStackTrace();
		}
		mainpanel.lazziya();
	}

}
