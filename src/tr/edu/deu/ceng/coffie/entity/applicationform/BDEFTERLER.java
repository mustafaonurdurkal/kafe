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
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class BDEFTERLER extends JPanel {

	private Image backgroundImage;
	private JTable table;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField textField_1;
	/**
	 * Create the panel.
	 */
	public BDEFTERLER(String fileName) throws IOException {
		backgroundImage = ImageIO.read(new File(fileName));
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(backgroundImage, 0, 0, (int) getSize().getWidth() - 0, (int) getSize().getHeight() - 0, this);

	}
	public BDEFTERLER() {
       helaldogukan();
	}
	public void helaldogukan() {
		this.setBounds(0, 0, 1280, 720);
		setAlignmentX(Component.LEFT_ALIGNMENT);
		setBackground(Color.WHITE);
		setLayout(null);
		
		String[] columnNames = { "Menu Number", "Menu Name","Type"};
		Object[][] data = {
				{ new Integer(1), "YILBAÞI", "FooD"},
				{ new Integer(2), "DONDURMALAR", "Food"},
				{ new Integer(3), "Sýcak Ýçecekler", "Drink"},
				{ new Integer(4), "Soðuk Ýçecekler", "Drink"},
				{ new Integer(5), "Alkollu Ýçecekler", "Drink"},
				{ new Integer(6), "Combo Menuler", "Food"}

				
		};
		
		JLabel lblNewLabel = new JLabel("Menu List");
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(837, 79, 173, 37);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(82, 190, 230));
		add(lblNewLabel);
		
		table = new JTable(data, columnNames);
	    table.setPreferredScrollableViewportSize(new Dimension(200, 70));
	    table.setBackground(Color.DARK_GRAY);
		table.setForeground(Color.WHITE);
		table.setFillsViewportHeight(true);
		table.setOpaque(false);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(700, 115, 421, 531);
		scrollPane.getViewport().setBackground(Color.DARK_GRAY);
		add(scrollPane);
		
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setFont(new Font("Bauhaus 93", Font.BOLD, 13));
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(399, 184, 97, 29);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MODIFY");
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Bauhaus 93", Font.BOLD, 13));
		btnNewButton_1.setBounds(399, 370, 97, 29);
		add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("ADD MENU");
		lblNewLabel_1.setFont(new Font("Bauhaus 93", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1.setBounds(78, 83, 166, 29);
		lblNewLabel_1.setForeground(new Color(82, 190, 230));
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NAME:");
		lblNewLabel_2.setFont(new Font("Bauhaus 93", Font.BOLD, 13));
		lblNewLabel_2.setBounds(63, 140, 61, 17);
		add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(179, 138, 86, 20);
		textField.setBackground(Color.DARK_GRAY);
		textField.setForeground(Color.WHITE);
		textField.setDisabledTextColor(Color.WHITE);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("TYPE:");
		lblNewLabel_3.setFont(new Font("Bauhaus 93", Font.BOLD, 13));
		lblNewLabel_3.setBounds(63, 170, 61, 14);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("MODIFY MENU");
		lblNewLabel_4.setFont(new Font("Bauhaus 93", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_4.setBounds(78, 243, 177, 29);
		lblNewLabel_4.setForeground(new Color(82, 190, 230));
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("MENU NUMBER:");
		lblNewLabel_5.setFont(new Font("Bauhaus 93", Font.BOLD, 13));
		lblNewLabel_5.setBounds(63, 283, 106, 29);
		add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(179, 287, 86, 20);
		textField_2.setBackground(Color.DARK_GRAY);
		textField_2.setForeground(Color.WHITE);
		textField_2.setDisabledTextColor(Color.WHITE);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("RENAME:");
		lblNewLabel_6.setFont(new Font("Bauhaus 93", Font.BOLD, 13));
		lblNewLabel_6.setBounds(61, 323, 97, 20);
		add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setBounds(179, 318, 86, 20);
		textField_3.setBackground(Color.DARK_GRAY);
		textField_3.setForeground(Color.WHITE);
		textField_3.setDisabledTextColor(Color.WHITE);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("TYPE:");
		lblNewLabel_7.setFont(new Font("Bauhaus 93", Font.BOLD, 13));
		lblNewLabel_7.setBounds(63, 354, 46, 14);
		add(lblNewLabel_7);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("FOOD");
		rdbtnNewRadioButton.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(179, 165, 65, 23);
		rdbtnNewRadioButton.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton.setForeground(Color.WHITE);
		add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("DRINK");
		rdbtnNewRadioButton_1.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(262, 165, 77, 23);
		rdbtnNewRadioButton_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_1.setForeground(Color.WHITE);
		add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("FOOD");
		buttonGroup_1.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		rdbtnNewRadioButton_2.setBounds(174, 350, 70, 23);
		rdbtnNewRadioButton_2.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_2.setForeground(Color.WHITE);
		add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("DRINK");
		buttonGroup_1.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		rdbtnNewRadioButton_3.setBounds(262, 350, 77, 23);
		rdbtnNewRadioButton_3.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_3.setForeground(Color.WHITE);
		add(rdbtnNewRadioButton_3);
		
		JLabel lblNewLabel_8 = new JLabel("LIST AND MODIFY MENU ITEMS");
		lblNewLabel_8.setFont(new Font("Bauhaus 93", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_8.setBounds(78, 432, 382, 29);
		lblNewLabel_8.setForeground(new Color(82, 190, 230));
		add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("MENU NUMBER:");
		lblNewLabel_9.setFont(new Font("Bauhaus 93", Font.BOLD, 13));
		lblNewLabel_9.setBounds(63, 491, 106, 29);
		add(lblNewLabel_9);
		
		textField_1 = new JTextField();
		textField_1.setBounds(179, 495, 86, 20);
		textField_1.setBackground(Color.DARK_GRAY);
		textField_1.setForeground(Color.WHITE);
		textField_1.setDisabledTextColor(Color.WHITE);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("L&M");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setFont(new Font("Bauhaus 93", Font.BOLD, 15));
		btnNewButton_2.setBounds(399, 533, 111, 29);
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.setForeground(Color.WHITE);
		add(btnNewButton_2);
	}
}
