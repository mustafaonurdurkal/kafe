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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BStoreItem extends JPanel {

	private Image backgroundImage;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Create the panel.
	 */
	public BStoreItem(String fileName) throws IOException {
		backgroundImage = ImageIO.read(new File(fileName));
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(backgroundImage, 0, 0, (int) getSize().getWidth() - 0, (int) getSize().getHeight() - 0, this);

	}
	
	public BStoreItem() {
       mesutkomser();
	}
	public void mesutkomser() {
		this.setBounds(0, 0, 1280, 720);
		setAlignmentX(Component.LEFT_ALIGNMENT);
		setBackground(Color.WHITE);
		setLayout(null);
		
		String[] columnNames = { "Item Id", "Item Name","Item Type" ,"FroozeOnReady","Price","Remain Amount"};
		Object[][] data = {
				{ new Integer(1), "sogan", "Uncountable","No","3,20TL","500"},
				{ new Integer(2), "egg", "countable","Yes","0,80TL","500"},
				{ new Integer(3), "cola", "countable","Yes","3,50TL","100"}
				
		};
		
		table = new JTable(data, columnNames);
	    table.setPreferredScrollableViewportSize(new Dimension(200, 70));
	    table.setBackground(Color.DARK_GRAY);
		table.setForeground(Color.WHITE);
		table.setFillsViewportHeight(true);
		table.setOpaque(false);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(656, 72, 570, 531);
		scrollPane.getViewport().setBackground(Color.DARK_GRAY);
		add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("Item List");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(82, 190, 230));
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.ITALIC, 27));
		lblNewLabel.setBounds(825, 23, 213, 38);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Create Item");
		lblNewLabel_1.setFont(new Font("Bauhaus 93", Font.ITALIC, 25));
		lblNewLabel_1.setBounds(28, 40, 158, 38);
		lblNewLabel_1.setForeground(new Color(82, 190, 230));
		add(lblNewLabel_1);
		
		JLabel lblItemName = new JLabel("Item Name:");
		lblItemName.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		lblItemName.setBounds(28, 93, 96, 22);
		add(lblItemName);
		
		textField = new JTextField();
		textField.setBounds(153, 95, 105, 20);
		textField.setBackground(Color.DARK_GRAY);
		textField.setForeground(Color.WHITE);
		textField.setDisabledTextColor(Color.WHITE);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("FroozeOnReady :");
		lblNewLabel_2.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		lblNewLabel_2.setBounds(28, 129, 115, 22);
		add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(153, 126, 105, 22);
		textField_1.setBackground(Color.DARK_GRAY);
		textField_1.setForeground(Color.WHITE);
		textField_1.setDisabledTextColor(Color.WHITE);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Modify Item");
		lblNewLabel_3.setFont(new Font("Bauhaus 93", Font.ITALIC, 25));
		lblNewLabel_3.setBounds(28, 187, 176, 38);
		lblNewLabel_3.setForeground(new Color(82, 190, 230));
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Item Id");
		lblNewLabel_4.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		lblNewLabel_4.setBounds(28, 243, 105, 22);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Add Amount");
		lblNewLabel_5.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		lblNewLabel_5.setBounds(28, 276, 96, 22);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Remove Amount");
		lblNewLabel_6.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		lblNewLabel_6.setBounds(28, 309, 110, 30);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Remove Item");
		lblNewLabel_7.setFont(new Font("Bauhaus 93", Font.ITALIC, 25));
		lblNewLabel_7.setBounds(28, 384, 158, 30);
		lblNewLabel_7.setForeground(new Color(82, 190, 230));
		add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Item Id");
		lblNewLabel_8.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		lblNewLabel_8.setBounds(28, 425, 86, 30);
		add(lblNewLabel_8);
		
		textField_2 = new JTextField();
		textField_2.setBounds(153, 244, 105, 22);
		textField_2.setBackground(Color.DARK_GRAY);
		textField_2.setForeground(Color.WHITE);
		textField_2.setDisabledTextColor(Color.WHITE);
		add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(153, 278, 105, 20);
		textField_3.setBackground(Color.DARK_GRAY);
		textField_3.setForeground(Color.WHITE);
		textField_3.setDisabledTextColor(Color.WHITE);
		add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(153, 315, 105, 20);
		textField_4.setBackground(Color.DARK_GRAY);
		textField_4.setForeground(Color.WHITE);
		textField_4.setDisabledTextColor(Color.WHITE);
		add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(153, 431, 105, 20);
		textField_5.setBackground(Color.DARK_GRAY);
		textField_5.setForeground(Color.WHITE);
		textField_5.setDisabledTextColor(Color.WHITE);
		add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		btnNewButton.setBounds(268, 276, 105, 23);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Remove");
		btnNewButton_1.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		btnNewButton_1.setBounds(268, 313, 105, 23);
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setForeground(Color.WHITE);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Remove");
	
		btnNewButton_2.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		btnNewButton_2.setBounds(284, 429, 89, 23);
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.setForeground(Color.WHITE);
		add(btnNewButton_2);
		
		JLabel lblNewLabel_9 = new JLabel("Price :");
		lblNewLabel_9.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		lblNewLabel_9.setBounds(28, 162, 115, 22);
		add(lblNewLabel_9);
		
		textField_6 = new JTextField();
		textField_6.setBounds(153, 164, 105, 20);
		textField_6.setBackground(Color.DARK_GRAY);
		textField_6.setForeground(Color.WHITE);
		textField_6.setDisabledTextColor(Color.WHITE);
		add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblChangePrice = new JLabel("Change Price");
		lblChangePrice.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		lblChangePrice.setBounds(28, 350, 115, 22);
		add(lblChangePrice);
		
		textField_7 = new JTextField();
		textField_7.setBounds(153, 353, 105, 22);
		textField_7.setBackground(Color.DARK_GRAY);
		textField_7.setForeground(Color.WHITE);
		textField_7.setDisabledTextColor(Color.WHITE);
		add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Change");
		btnNewButton_3.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		btnNewButton_3.setBounds(268, 351, 105, 21);
		btnNewButton_3.setBackground(Color.DARK_GRAY);
		btnNewButton_3.setForeground(Color.WHITE);
		add(btnNewButton_3);
		
		
	}

}
