package tr.edu.deu.ceng.coffie.entity.applicationform;

import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.JFrame;

public class FoodAndDrinkMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FoodAndDrinkMenu window = new FoodAndDrinkMenu();
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
	public FoodAndDrinkMenu() {
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
		BFoodAndDrink foodanddrink =null;
		try {
			foodanddrink=new BFoodAndDrink("resources/background2.jpg");
			frame.getContentPane().add(foodanddrink);
		}catch(IOException e) {
			e.printStackTrace();
		}
		frame.setUndecorated(true);
		foodanddrink.kapkankagan();
	}

}
