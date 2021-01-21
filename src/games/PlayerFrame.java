package games;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;

public class PlayerFrame extends JFrame {

	JLayeredPane ProfilePlayer1;
	
	private JPanel contentPane;

	/**
	 * Create the Player Profile frame.
	 */
	public PlayerFrame() {
		// Title Bar
		setTitle("Tic Tac Toe");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/image/icon.png")));
		
		// Frame Setting
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Profile Player 2 
			// Profile Player 2 Box
		JLayeredPane ProfilePlayer2 = new JLayeredPane();
		ProfilePlayer2.setOpaque(true);
		ProfilePlayer2.setBackground(Color.WHITE);
		ProfilePlayer2.setBounds(358, 81, 200, 229);
		contentPane.add(ProfilePlayer2);
		
			// Profile Player 2 Name Input
		JFormattedTextField ProfilePlayer2Name = new JFormattedTextField();
		ProfilePlayer2Name.setBackground(new Color(196, 196, 196));
		ProfilePlayer2Name.setBounds(10, 158, 180, 32);
		ProfilePlayer2.add(ProfilePlayer2Name);
		
			// Profile Player 2 Name Title
		JLabel Name2Title = new JLabel("Name\r\n");
		Name2Title.setBounds(10, 129, 69, 32);
		ProfilePlayer2.add(Name2Title);
		
			// Profile Player 2 Box Title
		JLabel ProfilePlayer2Title = new JLabel("Profile Player O");
		ProfilePlayer2Title.setOpaque(true);
		ProfilePlayer2Title.setHorizontalAlignment(SwingConstants.CENTER);
		ProfilePlayer2Title.setForeground(Color.WHITE);
		ProfilePlayer2Title.setFont(new Font("Tahoma", Font.BOLD, 25));
		ProfilePlayer2Title.setBackground(new Color(224, 90, 71));
		ProfilePlayer2Title.setBounds(0, 0, 200, 100);
		ProfilePlayer2.add(ProfilePlayer2Title);
		
		// Profile Player 1
			// Profile Player 1 Box
		ProfilePlayer1 = new JLayeredPane();
		ProfilePlayer1.setBackground(Color.WHITE);
		ProfilePlayer1.setOpaque(true);
		ProfilePlayer1.setBounds(134, 81, 200, 229);
		contentPane.add(ProfilePlayer1);
		
			// Profile Player 1 Title
		JLabel ProfilePlayer1Title = new JLabel("Profile Player X");
		ProfilePlayer1Title.setLocation(0, 0);
		ProfilePlayer1Title.setHorizontalAlignment(SwingConstants.CENTER);
		ProfilePlayer1Title.setForeground(Color.WHITE);
		ProfilePlayer1Title.setFont(new Font("Tahoma", Font.BOLD, 25));
		ProfilePlayer1.setLayer(ProfilePlayer1Title, 0);
		ProfilePlayer1Title.setBackground(new Color(224, 90, 71));
		ProfilePlayer1Title.setOpaque(true);
		ProfilePlayer1Title.setSize(200, 100);
		ProfilePlayer1.add(ProfilePlayer1Title);
		
			// Profile Player 1 Name Input
		JFormattedTextField ProfilePlayer1Name = new JFormattedTextField();
		ProfilePlayer1Name.setBackground(new Color(196,196,196));
		ProfilePlayer1.setLayer(ProfilePlayer1Name, 1);
		ProfilePlayer1Name.setBounds(10, 160, 180, 32);
		ProfilePlayer1.add(ProfilePlayer1Name);
		
			// Profile Player 1 Name Title
		JLabel Name1Title = new JLabel("Name\r\n");
		Name1Title.setBounds(10, 131, 69, 32);
		ProfilePlayer1.add(Name1Title);
		
		// Back To Main Button
		JButton BackToMode = new JButton("Back To Mode\r\n");
		BackToMode.setForeground(Color.WHITE);
		BackToMode.setFont(new Font("Tahoma", Font.BOLD, 15));
		BackToMode.setBackground(new Color(224, 90, 71));
		BackToMode.setBounds(134, 336, 200, 60);
		BackToMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				ModeFrame ModeFrame = new ModeFrame();
				ModeFrame.setVisible(true);
			}
		});
		contentPane.add(BackToMode);
		
		// Play Button
		JButton Play = new JButton("Play");
		Play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ( ProfilePlayer1Name.getText().trim().length() == 0 || ProfilePlayer2Name.getText().trim().length() == 0)
				{
					JFrame frameWarning = new JFrame("warning");
					JOptionPane.showConfirmDialog(frameWarning,"Player Name Can't be Null", "Tic Tac Toe", JOptionPane.CLOSED_OPTION);
				}
				else if (ProfilePlayer1Name.getText().equalsIgnoreCase(ProfilePlayer2Name.getText()))
				{
					JFrame frameWarning = new JFrame("warning");
					JOptionPane.showConfirmDialog(frameWarning,"Player Name Can't be Same", "Tic Tac Toe", JOptionPane.CLOSED_OPTION);
				}
				else
				{
					dispose();
					GamesFrame NewGames = new GamesFrame(ProfilePlayer1Name.getText(), ProfilePlayer2Name.getText());
					NewGames.setVisible(true);
				}
			}
		});
		Play.setForeground(Color.WHITE);
		Play.setFont(new Font("Tahoma", Font.BOLD, 15));
		Play.setBackground(new Color(224, 90, 71));
		Play.setBounds(358, 336, 200, 60);
		contentPane.add(Play);
		
		// Background
		JLabel TTTBackground = new JLabel("New label");
		TTTBackground.setIcon(new ImageIcon(PlayerFrame.class.getResource("/image/background.png")));
		TTTBackground.setBounds(0, 0, 700, 500);
		contentPane.add(TTTBackground);
	}
}
