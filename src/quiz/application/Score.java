package quiz.application;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    
    Score(String name , int score){
        setSize(700  , 500);
        setLocation(400 , 100);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,100,300 , 300);
        add(image);
        
        JLabel heading = new JLabel("Thank You " + name + " for playing Simpe Minds ");
        heading.setBounds(43 , 30 , 700, 30);
        heading.setFont(new Font("Tahoma" , Font.PLAIN , 26));
        add(heading);
        
        JLabel scorelbl = new JLabel("Your Score is " + score);
        scorelbl.setBounds(350 , 200 , 300, 30);
        scorelbl.setFont(new Font("Tahoma" , Font.PLAIN , 26));
        add(scorelbl);
        
        JButton playAgain = new JButton("Play Again!!");
        playAgain.setBounds(350 , 330 , 200 , 40);
        playAgain.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        playAgain.setBackground(new Color(30 , 144 , 255));
        playAgain.setForeground(Color.WHITE);
        playAgain.addActionListener(this);
        add(playAgain);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    
    public static void main(String[] args){
        new Score("Username" , 0);
    }
}
