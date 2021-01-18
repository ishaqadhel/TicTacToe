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

public class Games extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Games frame = new Games();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private javax.swing.JLabel score1;
    private javax.swing.JLabel score2;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
	
	private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;

    private void gameScore()
    {
    	score1.setText(String.valueOf(xCount));
    	score2.setText(String.valueOf(oCount));
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
    }
    
	/**
	 * Create the frame.
	 */
	public Games() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 525);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btn1 = new JButton("");
		btn1.setText(null);
		btn1.setBackground(new Color(224, 90, 71));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn1ActionPerformed();
			}
		});
		btn1.setBounds(64, 85, 85, 82);
		contentPane.add(btn1);
		
		btn2 = new JButton("");
		btn2.setText(null);
		btn2.setBackground(new Color(224, 90, 71));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn2ActionPerformed();
			}
		});
		btn2.setBounds(176, 85, 85, 82);
		contentPane.add(btn2);
		
		btn3 = new JButton("");
		btn3.setText(null);
		btn3.setBackground(new Color(224, 90, 71));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn3ActionPerformed();
			}
		});
		btn3.setBounds(290, 85, 85, 82);
		contentPane.add(btn3);
		
		btn4 = new JButton("");
		btn4.setText(null);
		btn4.setBackground(new Color(224, 90, 71));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn4ActionPerformed();
			}
		});
		btn4.setBounds(64, 188, 85, 82);
		contentPane.add(btn4);
		
		btn5 = new JButton("");
		btn5.setText(null);
		btn5.setBackground(new Color(224, 90, 71));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn5ActionPerformed();
			}
		});
		btn5.setBounds(176, 188, 85, 82);
		contentPane.add(btn5);
		
		btn6 = new JButton("");
		btn6.setText(null);
		btn6.setBackground(new Color(224, 90, 71));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn6ActionPerformed();
			}
		});
		btn6.setBounds(290, 188, 85, 82);
		contentPane.add(btn6);
		
		btn7 = new JButton("");
		btn7.setText(null);
		btn7.setBackground(new Color(224, 90, 71));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn7ActionPerformed();
			}
		});
		btn7.setBounds(64, 291, 85, 82);
		contentPane.add(btn7);
		
		btn8 = new JButton("");
		btn8.setText(null);
		btn8.setBackground(new Color(224, 90, 71));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn8ActionPerformed();
			}
		});
		btn8.setBounds(176, 291, 85, 82);
		contentPane.add(btn8);
		
		btn9 = new JButton("");
		btn9.setText(null);
		btn9.setBackground(new Color(224, 90, 71));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn9ActionPerformed();
			}
		});
		btn9.setBounds(290, 291, 85, 82);
		contentPane.add(btn9);
		
		JButton btnPlayAgain = new JButton("Play Again");
		btnPlayAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playAgain();
			}
		});
		btnPlayAgain.setBounds(176, 410, 131, 34);
		contentPane.add(btnPlayAgain);
		
		JButton btnExit = new JButton("exit");
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
		
		JPanel panel = new JPanel();
		panel.setBounds(470, 85, 167, 140);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblPlayer = new JLabel("Player 1 : ");
		lblPlayer.setBounds(49, 12, 70, 15);
		panel.add(lblPlayer);
		
		score1 = new JLabel("0");
		score1.setBounds(49, 66, 70, 15);
		panel.add(score1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(470, 247, 167, 140);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPlayer_1 = new JLabel("Player 2 : ");
		lblPlayer_1.setBounds(52, 12, 70, 15);
		panel_1.add(lblPlayer_1);
		
		score2 = new JLabel("0");
		score2.setBounds(66, 64, 70, 15);
		panel_1.add(score2);
	}
	
	public void btn1ActionPerformed()
	{
		if(btn1.getText() == null)
		{
			btn1.setText(startGame);
	        
	        if(startGame.equalsIgnoreCase("X"))
	        {
	           btn1.setForeground(new Color(33, 66, 82));
	        }
	        else
	        {
	            btn1.setForeground(Color.MAGENTA);
	        }
	        choosePlayer();
	        findResult();
		}		
	}
	
	public void btn2ActionPerformed()
	{
		if(btn2.getText() == null)
		{
			btn2.setText(startGame);
	        
	        if(startGame.equalsIgnoreCase("X"))
	        {
	           btn2.setForeground(new Color(33, 66, 82));
	        }
	        else
	        {
	            btn2.setForeground(Color.MAGENTA);
	        }
	        choosePlayer();
	        findResult();
		}
	}
	
	public void btn3ActionPerformed()
	{
		if(btn3.getText() == null)
		{
			btn3.setText(startGame);
	        
	        if(startGame.equalsIgnoreCase("X"))
	        {
	           btn3.setForeground(new Color(33, 66, 82));
	        }
	        else
	        {
	            btn3.setForeground(Color.MAGENTA);
	        }
	        choosePlayer();
	        findResult();
		}
	}
	
	public void btn4ActionPerformed()
	{
		if(btn4.getText() == null)
		{
			btn4.setText(startGame);
	        
	        if(startGame.equalsIgnoreCase("X"))
	        {
	           btn4.setForeground(new Color(33, 66, 82));
	        }
	        else
	        {
	            btn4.setForeground(Color.MAGENTA);
	        }
	        choosePlayer();
	        findResult();
		}
	}
	
	public void btn5ActionPerformed()
	{
		if(btn5.getText() == null)
		{
			btn5.setText(startGame);
	        
	        if(startGame.equalsIgnoreCase("X"))
	        {
	           btn5.setForeground(new Color(33, 66, 82));
	        }
	        else
	        {
	            btn5.setForeground(Color.MAGENTA);
	        }
	        choosePlayer();
	        findResult();
		}
	}
	
	public void btn6ActionPerformed()
	{
		if(btn6.getText() == null)
		{
			btn6.setText(startGame);
	        
	        if(startGame.equalsIgnoreCase("X"))
	        {
	           btn6.setForeground(new Color(33, 66, 82));
	        }
	        else
	        {
	            btn6.setForeground(Color.MAGENTA);
	        }
	        choosePlayer();
	        findResult();
		}
	}
	
	public void btn7ActionPerformed()
	{
		if(btn7.getText() == null)
		{
			btn7.setText(startGame);
	        
	        if(startGame.equalsIgnoreCase("X"))
	        {
	           btn7.setForeground(new Color(33, 66, 82));
	        }
	        else
	        {
	            btn7.setForeground(Color.MAGENTA);
	        }
	        choosePlayer();
	        findResult();
		}
	}
	
	public void btn8ActionPerformed()
	{
		if(btn8.getText() == null)
		{
			btn8.setText(startGame);
	        
	        if(startGame.equalsIgnoreCase("X"))
	        {
	           btn8.setForeground(new Color(33, 66, 82));
	        }
	        else
	        {
	            btn8.setForeground(Color.MAGENTA);
	        }
	        choosePlayer();
	        findResult();
		}
	}
	
	public void btn9ActionPerformed()
	{
		if(btn9.getText() == null)
		{
			btn9.setText(startGame);
	        
	        if(startGame.equalsIgnoreCase("X"))
	        {
	           btn9.setForeground(new Color(33, 66, 82));
	        }
	        else
	        {
	            btn9.setForeground(Color.MAGENTA);
	        }
	        choosePlayer();
	        findResult();
		}
	}
	
	public void findResult()
	{
		String b1 = btn1.getText();
		String b2 = btn2.getText();
		String b3 = btn3.getText();
		String b4 = btn4.getText();
		String b5 = btn5.getText();
		String b6 = btn6.getText();
		String b7 = btn7.getText();
		String b8 = btn8.getText();
		String b9 = btn9.getText();
		
// PLAYER X CODING
        
        if(b1 == ("X") && b2 ==("X") && b3 == ("X"))
        {
            xCount++;
            gameScore();
            
            btn1.setBackground(new Color(246, 192, 101));
            btn2.setBackground(new Color(246, 192, 101));
            btn3.setBackground(new Color(246, 192, 101));
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            playAgain();
        }
        
        if(b4 == ("X") && b5 ==("X") && b6 == ("X"))
        {
            xCount++;
            gameScore();
            
            btn4.setBackground(new Color(246, 192, 101));
            btn5.setBackground(new Color(246, 192, 101));
            btn6.setBackground(new Color(246, 192, 101));
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            playAgain();
        }
         
        if(b7 == ("X") && b8 ==("X") && b9 == ("X"))
        {
            xCount++;
            gameScore();
            
            btn7.setBackground(new Color(246, 192, 101));
            btn8.setBackground(new Color(246, 192, 101));
            btn9.setBackground(new Color(246, 192, 101));
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            playAgain();
        }
        
        if(b1 == ("X") && b4 ==("X") && b7 == ("X"))
        {
            xCount++;
            gameScore();
            
            btn1.setBackground(new Color(246, 192, 101));
            btn4.setBackground(new Color(246, 192, 101));
            btn7.setBackground(new Color(246, 192, 101)); 
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            playAgain();
        }
        
        if(b2 == ("X") && b5 ==("X") && b8 == ("X"))
        {
            xCount++;
            gameScore();
            
            btn2.setBackground(new Color(246, 192, 101));
            btn5.setBackground(new Color(246, 192, 101));
            btn8.setBackground(new Color(246, 192, 101));  
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            playAgain();
        }
        if(b3 == ("X") && b6 ==("X") && b9 == ("X"))
        {
            xCount++;
            gameScore();
            
            btn3.setBackground(new Color(246, 192, 101));
            btn6.setBackground(new Color(246, 192, 101));
            btn9.setBackground(new Color(246, 192, 101));     
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            playAgain();
        }
        
        
        if(b1 == ("X") && b5 ==("X") && b9 == ("X"))
        {
            xCount++;
            gameScore();
            
            btn1.setBackground(new Color(246, 192, 101));
            btn5.setBackground(new Color(246, 192, 101));
            btn9.setBackground(new Color(246, 192, 101)); 
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            playAgain();
        }
        
        if(b3 == ("X") && b5 ==("X") && b7 == ("X"))
        {
            xCount++;
            gameScore();
            
            btn3.setBackground(new Color(246, 192, 101));
            btn5.setBackground(new Color(246, 192, 101));
            btn7.setBackground(new Color(246, 192, 101));
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            playAgain();
        }
        
// PLAYER O CODING
        
        
        if(b1 == ("O") && b2 ==("O") && b3 == ("O"))
        {
            oCount++;
            gameScore();
            
            btn1.setBackground(new Color(246, 192, 101));
            btn2.setBackground(new Color(246, 192, 101));
            btn3.setBackground(new Color(246, 192, 101));
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            playAgain();
            
        }
        
        if(b4 == ("O") && b5 ==("O") && b6 == ("O"))
        {
            oCount++;
            gameScore();
            
            btn4.setBackground(new Color(246, 192, 101));
            btn5.setBackground(new Color(246, 192, 101));
            btn6.setBackground(new Color(246, 192, 101)); 
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            playAgain();
        }
         
        if(b7 == ("O") && b8 ==("O") && b9 == ("O"))
        {
            oCount++;
            gameScore();
            
            btn7.setBackground(new Color(246, 192, 101));
            btn8.setBackground(new Color(246, 192, 101));
            btn9.setBackground(new Color(246, 192, 101));  
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            playAgain();
        }
        
        if(b1 == ("O") && b4 ==("O") && b7 == ("O"))
        {
            oCount++;
            gameScore();
            
            btn1.setBackground(new Color(246, 192, 101));
            btn4.setBackground(new Color(246, 192, 101));
            btn7.setBackground(new Color(246, 192, 101));
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            playAgain();
        }
        
        if(b2 == ("O") && b5 ==("O") && b8 == ("O"))
        {
            oCount++;
            gameScore();
            
            btn2.setBackground(new Color(246, 192, 101));
            btn5.setBackground(new Color(246, 192, 101));
            btn8.setBackground(new Color(246, 192, 101));  
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            playAgain();
        }
        if(b3 == ("O") && b6 ==("O") && b9 == ("O"))
        {
            oCount++;
            gameScore();
            
            btn3.setBackground(new Color(246, 192, 101));
            btn6.setBackground(new Color(246, 192, 101));
            btn9.setBackground(new Color(246, 192, 101));   
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            playAgain();
        }
        
        
        if(b1 == ("O") && b5 ==("O") && b9 == ("O"))
        {
            oCount++;
            gameScore();
            
            btn1.setBackground(new Color(246, 192, 101));
            btn5.setBackground(new Color(246, 192, 101));
            btn9.setBackground(new Color(246, 192, 101));  
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            playAgain();
        }
        
        if(b3 == ("O") && b5 ==("O") && b7 == ("O"))
        {
            oCount++;
            gameScore();
            
            btn3.setBackground(new Color(246, 192, 101));
            btn5.setBackground(new Color(246, 192, 101));
            btn7.setBackground(new Color(246, 192, 101));   
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            playAgain();
        }
        
        else if(b1 != null && b2 != null && b3 != null && b4 != null && b5 != null && b6 != null && b7 != null && b8 != null && b9 != null)
        {
        	JOptionPane.showMessageDialog(this, "Draw Match", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            playAgain();
        }
	}
	
	public void playAgain()
	{
		btn1.setText(null);
		btn2.setText(null);
		btn3.setText(null);
		btn4.setText(null);
		btn5.setText(null);
		btn6.setText(null);
		btn7.setText(null);
		btn8.setText(null);
		btn9.setText(null);
		
		btn1.setBackground(new Color(224, 90, 71));
		btn2.setBackground(new Color(224, 90, 71));
		btn3.setBackground(new Color(224, 90, 71));
		btn4.setBackground(new Color(224, 90, 71));
		btn5.setBackground(new Color(224, 90, 71));
		btn6.setBackground(new Color(224, 90, 71));
		btn7.setBackground(new Color(224, 90, 71));
		btn8.setBackground(new Color(224, 90, 71));
		btn9.setBackground(new Color(224, 90, 71));
	}

}
