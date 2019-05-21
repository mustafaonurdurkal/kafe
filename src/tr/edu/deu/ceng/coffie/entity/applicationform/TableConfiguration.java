package tr.edu.deu.ceng.coffie.entity.applicationform;

import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.JFrame;

public class TableConfiguration {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableConfiguration window = new TableConfiguration();
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
	public TableConfiguration() {
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
		Btableconfpanel tableconf =null;
		try {
			tableconf=new Btableconfpanel("resources/background2.jpg");
			frame.getContentPane().add(tableconf);
		}catch(IOException e) {
			e.printStackTrace();
		}
		frame.setUndecorated(true);
		    tableconf.hasansas();
	}

}
