package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JButton rules , back;
    JTextField nametf;
    
    Login(){
        setSize(1100 , 500);
        setLocation(150 , 150);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new  ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(600, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,600,500);
        add(image);
        
        
        
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(700 , 50 , 400 , 60);
        heading.setFont(new Font("Viner HAND ITC" , Font.BOLD , 40));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(750 , 130 , 200 , 30);
        name.setFont(new Font("Mogolian Baiti" , Font.BOLD , 20));
        name.setForeground(Color.BLACK);
        add(name);
        
        
        nametf = new JTextField();
        nametf.setBounds(735 , 180 , 200 , 30);
        nametf.setFont(new Font("Mogolian Baiti" , Font.BOLD , 20));
//        nametf.setForeground(Color.BLACK);
        add(nametf);
        
        
        rules = new JButton("Rules");
        rules.setBounds(675 , 270 , 130 , 30);
        rules.setBackground(new Color(30 , 144 , 254));
        rules.setForeground(Color.WHITE);
        rules.setFont(new Font("Tahoma" , Font.PLAIN ,17));
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(860 , 270 , 130 , 30);
        back.setBackground(new Color(30 , 144 , 254));
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma" , Font.PLAIN ,17));
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules){
            String name = nametf.getText();
            setVisible(false);
            new Rules(name);
        }
        else{
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new Login();
    }
}
