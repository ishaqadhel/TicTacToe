package games;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class GamesCompFrame extends JFrame {

	private JPanel contentPane;
	
	private javax.swing.JLabel score1;
    private javax.swing.JLabel score2;
    
    JButton[] btn = new JButton[9];
	
	private String startGame = "X";
	private int gameOn = 0;
    
    Human player = new Human(null, 0);
    Computer comp = new Computer(null, 0);
    
    private JLabel TTTBackground;
    private JLabel Player2Name;

	JLabel TurnInfo = new JLabel("Turn : " + startGame);
		
    private void gameScore()
    {
    	score1.setText(String.valueOf(player.getScore()));
    	score2.setText(String.valueOf(comp.getScore()));
    }
    
    private void choosePlayer()
    {
    	if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
            compMove();
        }
        else
        {
            startGame = "X";
        }
    	TurnInfo.setText("Turn : " + startGame);
    }
    
    private void compMove()
    {
    	this.btnActionPerformed(btn[comp.setNextMove()]);
    }

	/**
	 * Create the frame.
	 */
	public GamesCompFrame(String Player1) {
		// Player Name Input
		player.setName(Player1);
		comp.setRandomName();
		
		gameOn = 1;

		// Title Bar
		setTitle("Tic Tac Toe");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/image/icon.png")));
				
		// Frame Setting
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 525);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setOpaque(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Board
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
				
		// Play Again Button
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
		
		// Exit Button
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBackground(new Color(224, 90, 71));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame frame = new JFrame("exit");
				// Background
				
				if(JOptionPane.showConfirmDialog(frame, "Are you sure want to exit game?", "Tic Tac Toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
				{
					
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(336, 410, 131, 34);
		contentPane.add(btnExit);
				
		// Scoreboard X
			// Scoreboard X Box
		JPanel ScoreboardX = new JPanel();
		ScoreboardX.setForeground(Color.WHITE);
		ScoreboardX.setBackground(new Color(224, 90, 71));
		ScoreboardX.setOpaque(true);
		ScoreboardX.setBounds(445, 86, 150, 137);
		contentPane.add(ScoreboardX);
		ScoreboardX.setLayout(null);

			// Scoreboard X Name
		JLabel Player1Name = new JLabel(player.getName() + " (X) : ");
		Player1Name.setFont(new Font("Tahoma", Font.BOLD, 15));
		Player1Name.setForeground(Color.WHITE);
		Player1Name.setHorizontalAlignment(SwingConstants.CENTER);
		Player1Name.setBounds(0, 0, 150, 50);
		ScoreboardX.add(Player1Name);
				
			// Scoreboard X Score
		score1 = new JLabel("0");
		score1.setBackground(Color.WHITE);
		score1.setFont(new Font("Tahoma", Font.BOLD, 50));
		score1.setHorizontalAlignment(SwingConstants.CENTER);
		score1.setBounds(0, 61, 150, 75);
		score1.setOpaque(true);
		ScoreboardX.add(score1);
				
		// Scoreboard Y
			// Scoreboard Y Box
		JPanel ScoreboardY = new JPanel();
		ScoreboardY.setBounds(445, 237, 150, 140);
		ScoreboardY.setBackground(new Color(224, 90, 71));
		ScoreboardY.setOpaque(true);
		contentPane.add(ScoreboardY);
		ScoreboardY.setLayout(null);
				
			// Scoreboard Y Score
		score2 = new JLabel("0");
		score2.setBackground(Color.WHITE);
		score2.setHorizontalAlignment(SwingConstants.CENTER);
		score2.setFont(new Font("Tahoma", Font.BOLD, 50));
		score2.setBounds(0, 65, 150, 75);
		score2.setOpaque(true);
		ScoreboardY.add(score2);
				
			// Scoreboard Y Name
		Player2Name = new JLabel(comp.getName() + " (O) : ");
		Player2Name.setForeground(Color.WHITE);
		Player2Name.setFont(new Font("Tahoma", Font.BOLD, 15));
		Player2Name.setHorizontalAlignment(SwingConstants.CENTER);
		Player2Name.setBounds(0, 0, 150, 50);
		ScoreboardY.add(Player2Name);
				
		// Turn to move Info Label
		TurnInfo.setForeground(Color.WHITE);
		TurnInfo.setFont(new Font("Tahoma", Font.BOLD, 15));
		TurnInfo.setHorizontalAlignment(SwingConstants.CENTER);
		TurnInfo.setBounds(92, 31, 311, 44);
		contentPane.add(TurnInfo);
				
		// Background
		TTTBackground = new JLabel("New label");
		TTTBackground.setIcon(new ImageIcon(GamesFrame.class.getResource("/image/background.png")));
		TTTBackground.setBounds(0, 0, 700, 500);
		contentPane.add(TTTBackground);
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
				btn.setIcon(new ImageIcon(GamesFrame.class.getResource("/image/cross.png")));
			}
			else
			{
				btn.setIcon(new ImageIcon(GamesFrame.class.getResource("/image/circle.png")));
			}
	        
	        this.findResult();
	        this.choosePlayer();
		}
		else
		{
			if(startGame.equalsIgnoreCase("O") && gameOn == 1)
			{
				this.compMove();
			}
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
        	this.checkWinner(player, btn[0], btn[1], btn[2]);
        }
        
        else if(b4 == ("X") && b5 ==("X") && b6 == ("X"))
        {
        	this.checkWinner(player, btn[3], btn[4], btn[5]);
        }
         
        else if(b7 == ("X") && b8 ==("X") && b9 == ("X"))
        {
        	this.checkWinner(player, btn[6], btn[7], btn[8]);
        }
        
        else if(b1 == ("X") && b4 ==("X") && b7 == ("X"))
        {
        	this.checkWinner(player, btn[0], btn[3], btn[6]);
        }
        
        else if(b2 == ("X") && b5 ==("X") && b8 == ("X"))
        {
        	this.checkWinner(player, btn[1], btn[4], btn[7]);
        }
        else if(b3 == ("X") && b6 ==("X") && b9 == ("X"))
        {
        	this.checkWinner(player, btn[2], btn[5], btn[8]);
        }
        
        
        else if(b1 == ("X") && b5 ==("X") && b9 == ("X"))
        {
        	this.checkWinner(player, btn[0], btn[4], btn[8]);
        }
        
        else if(b3 == ("X") && b5 ==("X") && b7 == ("X"))
        {
        	this.checkWinner(player, btn[2], btn[4], btn[6]);
        }
        
        // PLAYER O CHECK
        
        else if(b1 == ("O") && b2 ==("O") && b3 == ("O"))
        {
        	this.checkWinner(comp, btn[0], btn[1], btn[2]);
            
        }
        
        else if(b4 == ("O") && b5 ==("O") && b6 == ("O"))
        {
        	this.checkWinner(comp, btn[3], btn[4], btn[5]);
        }
         
        else if(b7 == ("O") && b8 ==("O") && b9 == ("O"))
        {
        	this.checkWinner(comp, btn[6], btn[7], btn[8]);
        }
        
        else if(b1 == ("O") && b4 ==("O") && b7 == ("O"))
        {
        	this.checkWinner(comp, btn[0], btn[3], btn[6]);
        }
        
        else if(b2 == ("O") && b5 ==("O") && b8 == ("O"))
        {
        	this.checkWinner(comp, btn[1], btn[4], btn[7]);
        }
        
        else if(b3 == ("O") && b6 ==("O") && b9 == ("O"))
        {
        	this.checkWinner(comp, btn[2], btn[5], btn[8]);
        }   
        
        else if(b1 == ("O") && b5 ==("O") && b9 == ("O"))
        {
        	this.checkWinner(comp, btn[0], btn[4], btn[8]);
        }
        
        else if(b3 == ("O") && b5 ==("O") && b7 == ("O"))
        {
        	this.checkWinner(comp, btn[2], btn[4], btn[6]);
        }
        
        else if(b1 != null && b2 != null && b3 != null && b4 != null && b5 != null && b6 != null && b7 != null && b8 != null && b9 != null)
        {
        	gameOn = 0;
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
        	JOptionPane.showMessageDialog(this, player.getName() + " (X) wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
        	JOptionPane.showMessageDialog(this, comp.getName() + " (O) wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        }
        
        gameOn = 0;
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
		gameOn = 1;
	}

}
