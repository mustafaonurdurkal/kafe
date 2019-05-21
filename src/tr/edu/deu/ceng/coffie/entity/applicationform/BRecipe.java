package tr.edu.deu.ceng.coffie.entity.applicationform;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.JTextArea;

public class BRecipe extends JPanel {

	private Image backgroundImage;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;


	/**
	 * Create the panel.
	 */
	public BRecipe(String fileName) throws IOException {
		backgroundImage = ImageIO.read(new File(fileName));
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(backgroundImage, 0, 0, (int) getSize().getWidth() - 0, (int) getSize().getHeight() - 0, this);

	}

	public BRecipe() {
         hakantasiyan();
	}
	
	public void hakantasiyan() {

		
		
		this.setBounds(0, 0, 1280, 720);
		setAlignmentX(Component.LEFT_ALIGNMENT);
		setBackground(Color.WHITE);
		setLayout(null);
		
		String[] columnNames = { "Item Id", "Item Name", "Total Cost"};
		Object[][] data = {
				{ new Integer(1), "Menemen", "9,25"},
				{ new Integer(2), "Omlet", "8,75"},
				{ new Integer(3), "Nargile", "5,50"}		
		};
		table = new JTable(data, columnNames);
	    table.setPreferredScrollableViewportSize(new Dimension(200, 70));
	    table.setBackground(Color.DARK_GRAY);
		table.setForeground(Color.WHITE);
		table.setFillsViewportHeight(true);
		table.setOpaque(false);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(1059, 72, 223, 605);
		scrollPane.getViewport().setBackground(Color.DARK_GRAY);
		add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("Recipe List");
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(1059, 11, 211, 48);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(82, 190, 230));
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Add Recipe");
		lblNewLabel_1.setFont(new Font("Bauhaus 93", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1.setBounds(48, 22, 174, 32);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(82, 190, 230));
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Recipe Name :");
		lblNewLabel_2.setForeground(UIManager.getColor("info"));
		lblNewLabel_2.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_2.setBounds(27, 69, 88, 23);
		add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(159, 70, 86, 20);
		textField.setBackground(Color.DARK_GRAY);
		textField.setForeground(Color.WHITE);
		textField.setDisabledTextColor(Color.WHITE);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Add Package item:");
		lblNewLabel_3.setForeground(UIManager.getColor("info"));
		lblNewLabel_3.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_3.setBounds(27, 96, 135, 32);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Countable Item");
		lblNewLabel_4.setForeground(UIManager.getColor("info"));
		lblNewLabel_4.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_4.setBounds(48, 151, 98, 23);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Uncontable Item");
		lblNewLabel_5.setForeground(UIManager.getColor("info"));
		lblNewLabel_5.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_5.setBounds(48, 185, 98, 20);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Amount&Quantity");
		lblNewLabel_6.setForeground(UIManager.getColor("info"));
		lblNewLabel_6.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_6.setBounds(309, 129, 119, 14);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Package Item");
		lblNewLabel_7.setForeground(UIManager.getColor("info"));
		lblNewLabel_7.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_7.setBounds(178, 129, 109, 14);
		add(lblNewLabel_7);
		
		textField_1 = new JTextField();
		textField_1.setBounds(308, 152, 98, 20);
		textField_1.setBackground(Color.DARK_GRAY);
		textField_1.setForeground(Color.WHITE);
		textField_1.setDisabledTextColor(Color.WHITE);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(309, 185, 97, 20);
		textField_2.setBackground(Color.DARK_GRAY);
		textField_2.setForeground(Color.WHITE);
		textField_2.setDisabledTextColor(Color.WHITE);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Recipe");
		lblNewLabel_8.setForeground(UIManager.getColor("info"));
		lblNewLabel_8.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_8.setBounds(27, 269, 67, 14);
		add(lblNewLabel_8);
		
		JButton btnNewButton = new JButton("Add Package Item");
		btnNewButton.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		btnNewButton.setBounds(228, 228, 178, 23);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(272, 294, 194, 275);
		panel.setBackground(Color.DARK_GRAY);
		panel.setForeground(Color.WHITE);
		add(panel);
		
		JButton btnNewButton_1 = new JButton("Create Recipe");
		btnNewButton_1.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		btnNewButton_1.setBounds(275, 633, 164, 32);
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setForeground(Color.WHITE);
		add(btnNewButton_1);
		
		JLabel lblNewLabel_9 = new JLabel("Total Price :");
		lblNewLabel_9.setForeground(UIManager.getColor("info"));
		lblNewLabel_9.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_9.setBounds(274, 608, 80, 14);
		add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Null");
		lblNewLabel_10.setForeground(UIManager.getColor("info"));
		lblNewLabel_10.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_10.setBounds(364, 608, 88, 14);
		add(lblNewLabel_10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(178, 152, 109, 20);
		comboBox.setBackground(Color.DARK_GRAY);
		comboBox.setForeground(Color.WHITE);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(178, 185, 109, 20);
		comboBox_1.setBackground(Color.DARK_GRAY);
		comboBox_1.setForeground(Color.WHITE);
		add(comboBox_1);
		
		JButton btnNewButton_2 = new JButton("Remove");
		btnNewButton_2.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		btnNewButton_2.setBounds(274, 580, 89, 23);
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.setForeground(Color.WHITE);
		add(btnNewButton_2);
		
		JLabel lblNewLabel_11 = new JLabel("Modify Recipe");
		lblNewLabel_11.setFont(new Font("Bauhaus 93", Font.ITALIC, 25));
		lblNewLabel_11.setBounds(594, 19, 186, 32);
		add(lblNewLabel_11);
		lblNewLabel_11.setForeground(new Color(82, 190, 230));
		
		JLabel lblNewLabel_12 = new JLabel("Recipe Id :");
		lblNewLabel_12.setForeground(UIManager.getColor("info"));
		lblNewLabel_12.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_12.setBounds(507, 71, 88, 19);
		add(lblNewLabel_12);
		
		textField_4 = new JTextField();
		textField_4.setBounds(604, 70, 105, 20);
		textField_4.setBackground(Color.DARK_GRAY);
		textField_4.setForeground(Color.WHITE);
		textField_4.setDisabledTextColor(Color.WHITE);
		add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("List Detail");
		btnNewButton_3.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		btnNewButton_3.setBounds(603, 95, 106, 32);
		btnNewButton_3.setBackground(Color.DARK_GRAY);
		btnNewButton_3.setForeground(Color.WHITE);
		add(btnNewButton_3);
		
		JLabel lblNewLabel_13 = new JLabel("Recipe :");
		lblNewLabel_13.setForeground(UIManager.getColor("info"));
		lblNewLabel_13.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_13.setBounds(507, 131, 67, 20);
		add(lblNewLabel_13);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(784, 162, 194, 223);
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setForeground(Color.WHITE);
		add(panel_1);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		btnRemove.setBounds(764, 396, 89, 23);
		btnRemove.setBackground(Color.DARK_GRAY);
		btnRemove.setForeground(Color.WHITE);
		add(btnRemove);
		
		JLabel lblTotalPrice = new JLabel("Total Price:");
		lblTotalPrice.setForeground(UIManager.getColor("info"));
		lblTotalPrice.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblTotalPrice.setBounds(764, 528, 89, 23);
		add(lblTotalPrice);
		
		JButton btnNewButton_4 = new JButton("Modify Recipe");
		btnNewButton_4.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		btnNewButton_4.setBounds(574, 522, 135, 32);
		btnNewButton_4.setBackground(Color.DARK_GRAY);
		btnNewButton_4.setForeground(Color.WHITE);
		add(btnNewButton_4);
		
		JLabel lblNewLabel_14 = new JLabel("Countable Item");
		lblNewLabel_14.setForeground(UIManager.getColor("info"));
		lblNewLabel_14.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_14.setBounds(764, 444, 98, 14);
		add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Uncontable Item");
		lblNewLabel_15.setForeground(UIManager.getColor("info"));
		lblNewLabel_15.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_15.setBounds(764, 469, 98, 14);
		add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Package Item");
		lblNewLabel_16.setForeground(UIManager.getColor("info"));
		lblNewLabel_16.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_16.setBounds(874, 416, 104, 14);
		add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("A&Q");
		lblNewLabel_17.setForeground(UIManager.getColor("info"));
		lblNewLabel_17.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_17.setBounds(992, 416, 46, 14);
		add(lblNewLabel_17);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(872, 441, 106, 20);
		comboBox_2.setBackground(Color.DARK_GRAY);
		comboBox_2.setForeground(Color.WHITE);
		add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(872, 469, 106, 20);
		comboBox_3.setBackground(Color.DARK_GRAY);
		comboBox_3.setForeground(Color.WHITE);
		add(comboBox_3);
		
		textField_7 = new JTextField();
		textField_7.setBounds(992, 441, 57, 20);
		textField_7.setBackground(Color.DARK_GRAY);
		textField_7.setForeground(Color.WHITE);
		textField_7.setDisabledTextColor(Color.WHITE);
		add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(992, 469, 57, 20);
		textField_8.setBackground(Color.DARK_GRAY);
		textField_8.setForeground(Color.WHITE);
		textField_8.setDisabledTextColor(Color.WHITE);
		add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("Add Item");
		btnNewButton_5.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		btnNewButton_5.setBounds(764, 494, 89, 23);
		btnNewButton_5.setBackground(Color.DARK_GRAY);
		btnNewButton_5.setForeground(Color.WHITE);
		add(btnNewButton_5);
		
		JLabel lblNewLabel_18 = new JLabel("Remove Recipe");
		lblNewLabel_18.setFont(new Font("Bauhaus 93", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_18.setBounds(594, 570, 194, 32);
		lblNewLabel_18.setForeground(new Color(82, 190, 230));
		add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Recipe Id :");
		lblNewLabel_19.setForeground(UIManager.getColor("info"));
		lblNewLabel_19.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_19.setBounds(594, 620, 88, 23);
		add(lblNewLabel_19);
		
		textField_9 = new JTextField();
		textField_9.setBounds(702, 621, 86, 22);
		textField_9.setBackground(Color.DARK_GRAY);
		textField_9.setForeground(Color.WHITE);
		textField_9.setDisabledTextColor(Color.WHITE);
		add(textField_9);
		textField_9.setColumns(10);
		
		JButton btnRemove_1 = new JButton("Remove");
		btnRemove_1.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		btnRemove_1.setBounds(702, 654, 89, 23);
		btnRemove_1.setBackground(Color.DARK_GRAY);
		btnRemove_1.setForeground(Color.WHITE);
		add(btnRemove_1);
		
		JLabel lblNewLabel_20 = new JLabel("Null");
		lblNewLabel_20.setForeground(UIManager.getColor("info"));
		lblNewLabel_20.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_20.setBounds(874, 532, 67, 14);
		add(lblNewLabel_20);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(27, 294, 237, 371);
		textArea.setCaretColor(Color.RED);
		textArea.setBackground(Color.DARK_GRAY);
		textArea.setForeground(Color.WHITE);
		add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(547, 155, 207, 334);
		textArea_1.setCaretColor(Color.RED);
		textArea_1.setBackground(Color.DARK_GRAY);
		add(textArea_1);

		
	}
}
