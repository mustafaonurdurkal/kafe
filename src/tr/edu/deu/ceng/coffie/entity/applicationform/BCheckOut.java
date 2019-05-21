package tr.edu.deu.ceng.coffie.entity.applicationform;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.JFrame;
import javax.swing.JSpinner;

public class BCheckOut extends JPanel {

	private Image backgroundImage;
	private JTable table;
	private JTable table2;
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
	private JFrame parent,frame;
	public BCheckOut(String string, JFrame parent, JFrame frame) throws IOException {
		this(string);
		this.parent =parent;
		this.frame = frame;
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
		
		String[] columnNames2 = { "Item number", "Item name","Cost"};
		Object[][] data2 = {
				{ "1","Item1", "7,50"},
				{ "2","Item2", "2,80"},
				{ "3","Item3", "7,20"}
		};
		
		table = new JTable(data, columnNames);
	    table.setPreferredScrollableViewportSize(new Dimension(200, 70));
	    table.setBackground(Color.DARK_GRAY);
		table.setForeground(Color.WHITE);
		table.setFillsViewportHeight(true);
		table.setOpaque(false);
	
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(915, 59, 355, 530);
		scrollPane.getViewport().setBackground(Color.DARK_GRAY);
		add(scrollPane);
		
		table2 = new JTable(data2, columnNames2);
	    table2.setPreferredScrollableViewportSize(new Dimension(200, 70));
	    table2.setBackground(Color.DARK_GRAY);
		table2.setForeground(Color.WHITE);
		table2.setFillsViewportHeight(true);
		table2.setOpaque(false);
	
		JScrollPane scrollPane2 = new JScrollPane(table2);
		scrollPane2.setBounds(364, 59, 355, 530);
		scrollPane2.getViewport().setBackground(Color.DARK_GRAY);
		add(scrollPane2);
		
		JLabel lblNewLabel = new JLabel("Order List");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(82, 190, 230));
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.ITALIC, 27));
		lblNewLabel.setBounds(1001, 10, 213, 38);
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
		lblNewLabel_2.setForeground(Color.WHITE);

		add(lblNewLabel_2);
		
		JLabel lblPayWithCard = new JLabel("Pay With Card");
		lblPayWithCard.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		lblPayWithCard.setBounds(23, 136, 122, 38);
		lblPayWithCard.setForeground(Color.WHITE);

		add(lblPayWithCard);
		
		JLabel lblNewLabel_3 = new JLabel("Card Id :");
		lblNewLabel_3.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_3.setBounds(23, 175, 74, 26);
		lblNewLabel_3.setForeground(Color.WHITE);

		add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(97, 178, 86, 20);
		textField.setBackground(Color.red);
		textField.setForeground(Color.WHITE);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("PAY");
		btnNewButton.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		btnNewButton.setFocusable(false);
		btnNewButton.setBounds(23, 239, 160, 31);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		add(btnNewButton);
		
		JLabel lblCost = new JLabel("Cost :");
		lblCost.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblCost.setBounds(23, 212, 62, 17);
		lblCost.setForeground(Color.WHITE);

		add(lblCost);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(95, 209, 88, 20);
		JSpinner.NumberEditor jsEditor = (JSpinner.NumberEditor) 
	    spinner.getEditor();
		jsEditor.getTextField().setBackground(Color.red);
		jsEditor.getTextField().setForeground(Color.WHITE);
		add(spinner);
		
		JButton btnNewButton_1 = new JButton("CheckOUT");
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		btnNewButton_1.setBounds(23, 296, 160, 38);
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setForeground(Color.WHITE);
		add(btnNewButton_1);
		
		JLabel lblMenu = new JLabel("Menu ");
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setFont(new Font("Bauhaus 93", Font.ITALIC, 25));
		lblMenu.setForeground(new Color(82, 190, 230));
		lblMenu.setBounds(468, 17, 122, 31);
		add(lblMenu);
		
		JButton btnRemoveOrder = new JButton("Remove Order");
		btnRemoveOrder.setFocusable(false);
		btnRemoveOrder.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		btnRemoveOrder.setBounds(751, 151, 133, 50);
		btnRemoveOrder.setBackground(Color.DARK_GRAY);
		btnRemoveOrder.setForeground(Color.WHITE);
		add(btnRemoveOrder);
		
		JButton btnAddOrder = new JButton("Add Order");
		btnAddOrder.setFocusable(false);
		btnAddOrder.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		btnAddOrder.setBounds(751, 99, 133, 41);
		btnAddOrder.setBackground(Color.DARK_GRAY);
		btnAddOrder.setForeground(Color.WHITE);
		add(btnAddOrder);
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(Color.RED);
		btnBack.setBackground(Color.DARK_GRAY);
		btnBack.setFocusable(false);
		btnBack.setFont(new Font("Bauhaus 93", Font.ITALIC, 24));
		btnBack.setBounds(1074, 634, 160, 38);
		add(btnBack);
		
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				parent.setVisible(true);
					
			}
		});
		
	}
}
