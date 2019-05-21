package tr.edu.deu.ceng.coffie.entity.applicationform;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSpinner;

public class BCheckOut extends JPanel {

	private Image backgroundImage;
	private JTable table;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public BCheckOut(String fileName) throws IOException {
		backgroundImage = ImageIO.read(new File(fileName));
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(backgroundImage, 0, 0, (int) getSize().getWidth() - 0, (int) getSize().getHeight() - 0, this);

	}

	
	public BCheckOut() {
        checkoutmethod();
	}
	public void checkoutmethod() {
		this.setBounds(0, 0, 1280, 720);
		setAlignmentX(Component.LEFT_ALIGNMENT);
		setBackground(Color.WHITE);
		setLayout(null);
		
		String[] columnNames = { "Order List", "Cost"};
		Object[][] data = {
				{ "Order1", "7,40"},
				{ "Order2", "3,80"},
				{ "Order3", "2,20"}
		};
		
		table = new JTable(data, columnNames);
	    table.setPreferredScrollableViewportSize(new Dimension(200, 70));
	    table.setBackground(Color.DARK_GRAY);
		table.setForeground(Color.WHITE);
		table.setFillsViewportHeight(true);
		table.setOpaque(false);
	
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(249, 60, 355, 584);
		scrollPane.getViewport().setBackground(Color.DARK_GRAY);
		add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("Order List");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(82, 190, 230));
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.ITALIC, 27));
		lblNewLabel.setBounds(250, 11, 213, 38);
		add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("Table Number");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(82, 190, 230));
		lblNewLabel_1.setFont(new Font("Bauhaus 93", Font.ITALIC, 27));
		lblNewLabel_1.setBounds(0, 11, 213, 38);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NULL");
		lblNewLabel_2.setFont(new Font("Bauhaus 93", Font.ITALIC, 25));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(23, 58, 188, 38);
		add(lblNewLabel_2);
		
		JLabel lblPayWithCard = new JLabel("Pay With Card");
		lblPayWithCard.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		lblPayWithCard.setBounds(23, 136, 122, 38);
		add(lblPayWithCard);
		
		JLabel lblNewLabel_3 = new JLabel("Card Id :");
		lblNewLabel_3.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_3.setBounds(23, 175, 74, 26);
		add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(97, 178, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("PAY");
		btnNewButton.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		btnNewButton.setBounds(23, 239, 106, 23);
		add(btnNewButton);
		
		JLabel lblCost = new JLabel("Cost :");
		lblCost.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblCost.setBounds(23, 212, 62, 17);
		add(lblCost);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(95, 209, 88, 20);
		add(spinner);
		
	}
}
