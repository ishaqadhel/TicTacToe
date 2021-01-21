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
import java.awt.Toolkit;

public class Home extends JFrame {
	
	private JPanel contentPane;
	
	/**
	 * Create the Home frame.
	 */

	public Home() {
		// Title Bar
		setTitle("Tic Tac Toe");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/image/icon.png")));
		
		// Frame Setting
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Panel
		JLayeredPane panel = new JLayeredPane();
		panel.setBounds(0, 0, 700, 500);
		contentPane.add(panel);
		panel.setLayout(null);
		setResizable(false);
		
		// Play Button
		JButton btnPlay = new JButton("Play");
		btnPlay.setForeground(Color.WHITE);
		btnPlay.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPlay.setBackground(new Color(224, 90, 71));
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				ModeFrame ModeFrame = new ModeFrame();
				ModeFrame.setVisible(true);
			}
		});
		btnPlay.setBounds(90, 264, 100, 40);
		panel.add(btnPlay);
		
		// Exit Button
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBackground(new Color(224, 90, 71));
		btnExit.setBounds(205, 264, 100, 40);
		panel.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		// Logo
		JLabel HomeLogo = new JLabel("New label");
		HomeLogo.setIcon(new ImageIcon(Home.class.getResource("/image/home.png")));
		HomeLogo.setBounds(325, 125, 250, 250);
		panel.add(HomeLogo);
		
		// Welcome Text
		JLabel WelcomeText = new JLabel("<html>Welcome To <br/>TicTacToe Games </html>");
		WelcomeText.setForeground(Color.WHITE);
		WelcomeText.setToolTipText("");
		WelcomeText.setFont(new Font("Tahoma", Font.PLAIN, 25));
		WelcomeText.setBounds(90, 175, 228, 91);
		panel.add(WelcomeText);
		
		// Made By
		JLabel Credit = new JLabel("Created By BME MEMBARA TEAM\r\n");
		Credit.setForeground(Color.WHITE);
		Credit.setBounds(90, 311, 224, 38);
		panel.add(Credit);
		
		// Background
		JLabel TTTBackground = new JLabel("New label");
		TTTBackground.setIcon(new ImageIcon(Home.class.getResource("/image/background.png")));
		TTTBackground.setBounds(0, 0, 700, 500);
		contentPane.add(TTTBackground);
	}
}


