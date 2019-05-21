package tr.edu.deu.ceng.coffie.entity.applicationform;

import java.awt.Color;
import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

public class Recipe {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recipe window = new Recipe();
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
	public Recipe() {
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
		BRecipe recipe =null;
		try {
			recipe=new BRecipe("resources/background2.jpg");
			frame.getContentPane().add(recipe);
		}catch(IOException e) {
			e.printStackTrace();
		}
		frame.setUndecorated(true);
		recipe.hakantasiyan();
	}
	

}
