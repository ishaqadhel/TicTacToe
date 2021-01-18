package games;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 690, 458);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("play");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PlayerFrame frame = new PlayerFrame();
				frame.setVisible(false);
				dispose();
				PlayerFrame pFrame = new PlayerFrame();
				pFrame.setVisible(true);
			}
		});
		btnNewButton.setBounds(286, 217, 117, 25);
		panel.add(btnNewButton);
	}
}
