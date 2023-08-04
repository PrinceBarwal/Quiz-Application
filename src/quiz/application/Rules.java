package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    
    String name;
    JButton back , start;
    
    Rules(String name){
        
        this.name = name;
        setSize(700 , 600);
        setLocation(350 , 100);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        
        JLabel heading = new JLabel("Welcome " + name + " to Simaple Minds");
        heading.setBounds(50 , 30 , 600 , 60);
        heading.setFont(new Font("Viner HAND ITC" , Font.BOLD , 30));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel rules = new JLabel("Welcome " + name + " to Simaple Minds");
        rules.setBounds(50 , 90 , 600 , 400);
        rules.setFont(new Font("Tahoma" , Font.PLAIN ,15));
        rules.setText(
            "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        start = new JButton("Start");
        start.setBounds(45 ,500 , 100 , 30);
        start.setBackground(new Color(30 , 144 , 254));
        start.setForeground(Color.WHITE);
        start.setFont(new Font("Tahoma" , Font.PLAIN ,17));
        start.addActionListener(this);
        add(start);
        
        back = new JButton("Back");
        back.setBounds(170 , 500 , 130 , 30);
        back.setBackground(new Color(30 , 144 , 254));
        back.setFont(new Font("Tahoma" , Font.PLAIN ,17));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
            setVisible(false);
            new Quiz(name);
        }
        else{
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String [] args){
        new Rules("User");
    }
}
