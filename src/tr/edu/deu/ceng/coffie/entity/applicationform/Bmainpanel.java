package tr.edu.deu.ceng.coffie.entity.applicationform;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Bmainpanel extends JPanel {
	
	private Image backgroundImage;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	public Bmainpanel(String fileName) throws IOException {
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
	public Bmainpanel() {
		
       lazziya();
	}
	public void lazziya() {
		setLayout(null);
		this.setBounds(0, 0, 1280, 720);
		setBackground(Color.WHITE);
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(150,150,150,100));
		panel_1.setBounds(77, 11, 1089, 57);
		add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("CHECK");
		btnNewButton.setFocusable(false);
		btnNewButton.setBorder(null);
		btnNewButton.setForeground(new Color(82, 190, 230));
		btnNewButton.setBackground(new Color(0,0,0));
		btnNewButton.setFont(new Font("Bauhaus 93", Font.PLAIN, 35));
		btnNewButton.setBounds(29, 0, 154, 57);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CARDS");
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setForeground(new Color(82, 190, 230));
		btnNewButton_1.setBackground(new Color(0,0,0));
		btnNewButton_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 35));
		btnNewButton_1.setBounds(232, 0, 165, 57);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("SHOW");
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setForeground(new Color(82, 190, 230));
		btnNewButton_2.setBackground(new Color(0,0,0));
		btnNewButton_2.setFont(new Font("Bauhaus 93", Font.PLAIN, 35));
		btnNewButton_2.setBounds(437, 0, 165, 57);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("ORDER");
		btnNewButton_3.setBorder(null);
		btnNewButton_3.setFocusable(false);
		btnNewButton_3.setForeground(new Color(82, 190, 230));
		btnNewButton_3.setBackground(new Color(0,0,0));
		btnNewButton_3.setFont(new Font("Bauhaus 93", Font.PLAIN, 35));
		btnNewButton_3.setBounds(645, 0, 171, 57);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Table Configuration");
		btnNewButton_4.setBorder(null);
		btnNewButton_4.setFocusable(false);
		btnNewButton_4.setForeground(new Color(82, 190, 230));
		btnNewButton_4.setBackground(new Color(0,0,0));
		btnNewButton_4.setFont(new Font("Bauhaus 93", Font.PLAIN, 20));
		btnNewButton_4.setBounds(866, 0, 192, 57);
		panel_1.add(btnNewButton_4);
		
		panel_2 = new JPanel();
		GridLayout grid1 = new GridLayout(0,3);
		panel_2.setLayout(grid1);
		panel_2.setOpaque(false);
		panel_2.setBounds(77, 123, 455, 544);
		JScrollPane scrollPane1 = new JScrollPane(panel_2);
		scrollPane1.setBounds(77, 123, 455, 544);
		scrollPane1.getViewport().setBackground(new Color(0,0,0,0));
		scrollPane1.setOpaque(false);
		
		
		
		panel_3 = new JPanel();
		GridLayout grid2 = new GridLayout(0,3);
		panel_3.setLayout(grid2);
		panel_3.setOpaque(false);
		panel_3.setBounds(745, 123, 421, 531);
		panel_3.setBackground(new Color(0,0,0,0));
		JScrollPane scrollPane2 = new JScrollPane(panel_3);
		scrollPane2.setBounds(745, 123, 421, 531);
		scrollPane2.getViewport().setBackground(new Color(0,0,0,0));
		scrollPane2.setOpaque(false);
		scrollPane2.getViewport().addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				scrollPane2.invalidate();
				panel_3.invalidate();
			}
		});
		for (int i = 0; i <99; i++) {
			addTable(panel_2,i);
			addTable(panel_3,i);
		}
		add(scrollPane2);
		add(scrollPane1);
		
		
	}
	public void addTable(JComponent panel,int number) {
		ImageIcon table = new ImageIcon("resources/table.png");

		JPanel tablepanel=new JPanel();
		tablepanel.setBackground(new Color(0,0,0,0));
		
		JButton tablebutton=new JButton();
		    tablebutton.setIcon(table);
			tablebutton.setBorder(null);
			tablebutton.setFocusable(false);
			tablebutton.setBackground(new Color(82, 190, 230));
			tablebutton.setContentAreaFilled(false);
			tablebutton.setOpaque(true);
			
		JLabel tablelabel = new JLabel(number<10 ? "Table 0"+number:"Table "+number);
			tablelabel.setForeground(Color.WHITE);
			tablelabel.setHorizontalAlignment(SwingConstants.CENTER);
			tablelabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
			tablelabel.setBounds(45, 95, 59, 20);
		
		tablepanel.add(tablebutton);
		tablepanel.add(tablelabel);
		panel.add(tablepanel);
	}
}
