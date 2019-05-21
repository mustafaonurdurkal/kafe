package tr.edu.deu.ceng.coffie.entity.applicationform.menuitems;

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

import tr.edu.deu.ceng.coffie.entity.applicationform.DEFTERLER;
import tr.edu.deu.ceng.coffie.entity.applicationform.recipe.Recipe;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class BFoodAndDrink extends JPanel {

	private Image backgroundImage;
	private JTable table;
	private JTable table2;
	private JTable table3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

	/**
	 * Create the panel.
	 */
	public BFoodAndDrink(String fileName) throws IOException {
		backgroundImage = ImageIO.read(new File(fileName));
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(backgroundImage, 0, 0, (int) getSize().getWidth() - 0, (int) getSize().getHeight() - 0, this);

	}
	public BFoodAndDrink() {
        kapkankagan();
	}
	private JFrame parent,frame;
	public BFoodAndDrink(String string, JFrame parent, JFrame frame) throws IOException {
		this(string);
		this.parent = parent;
		this.frame = frame;
	}

	public void kapkankagan() {
		String[] columnNames = {  "Item Number", "Item Name","Price","ITEM 1","ITEM 2","ITEM 3","ITEM 4"};
		String[] columnNames2 = { "Item Number", "Item Name","Price"};
		String[] columnNames3 = {"Item number","Item Name","Price"};
		Object[][] combined = {
				{ new Integer(1), "Ekonomik Menu","4,90 TL","Maxi Sandwich","Ice Tea","K�zartma Taba��",""},
				{ new Integer(2), "Hamburger","3,50TL","DoubleCheeseBurger","Patetes K�zartmas�","Kola","Kazandibi"},
				{ new Integer(3), "Patso Menu","2.50TL","Patso Sandwich","Kola","Kazandibi",""},
				{ new Integer(4), "Nargile Menu","7TL","Nargile","B.�ay","Patates K�zartmas�",""},
				{ new Integer(5), "Nargile Menu2","8TL","Nargile","Kola","K�zartma Taba��",""}
				
		};
		Object[][] combined2 = {
				{ new Integer(1), "Patates","4,90 TL"},
				{ new Integer(2), "Kola","4,20 TL"},
				{ new Integer(3), "Menemen","6,90 TL"}
		
		};
		Object[][] combined3 = {
				{ new Integer(1), "Ekonomik Menu","4,90 TL"},
				{ new Integer(2), "��renci Menu","4,20 TL"},
		};
		
		this.setBounds(0, 0, 1280, 720);
		setAlignmentX(Component.LEFT_ALIGNMENT);
		setBackground(Color.WHITE);
		setLayout(null);
		table = new JTable(combined, columnNames);
	    table.setPreferredScrollableViewportSize(new Dimension(200, 70));
	    table.setBackground(Color.DARK_GRAY);
		table.setForeground(Color.WHITE);
		table.setFillsViewportHeight(true);
		table.setOpaque(false);
		
		table2 = new JTable(combined2, columnNames2);
	    table2.setPreferredScrollableViewportSize(new Dimension(200, 70));
	    table2.setBackground(Color.DARK_GRAY);
		table2.setForeground(Color.WHITE);
		table2.setFillsViewportHeight(true);
		table2.setOpaque(false);
		
		table3 = new JTable(combined3, columnNames3);
	    table3.setPreferredScrollableViewportSize(new Dimension(200, 70));
	    table3.setBackground(Color.DARK_GRAY);
		table3.setForeground(Color.WHITE);
		table3.setFillsViewportHeight(true);
		table3.setOpaque(false);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(709, 45, 561, 602);
		scrollPane.getViewport().setBackground(Color.DARK_GRAY);
		add(scrollPane);
		
		JScrollPane scrollPane2 = new JScrollPane(table2);
		scrollPane2.setBounds(455, 45, 244, 265);
		scrollPane2.getViewport().setBackground(Color.DARK_GRAY);
		add(scrollPane2);
		
		JScrollPane scrollPane3 = new JScrollPane(table3);
		scrollPane3.setBounds(455, 379, 244, 265);
		scrollPane3.getViewport().setBackground(Color.DARK_GRAY);
		add(scrollPane3);
		
		JLabel lblNewLabel = new JLabel("Combined Menu Items");
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(82, 190, 230));
		lblNewLabel.setBounds(802, 7, 281, 31);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Single Menu Items");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(82, 190, 230));
		lblNewLabel_1.setFont(new Font("Bauhaus 93", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1.setBounds(432, 11, 267, 23);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Promoted Menu Items");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(82, 190, 230));
		lblNewLabel_2.setFont(new Font("Bauhaus 93", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_2.setBounds(455, 331, 244, 37);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Single Item");
		lblNewLabel_3.setFont(new Font("Bauhaus 93", Font.BOLD, 15));
		lblNewLabel_3.setBounds(0, 11, 141, 23);
		lblNewLabel_3.setForeground(new Color(82, 190, 230));
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Item ID :");
		lblNewLabel_4.setForeground(Color.ORANGE);
		lblNewLabel_4.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_4.setBounds(0, 45, 73, 14);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Price :");
		lblNewLabel_5.setForeground(Color.ORANGE);
		lblNewLabel_5.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_5.setBounds(0, 71, 73, 14);
		add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(83, 45, 86, 20);
		textField.setBackground(Color.DARK_GRAY);
		textField.setForeground(Color.WHITE);
		textField.setDisabledTextColor(Color.WHITE);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(83, 68, 86, 20);
		textField_1.setBackground(Color.DARK_GRAY);
		textField_1.setForeground(Color.WHITE);
		textField_1.setDisabledTextColor(Color.WHITE);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Create");
		btnNewButton.setFocusable(false);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setFont(new Font("Bauhaus 93", Font.BOLD, 15));
		btnNewButton.setBounds(100, 153, 89, 22);
		add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("Complex Item");
		lblNewLabel_6.setFont(new Font("Bauhaus 93", Font.BOLD, 15));
		lblNewLabel_6.setBounds(0, 186, 169, 23);
		lblNewLabel_6.setForeground(new Color(82, 190, 230));
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Item ID :");
		lblNewLabel_7.setForeground(Color.ORANGE);
		lblNewLabel_7.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_7.setBounds(0, 220, 73, 14);
		add(lblNewLabel_7);
		
		textField_2 = new JTextField();
		textField_2.setBounds(93, 217, 86, 20);
		textField_2.setBackground(Color.DARK_GRAY);
		textField_2.setForeground(Color.WHITE);
		textField_2.setDisabledTextColor(Color.WHITE);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Price :");
		lblNewLabel_8.setForeground(Color.ORANGE);
		lblNewLabel_8.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_8.setBounds(0, 245, 73, 14);
		add(lblNewLabel_8);
		
		textField_3 = new JTextField();
		textField_3.setBounds(93, 242, 86, 20);
		textField_3.setBackground(Color.DARK_GRAY);
		textField_3.setForeground(Color.WHITE);
		textField_3.setDisabledTextColor(Color.WHITE);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Container1:");
		lblNewLabel_9.setForeground(Color.ORANGE);
		lblNewLabel_9.setFont(new Font("Bauhaus 93", Font.ITALIC, 12));
		lblNewLabel_9.setBounds(0, 296, 73, 14);
		add(lblNewLabel_9);
		
		textField_4 = new JTextField();
		textField_4.setBounds(93, 293, 86, 20);
		textField_4.setBackground(Color.DARK_GRAY);
		textField_4.setForeground(Color.WHITE);
		textField_4.setDisabledTextColor(Color.WHITE);
		add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Container2:");
		lblNewLabel_10.setForeground(Color.ORANGE);
		lblNewLabel_10.setFont(new Font("Bauhaus 93", Font.ITALIC, 12));
		lblNewLabel_10.setBounds(0, 321, 73, 14);
		add(lblNewLabel_10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(93, 318, 86, 20);
		textField_5.setBackground(Color.DARK_GRAY);
		textField_5.setForeground(Color.WHITE);
		textField_5.setDisabledTextColor(Color.WHITE);
		add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Container3:");
		lblNewLabel_11.setForeground(Color.ORANGE);
		lblNewLabel_11.setFont(new Font("Bauhaus 93", Font.ITALIC, 12));
		lblNewLabel_11.setBounds(0, 346, 73, 14);
		add(lblNewLabel_11);
		
		textField_6 = new JTextField();
		textField_6.setBounds(93, 343, 86, 20);
		textField_6.setBackground(Color.DARK_GRAY);
		textField_6.setForeground(Color.WHITE);
		textField_6.setDisabledTextColor(Color.WHITE);
		add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Container4:");
		lblNewLabel_12.setForeground(Color.ORANGE);
		lblNewLabel_12.setFont(new Font("Bauhaus 93", Font.ITALIC, 12));
		lblNewLabel_12.setBounds(0, 371, 73, 14);
		add(lblNewLabel_12);
		
		textField_7 = new JTextField();
		textField_7.setBounds(93, 368, 86, 20);
		textField_7.setBackground(Color.DARK_GRAY);
		textField_7.setForeground(Color.WHITE);
		textField_7.setDisabledTextColor(Color.WHITE);
		add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Create");
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Bauhaus 93", Font.BOLD, 15));
		btnNewButton_1.setBounds(93, 424, 96, 23);
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setForeground(Color.WHITE);
		add(btnNewButton_1);
		
		JLabel lblNewLabel_13 = new JLabel("Promoted Item");
		lblNewLabel_13.setFont(new Font("Bauhaus 93", Font.BOLD, 15));
		lblNewLabel_13.setBounds(224, 184, 169, 14);
		lblNewLabel_13.setForeground(new Color(82, 190, 230));
		add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Item ID :");
		lblNewLabel_14.setForeground(Color.ORANGE);
		lblNewLabel_14.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_14.setBounds(224, 210, 73, 14);
		add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Price :");
		lblNewLabel_15.setForeground(Color.ORANGE);
		lblNewLabel_15.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_15.setBounds(224, 260, 73, 14);
		add(lblNewLabel_15);
		
		textField_8 = new JTextField();
		textField_8.setBounds(307, 207, 86, 20);
		textField_8.setBackground(Color.DARK_GRAY);
		textField_8.setForeground(Color.WHITE);
		textField_8.setDisabledTextColor(Color.WHITE);
		add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(307, 257, 86, 20);
		textField_9.setBackground(Color.DARK_GRAY);
		textField_9.setForeground(Color.WHITE);
		textField_9.setDisabledTextColor(Color.WHITE);
		add(textField_9);
		textField_9.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Create");
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setFont(new Font("Bauhaus 93", Font.BOLD, 15));
		btnNewButton_2.setBounds(323, 287, 89, 23);
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.setForeground(Color.WHITE);
		add(btnNewButton_2);
		
		JLabel lblNewLabel_16 = new JLabel("Remove Item");
		lblNewLabel_16.setFont(new Font("Bauhaus 93", Font.BOLD, 15));
		lblNewLabel_16.setBounds(224, 15, 141, 23);
		lblNewLabel_16.setForeground(new Color(82, 190, 230));
		add(lblNewLabel_16);
		
		JButton btnNewButton_3 =new JButton("Modify");
		btnNewButton_3.setFocusable(false);
		btnNewButton_3.setFont(new Font("Bauhaus 93", Font.BOLD, 15));
		btnNewButton_3.setBounds(0, 153, 95, 22);
		btnNewButton_3.setBackground(Color.DARK_GRAY);
		btnNewButton_3.setForeground(Color.WHITE);
		add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Modify");
		btnNewButton_4.setFocusable(false);
		btnNewButton_4.setFont(new Font("Bauhaus 93", Font.BOLD, 15));
		btnNewButton_4.setBounds(0, 424, 89, 23);
		btnNewButton_4.setBackground(Color.DARK_GRAY);
		btnNewButton_4.setForeground(Color.WHITE);
		add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Modify");
		btnNewButton_5.setFocusable(false);
		btnNewButton_5.setFont(new Font("Bauhaus 93", Font.BOLD, 15));
		btnNewButton_5.setBounds(224, 287, 89, 23);
		btnNewButton_5.setBackground(Color.DARK_GRAY);
		btnNewButton_5.setForeground(Color.WHITE);
		add(btnNewButton_5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("SingleItem");
		rdbtnNewRadioButton.setFocusable(false);
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		rdbtnNewRadioButton.setBounds(224, 42, 89, 23);
		rdbtnNewRadioButton.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton.setForeground(Color.WHITE);
		add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("ComplexItem");
		rdbtnNewRadioButton_1.setFocusable(false);
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		rdbtnNewRadioButton_1.setBounds(315, 42, 103, 23);
		rdbtnNewRadioButton_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_1.setForeground(Color.WHITE);
		add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Promoted Item");
		rdbtnNewRadioButton_2.setFocusable(false);
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		rdbtnNewRadioButton_2.setBounds(224, 67, 169, 23);
		rdbtnNewRadioButton_2.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_2.setForeground(Color.WHITE);
		add(rdbtnNewRadioButton_2);
		
		JButton btnNewButton_6 = new JButton("Remove");
		btnNewButton_6.setFocusable(false);
		btnNewButton_6.setFont(new Font("Bauhaus 93", Font.BOLD, 15));
		btnNewButton_6.setBounds(322, 140, 96, 23);
		btnNewButton_6.setBackground(Color.DARK_GRAY);
		btnNewButton_6.setForeground(Color.WHITE);
		add(btnNewButton_6);
		
		JLabel lblNewLabel_17 = new JLabel("Item ID :");
		lblNewLabel_17.setForeground(Color.ORANGE);
		lblNewLabel_17.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_17.setBounds(234, 98, 63, 23);
		add(lblNewLabel_17);
		
		textField_10 = new JTextField();
		textField_10.setBounds(307, 99, 86, 20);
		textField_10.setBackground(Color.DARK_GRAY);
		textField_10.setForeground(Color.WHITE);
		textField_10.setDisabledTextColor(Color.WHITE);
		add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblItemName = new JLabel("Item Name:");
		lblItemName.setForeground(Color.ORANGE);
		lblItemName.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblItemName.setBounds(224, 235, 73, 14);
		add(lblItemName);
		
		textField_11 = new JTextField();
		textField_11.setBounds(307, 232, 86, 20);
		textField_11.setBackground(Color.DARK_GRAY);
		textField_11.setForeground(Color.WHITE);
		textField_11.setDisabledTextColor(Color.WHITE);
		add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblItemName_1 = new JLabel("Item Name");
		lblItemName_1.setForeground(Color.ORANGE);
		lblItemName_1.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblItemName_1.setBounds(0, 270, 73, 14);
		add(lblItemName_1);
		
		textField_12 = new JTextField();
		textField_12.setBounds(93, 267, 86, 20);
		textField_12.setBackground(Color.DARK_GRAY);
		textField_12.setForeground(Color.WHITE);
		textField_12.setDisabledTextColor(Color.WHITE);
		add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblItemName_2 = new JLabel("Item Name");
		lblItemName_2.setForeground(Color.ORANGE);
		lblItemName_2.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblItemName_2.setBounds(0, 96, 73, 14);
		add(lblItemName_2);
		
		textField_13 = new JTextField();
		textField_13.setBounds(83, 93, 86, 20);
		textField_13.setBackground(Color.DARK_GRAY);
		textField_13.setForeground(Color.WHITE);
		textField_13.setDisabledTextColor(Color.WHITE);
		add(textField_13);
		textField_13.setColumns(10);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFocusable(false);
		btnBack.setForeground(Color.RED);
		btnBack.setBackground(Color.DARK_GRAY);
		btnBack.setFont(new Font("Bauhaus 93", Font.ITALIC, 24));
		btnBack.setBounds(853, 657, 160, 38);
		add(btnBack);
		
		JLabel lblRecipe = new JLabel("Recipe");
		lblRecipe.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblRecipe.setForeground(Color.ORANGE);
		lblRecipe.setBounds(0, 121, 63, 14);
		add(lblRecipe);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.DARK_GRAY);
		comboBox.setForeground(Color.WHITE);
		comboBox.setBounds(83, 118, 86, 20);
		add(comboBox);
		
		JButton btnNewButton_7 = new JButton("Recipes");
		btnNewButton_7.setFocusable(false);
		btnNewButton_7.setBackground(Color.DARK_GRAY);
		btnNewButton_7.setForeground(Color.WHITE);
		btnNewButton_7.setFont(new Font("Bauhaus 93", Font.ITALIC, 20));
		btnNewButton_7.setBounds(0, 496, 189, 56);
		add(btnNewButton_7);
		
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Recipe rc = new Recipe(frame);
				parent.setVisible(false);

			}
		});
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				parent.setVisible(true);
					
			}
		});
	}
}
