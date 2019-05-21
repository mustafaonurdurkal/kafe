package tr.edu.deu.ceng.coffie.entity.applicationform.loginpanel;

import java.awt.EventQueue;
import java.io.IOException;
import javax.swing.*;


public class LoginWindow {

	private JFrame frame;

	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginWindow window = new LoginWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public LoginWindow() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1280, 720);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LoginPanel dogi=null;
		try {
			dogi=new LoginPanel("resources/background.jpg",frame);
			frame.getContentPane().add(dogi);
		}catch(IOException e) {
			e.printStackTrace();
		}
		frame.setUndecorated(true);
		    dogi.mertcumali();
	}

}
