package tr.edu.deu.ceng.coffie.entity.applicationform;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;

import java.awt.Component;
import net.miginfocom.swing.MigLayout;
import java.awt.Canvas;
import javax.swing.JTextField;

public class Bpanel extends JPanel {
	 private Image backgroundImage;
	 private JPanel panel;
	 private JTextField textField;
	 private JTextField textField_1;

	  // Some code to initialize the background image.
	  // Here, we use the constructor to load the image. This
	  // can vary depending on the use case of the panel.
	  public Bpanel(String fileName) throws IOException {
	    backgroundImage = ImageIO.read(new File(fileName));
	  }
       @Override
	  public void paintComponent(Graphics g) {
	    super.paintComponent(g);
       g.drawImage(backgroundImage, 0, 0, (int) getSize().getWidth() - 0, (int) getSize().getHeight() - 0, this);

	  }

	/**
	 * Create the panel.
	 */
	public Bpanel() {
       mertcumali();
	}
	public void mertcumali() {
		this.setBounds(0, 0, 1280, 720);
		
		setAlignmentX(Component.LEFT_ALIGNMENT);
		setBackground(Color.WHITE);
		setLayout(new GridLayout(2, 1, 0, 0));
		panel = new JPanel();
		panel.setOpaque(false);
		add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setOpaque(false);
		JLabel lblStackbucks = new JLabel("STACKBUCKS");
		lblStackbucks.setVerticalAlignment(SwingConstants.BOTTOM);
		lblStackbucks.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblStackbucks.setForeground(Color.BLACK);
		lblStackbucks.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblStackbucks.setFont(new Font("Bauhaus 93", Font.BOLD, 90));
		panel.add(lblStackbucks);
		
		JPanel panel_2 = new JPanel();
		add(panel_2);
		panel_2.setOpaque(false);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setOpaque(false);
		panel_2.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.BLACK);
		panel_4.setBackground(new Color(0,0,0,64));
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		ImageIcon imageIcon = new ImageIcon("resources/user.png");

		JLabel label = new JLabel(imageIcon);
		label.setBounds(0, 0, 640, 180);
		panel_4.add(label);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField.setForeground(Color.WHITE);
		textField.setDisabledTextColor(Color.WHITE);
		textField.setBorder(null);
		textField.setCaretColor(Color.BLACK);
		textField.setBackground(Color.DARK_GRAY);
		textField.setBounds(203, 189, 259, 26);
		panel_4.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_1.setDisabledTextColor(Color.WHITE);
		textField_1.setBackground(Color.DARK_GRAY);
		textField_1.setBorder(null);
		textField_1.setBounds(203, 233, 259, 26);
		panel_4.add(textField_1);
		textField_1.setColumns(10);
		
	}
}
