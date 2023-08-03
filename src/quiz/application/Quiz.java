package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {
    
    String questions[][] = new String[10][5];
    String answers[][] = new String [10][2];
    JLabel  qno , question;
    JRadioButton option1 , option2 , option3 , option4;
    JButton lifeLine , next , submit;
    public static int timer = 15;
    
    
    Quiz(){
        setSize(1366 , 768);
        setLocation(0 , 0);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,1366 , 350);
        add(image);
        
        qno = new JLabel();
        qno.setBounds(80 , 400 , 100, 30);
        qno.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(qno);
        
        question = new JLabel();
        question.setBounds(120 , 400 , 700 , 30);
        question.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(question);
        
        option1 = new JRadioButton();
        option1.setBounds(150 , 460 , 400 , 30);
        option1.setFont(new Font("Dialog" , Font.PLAIN , 20));
        option1.setBackground(Color.WHITE);
        add(option1);
        
        
        option2 = new JRadioButton();
        option2.setBounds(150 , 490 , 400 , 30);
        option2.setFont(new Font("Dialog" , Font.PLAIN , 20));
        option2.setBackground(Color.WHITE);
        add(option2);
        
        
        option3 = new JRadioButton();
        option3.setBounds(150 , 520 , 400 , 30);
        option3.setFont(new Font("Dialog" , Font.PLAIN , 20));
        option3.setBackground(Color.WHITE);
        add(option3);
        
        
        option4 = new JRadioButton();
        option4.setBounds(150 , 550 , 400 , 30);
        option4.setFont(new Font("Dialog" , Font.PLAIN , 20));
        option4.setBackground(Color.WHITE);
        add(option4);
        
        
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        group.add(option3);
        group.add(option4);
        
        
        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";
        
        
        
        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";
        
        lifeLine = new JButton("50-50 LifeLine");
        lifeLine.setBounds(950 , 480 , 300 , 30);
        lifeLine.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        lifeLine.setBackground(new Color(30 , 144 , 255));
        lifeLine.setForeground(Color.WHITE);
        lifeLine.addActionListener(this);
        add(lifeLine);
        
        next = new JButton("NEXT");
        next.setBounds(950 , 530 , 300 , 30);
        next.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        next.setBackground(new Color(30 , 144 , 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        submit = new JButton("Submit");
        submit.setBounds(950 , 580 , 300 , 30);
        submit.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        submit.setBackground(new Color(30 , 144 , 255));
        submit.setForeground(Color.WHITE);
        submit.setEnabled(false);
        submit.addActionListener(this);
        add(submit);
        
        start(0);
        
        setVisible(true);
    }
    
    public void paint(Graphics g){
        super.paint(g);
        
        String time = "Time Left - "+ timer + " seconds";
        
        g.setFont(new Font("Tahoma" , Font.BOLD , 20));
        g.setColor(Color.RED);
        
        if(timer>0){
            g.drawString(time , 1000  , 450);
        }
        else{
            g.drawString("Times up!!" , 1000 , 450);
        }
        timer --;
        try{
            Thread.sleep(1000);
            repaint();
        }catch(Exception e){
            e.printStakeTrace();
        }
    }
    
    public void start(int count){
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        option1.setText(questions[count][1]);
        option2.setText(questions[count][2]);
        option3.setText(questions[count][3]);
        option4.setText(questions[count][4]);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == lifeLine){
            setVisible(false);
        }
        else if(ae.getSource() == next){
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new Quiz();
    }
}
