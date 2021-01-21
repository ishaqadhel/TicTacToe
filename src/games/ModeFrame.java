package games;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ModeFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public ModeFrame() {
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
				
				// Back To Main Button
				JButton BackToMain = new JButton("Back To Main\r\n");
				BackToMain.setForeground(Color.WHITE);
				BackToMain.setFont(new Font("Tahoma", Font.BOLD, 15));
				BackToMain.setBackground(new Color(224, 90, 71));
				BackToMain.setBounds(277, 375, 142, 40);
				BackToMain.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
						Home frame = new Home();
						frame.setVisible(true);
					}
				});
				
				// Vs Player Button
				JButton VsPlayer = new JButton("Vs Player");
				VsPlayer.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
						PlayerFrame PlayerFrame = new PlayerFrame();
						PlayerFrame.setVisible(true);
					}
				});
				VsPlayer.setForeground(Color.WHITE);
				VsPlayer.setFont(new Font("Dialog", Font.BOLD, 15));
				VsPlayer.setBackground(new Color(224, 90, 71));
				VsPlayer.setBounds(390, 304, 142, 40);
				contentPane.add(VsPlayer);
				contentPane.add(BackToMain);
				
				// Vs Computer Button
				JButton VsComputer = new JButton("Vs Computer");
				VsComputer.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
						CompFrame CompFrame = new CompFrame();
						CompFrame.setVisible(true);
					}
				});
				VsComputer.setForeground(Color.WHITE);
				VsComputer.setFont(new Font("Tahoma", Font.BOLD, 15));
				VsComputer.setBackground(new Color(224, 90, 71));
				VsComputer.setBounds(171, 304, 142, 40);
				contentPane.add(VsComputer);
				
				// Background
				JLabel TTTBackground = new JLabel("New label");
				TTTBackground.setIcon(new ImageIcon(PlayerFrame.class.getResource("/image/background.png")));
				TTTBackground.setBounds(0, 0, 700, 500);
				contentPane.add(TTTBackground);
	}
}
