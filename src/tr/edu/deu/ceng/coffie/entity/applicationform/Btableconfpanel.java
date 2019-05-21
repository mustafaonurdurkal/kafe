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
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.JTableHeader;

import java.awt.GridLayout;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Btableconfpanel extends JPanel {

	private Image backgroundImage;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_4;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Create the panel.
	 */
	public Btableconfpanel(String fileName) throws IOException {
		backgroundImage = ImageIO.read(new File(fileName));
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(backgroundImage, 0, 0, (int) getSize().getWidth() - 0, (int) getSize().getHeight() - 0, this);

	}

	public Btableconfpanel() {
		hasansas();
	}

	public void hasansas() {

		String[] columnNames = { "Table Id", "Table Name", "Location"};
		Object[][] data = {
				{ new Integer(1), "A1", "Inner"},
				{ new Integer(2), "A2", "Inner"},
				{ new Integer(3), "C1", "Outer"}
				
				
		};
		this.setBounds(0, 0, 1280, 720);
		setAlignmentX(Component.LEFT_ALIGNMENT);
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Table List");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(82, 190, 230));
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.ITALIC, 27));
		lblNewLabel.setBounds(853, 24, 213, 38);
		add(lblNewLabel);

		table = new JTable(data, columnNames);
	    table.setPreferredScrollableViewportSize(new Dimension(200, 70));
	    table.setBackground(Color.DARK_GRAY);
		table.setForeground(Color.WHITE);
		table.setFillsViewportHeight(true);
		table.setOpaque(false);
	
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(751, 73, 421, 531);
		scrollPane.getViewport().setBackground(Color.DARK_GRAY);
		add(scrollPane);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setFocusable(false);
		btnNewButton.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(351, 163, 89, 38);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Edit");
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBounds(351, 352, 89, 38);
		add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("New Table");
		lblNewLabel_1.setFont(new Font("Bauhaus 93", Font.BOLD, 13));
		lblNewLabel_1.setBounds(52, 53, 133, 20);
		lblNewLabel_1.setForeground(new Color(82, 190, 230));
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(150, 93, 119, 20);
		textField.setBackground(Color.DARK_GRAY);
		textField.setForeground(Color.WHITE);
		textField.setDisabledTextColor(Color.WHITE);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Table Name :");
		lblNewLabel_2.setForeground(Color.ORANGE);
		lblNewLabel_2.setFont(new Font("Bauhaus 93", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(52, 93, 88, 21);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Edit Table");
		lblNewLabel_3.setFont(new Font("Bauhaus 93", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(52, 204, 106, 26);
		lblNewLabel_3.setForeground(new Color(82, 190, 230));
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Old Name :");
		lblNewLabel_4.setForeground(Color.ORANGE);
		lblNewLabel_4.setFont(new Font("Bauhaus 93", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(52, 241, 75, 20);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New Name :");
		lblNewLabel_5.setForeground(Color.ORANGE);
		lblNewLabel_5.setFont(new Font("Bauhaus 93", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(52, 279, 75, 25);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("New Location");
		lblNewLabel_7.setForeground(Color.ORANGE);
		lblNewLabel_7.setFont(new Font("Bauhaus 93", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(52, 315, 88, 26);
		add(lblNewLabel_7);
		
		textField_1 = new JTextField();
		textField_1.setBounds(147, 241, 86, 20);
		textField_1.setBackground(Color.DARK_GRAY);
		textField_1.setForeground(Color.WHITE);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(147, 281, 86, 20);
		textField_4.setBackground(Color.DARK_GRAY);
		textField_4.setForeground(Color.WHITE);
		add(textField_4);
		textField_4.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Inner");
		rdbtnNewRadioButton.setFocusable(false);
		buttonGroup_1.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Bauhaus 93", Font.PLAIN, 13));
		rdbtnNewRadioButton.setBounds(148, 317, 86, 23);
		rdbtnNewRadioButton.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton.setForeground(Color.WHITE);
		add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Outer");
		rdbtnNewRadioButton_1.setFocusable(false);
		buttonGroup_1.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 13));
		rdbtnNewRadioButton_1.setBounds(236, 317, 109, 23);
		rdbtnNewRadioButton_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_1.setForeground(Color.WHITE);
		add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_6 = new JLabel("Location");
		lblNewLabel_6.setForeground(Color.ORANGE);
		lblNewLabel_6.setFont(new Font("Bauhaus 93", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(52, 135, 64, 19);
		add(lblNewLabel_6);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Inner");
		rdbtnNewRadioButton_2.setFocusable(false);
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setFont(new Font("Bauhaus 93", Font.PLAIN, 13));
		rdbtnNewRadioButton_2.setBounds(150, 133, 109, 23);
		rdbtnNewRadioButton_2.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_2.setForeground(Color.WHITE);
		add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Outer");
		rdbtnNewRadioButton_3.setFocusable(false);
		buttonGroup.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setFont(new Font("Bauhaus 93", Font.PLAIN, 13));
		rdbtnNewRadioButton_3.setBounds(279, 133, 109, 23);
		rdbtnNewRadioButton_3.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_3.setForeground(Color.WHITE);
		add(rdbtnNewRadioButton_3);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFocusable(false);
		btnBack.setForeground(Color.RED);
		btnBack.setBackground(Color.DARK_GRAY);
		btnBack.setFont(new Font("Bauhaus 93", Font.ITALIC, 24));
		btnBack.setBounds(853, 657, 160, 38);
		add(btnBack);
	}
}
