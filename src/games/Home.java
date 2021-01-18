package games;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.awt.GraphicsEnvironment;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class Home extends JFrame {

	private JPanel contentPane;
	Font AladinFont;
	
	/**
	 * Create the frame.
	 */
	public Home() {
		
		try{
			AladinFont = Font.createFont(Font.TRUETYPE_FONT, new File("Aladin-Regular.ttf")).deriveFont(30f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Aladin-Regular.ttf")));
		}catch(IOException | FontFormatException e) {
			
		}
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane panel = new JLayeredPane();
		panel.setBounds(0, 0, 700, 500);
		contentPane.add(panel);
		panel.setLayout(null);
		setResizable(false);
		
		JButton btnNewButton = new JButton("Play");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBackground(new Color(224, 90, 71));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PlayerFrame frame = new PlayerFrame();
				frame.setVisible(false);
				dispose();
				PlayerFrame pFrame = new PlayerFrame();
				pFrame.setVisible(true);
			}
		});
		btnNewButton.setBounds(90, 264, 100, 40);
		panel.add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnExit.setBackground(new Color(224, 90, 71));
		btnExit.setBounds(205, 264, 100, 40);
		panel.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Home.class.getResource("/games/rsz_1610982594417.png")));
		lblNewLabel_1.setBounds(325, 125, 250, 250);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("<html>Welcome To <br/>TicTacToe Games </html>");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setToolTipText("");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(90, 175, 228, 91);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Created By BME MEMBARA TEAM\r\n");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(90, 311, 224, 38);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Home.class.getResource("/games/rsz_1610982588607.png")));
		lblNewLabel.setBounds(0, 0, 700, 500);
		contentPane.add(lblNewLabel);
	}
}


