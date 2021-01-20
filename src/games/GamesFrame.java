package games;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Font;

public class GamesFrame extends JFrame {
	private JPanel contentPane;
	
	private javax.swing.JLabel score1;
    private javax.swing.JLabel score2;
    
    JButton[] btn = new JButton[9];
	
	private String startGame = "X";
    
    Human player1 = new Human(null, 0);
    Human player2 = new Human(null, 0);
    
    private JLabel TTTBackground;
    private JLabel lblPlayer2;
	JLabel TurnInfo = new JLabel("Turn : " + startGame);

    private void gameScore()
    {
    	score1.setText(String.valueOf(player1.getScore()));
    	score2.setText(String.valueOf(player2.getScore()));
    }
    
    private void choosePlayer()
    {
    	if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else
        {
            startGame = "X";
        }
    	TurnInfo.setText("Turn : " + startGame);
    }
    
	/**
	 * Create the frame.
	 */
	public GamesFrame(String Player1, String Player2) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 525);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setOpaque(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		for(int i = 0; i < 9; i++)
		{
			btn[i] = new JButton("");
			btn[i].setText(null);
			btn[i].setBackground(new Color(224, 90, 71));
			contentPane.add(btn[i]);
			btn[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JButton buttonClicked = (JButton) arg0.getSource();
					btnActionPerformed(buttonClicked);
				}
			});
		}
		
		btn[0].setBounds(92, 86, 85, 85);
		btn[1].setBounds(204, 86, 85, 85);
		btn[2].setBounds(318, 86, 85, 85);
		btn[3].setBounds(92, 189, 85, 85);
		btn[4].setBounds(204, 189, 85, 85);
		btn[5].setBounds(318, 189, 85, 85);
		btn[6].setBounds(92, 292, 85, 85);
		btn[7].setBounds(204, 292, 85, 85);
		btn[8].setBounds(318, 292, 85, 85);
		
		JButton btnPlayAgain = new JButton("Play Again");
		btnPlayAgain.setForeground(Color.WHITE);
		btnPlayAgain.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPlayAgain.setBackground(new Color(224, 90, 71));
		btnPlayAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame frame = new JFrame("warning");
				
				if(JOptionPane.showConfirmDialog(frame, "Are you sure want to restart game?", "Tic Tac Toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
				{
					playAgain();
				}
			}
		});
		btnPlayAgain.setBounds(176, 410, 131, 34);
		contentPane.add(btnPlayAgain);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBackground(new Color(224, 90, 71));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame frame = new JFrame("exit");
				
				if(JOptionPane.showConfirmDialog(frame, "Are you sure want to exit game?", "Tic Tac Toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(336, 410, 131, 34);
		contentPane.add(btnExit);
		
		JPanel panel1 = new JPanel();
		panel1.setForeground(Color.WHITE);
		panel1.setBackground(new Color(224, 90, 71));
		panel1.setOpaque(true);
		panel1.setBounds(445, 86, 150, 137);
		contentPane.add(panel1);
		panel1.setLayout(null);

		JLabel lblPlayer1 = new JLabel(Player1 + " (X) : ");
		lblPlayer1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPlayer1.setForeground(Color.WHITE);
		lblPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer1.setBounds(0, 0, 150, 50);
		panel1.add(lblPlayer1);
		
		score1 = new JLabel("0");
		score1.setBackground(Color.WHITE);
		score1.setFont(new Font("Tahoma", Font.BOLD, 50));
		score1.setHorizontalAlignment(SwingConstants.CENTER);
		score1.setBounds(0, 61, 150, 75);
		score1.setOpaque(true);
		panel1.add(score1);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(445, 237, 150, 140);
		panel2.setBackground(new Color(224, 90, 71));
		panel2.setOpaque(true);
		contentPane.add(panel2);
		panel2.setLayout(null);
		
		score2 = new JLabel("0");
		score2.setBackground(Color.WHITE);
		score2.setHorizontalAlignment(SwingConstants.CENTER);
		score2.setFont(new Font("Tahoma", Font.BOLD, 50));
		score2.setBounds(0, 65, 150, 75);
		score2.setOpaque(true);
		panel2.add(score2);
		
		lblPlayer2 = new JLabel(Player2 + " (O) : ");
		lblPlayer2.setForeground(Color.WHITE);
		lblPlayer2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer2.setBounds(0, 0, 150, 50);
		panel2.add(lblPlayer2);
		
		TurnInfo.setForeground(Color.WHITE);
		TurnInfo.setFont(new Font("Tahoma", Font.BOLD, 15));
		TurnInfo.setHorizontalAlignment(SwingConstants.CENTER);
		TurnInfo.setBounds(92, 31, 311, 44);
		contentPane.add(TurnInfo);
		
		TTTBackground = new JLabel("New label");
		TTTBackground.setIcon(new ImageIcon(GamesFrame.class.getResource("/games/rsz_1610982588607.png")));
		TTTBackground.setBounds(0, 0, 700, 500);
		contentPane.add(TTTBackground);
		
		player1.setName(Player1);
		player2.setName(Player2);
	}
	
	public void btnActionPerformed(javax.swing.JButton btn)
	{
		if(btn.getText() == null)
		{	
			btn.setText(startGame);
			btn.setFont(new Font("Tahoma", Font.BOLD, -5));
			btn.setHideActionText(true);
			if(startGame=="X")
			{
				btn.setIcon(new ImageIcon(GamesFrame.class.getResource("/games/cross.png")));
			}
			else
			{
				btn.setIcon(new ImageIcon(GamesFrame.class.getResource("/games/circle.png")));
			}
	        
	        this.choosePlayer();
	        this.findResult();
		}		
	}
	
	public void findResult()
	{
		String b1 = btn[0].getText();
		String b2 = btn[1].getText();
		String b3 = btn[2].getText();
		String b4 = btn[3].getText();
		String b5 = btn[4].getText();
		String b6 = btn[5].getText();
		String b7 = btn[6].getText();
		String b8 = btn[7].getText();
		String b9 = btn[8].getText();
		
		// PLAYER X CHECK
        
        if(b1 == ("X") && b2 ==("X") && b3 == ("X"))
        {
        	this.checkWinner(player1, btn[0], btn[1], btn[2]);
        }
        
        else if(b4 == ("X") && b5 ==("X") && b6 == ("X"))
        {
        	this.checkWinner(player1, btn[3], btn[4], btn[5]);
        }
         
        else if(b7 == ("X") && b8 ==("X") && b9 == ("X"))
        {
        	this.checkWinner(player1, btn[6], btn[7], btn[8]);
        }
        
        else if(b1 == ("X") && b4 ==("X") && b7 == ("X"))
        {
        	this.checkWinner(player1, btn[0], btn[3], btn[6]);
        }
        
        else if(b2 == ("X") && b5 ==("X") && b8 == ("X"))
        {
        	this.checkWinner(player1, btn[1], btn[4], btn[7]);
        }
        else if(b3 == ("X") && b6 ==("X") && b9 == ("X"))
        {
        	this.checkWinner(player1, btn[2], btn[5], btn[8]);
        }
        
        
        else if(b1 == ("X") && b5 ==("X") && b9 == ("X"))
        {
        	this.checkWinner(player1, btn[0], btn[4], btn[8]);
        }
        
        else if(b3 == ("X") && b5 ==("X") && b7 == ("X"))
        {
        	this.checkWinner(player1, btn[2], btn[4], btn[6]);
        }
        
        // PLAYER O CHECK
        
        else if(b1 == ("O") && b2 ==("O") && b3 == ("O"))
        {
        	this.checkWinner(player2, btn[0], btn[1], btn[2]);
            
        }
        
        else if(b4 == ("O") && b5 ==("O") && b6 == ("O"))
        {
        	this.checkWinner(player2, btn[3], btn[4], btn[5]);
        }
         
        else if(b7 == ("O") && b8 ==("O") && b9 == ("O"))
        {
        	this.checkWinner(player2, btn[6], btn[7], btn[8]);
        }
        
        else if(b1 == ("O") && b4 ==("O") && b7 == ("O"))
        {
        	this.checkWinner(player2, btn[0], btn[3], btn[6]);
        }
        
        else if(b2 == ("O") && b5 ==("O") && b8 == ("O"))
        {
        	this.checkWinner(player2, btn[1], btn[4], btn[7]);
        }
        
        else if(b3 == ("O") && b6 ==("O") && b9 == ("O"))
        {
        	this.checkWinner(player2, btn[2], btn[5], btn[8]);
        }   
        
        else if(b1 == ("O") && b5 ==("O") && b9 == ("O"))
        {
        	this.checkWinner(player2, btn[0], btn[4], btn[8]);
        }
        
        else if(b3 == ("O") && b5 ==("O") && b7 == ("O"))
        {
        	this.checkWinner(player2, btn[2], btn[4], btn[6]);
        }
        
        else if(b1 != null && b2 != null && b3 != null && b4 != null && b5 != null && b6 != null && b7 != null && b8 != null && b9 != null)
        {
        	JOptionPane.showMessageDialog(this, "Draw Match", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            this.playAgain();
        }
	}
	
	public void checkWinner(Human h, javax.swing.JButton firstButton, javax.swing.JButton secondButton, javax.swing.JButton thirdButton)
	{
		firstButton.setBackground(new Color(246, 192, 101));
        secondButton.setBackground(new Color(246, 192, 101));
        thirdButton.setBackground(new Color(246, 192, 101));
        
		h.addScore(1);
        this.gameScore();
        
        if (firstButton.getText() == "X")
        {
        	JOptionPane.showMessageDialog(this, player1.getName() + " (X) wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
        	JOptionPane.showMessageDialog(this, player2.getName() + " (O) wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        }
           
        this.playAgain();
	}
	
	public void playAgain()
	{
		for (int i=0; i < 9; i++)
		{
			btn[i].setText(null);
			btn[i].setIcon(null);
			btn[i].setBackground(new Color(224, 90, 71));
		}
	}
}
