
package calculator;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Calculator extends JFrame{
    
    private Container c;
    private Cursor cs;
    private ImageIcon icon;
    private JTextField tf;
    private Font f;
    private JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16,clearbutton;
    
    Calculator(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Calculator");
        this.setResizable(false);
        this.setBounds(200,200,280,420);
        
        content();
    }
    
    public void content(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        
        //cursor set//
        
        cs = new Cursor(Cursor.HAND_CURSOR);
        
        //icon set//
        icon = new ImageIcon(getClass().getResource("icon.png"));
        this.setIconImage(icon.getImage());
        
        //font set//
        f = new Font("Arial",Font.BOLD,20);
        
        //monitor of calculator//
        tf = new JTextField();
        tf.setBounds(10,10,250,60);
        tf.setBackground(Color.DARK_GRAY);
        tf.setForeground(Color.CYAN);
        tf.setFont(f);
        tf.setHorizontalAlignment(JTextField.RIGHT);
        c.add(tf);
        
        // Button set//
        //clear button//
        clearbutton = new JButton("Clear");
        clearbutton.setBounds(145,80,115,50);
        clearbutton.setBackground(Color.DARK_GRAY);
        clearbutton.setForeground(Color.CYAN);
        clearbutton.setCursor(cs);
        c.add(clearbutton);
        
        //1st line//
        bt1 = new JButton("7");
        bt1.setBounds(10,140,50,50);
        bt1.setBackground(Color.DARK_GRAY);
        bt1.setForeground(Color.CYAN);
        bt1.setCursor(cs);
        c.add(bt1);
        
        bt2 = new JButton("8");
        bt2.setBounds(78,140,50,50);
        bt2.setBackground(Color.DARK_GRAY);
        bt2.setForeground(Color.CYAN);
        bt2.setCursor(cs);
        c.add(bt2);
        
        bt3 = new JButton("9");
        bt3.setBounds(145,140,50,50);
        bt3.setBackground(Color.DARK_GRAY);
        bt3.setForeground(Color.CYAN);
        bt3.setCursor(cs);
        c.add(bt3);
        
        bt4 = new JButton("/");
        bt4.setBounds(210,140,50,50);
        bt4.setBackground(Color.DARK_GRAY);
        bt4.setForeground(Color.CYAN);
        bt4.setCursor(cs);
        c.add(bt4);
        
        //2nd line//
        
        bt5 = new JButton("4");
        bt5.setBounds(10,200,50,50);
        bt5.setBackground(Color.DARK_GRAY);
        bt5.setForeground(Color.CYAN);
        bt5.setCursor(cs);
        c.add(bt5);
        
        bt6 = new JButton("5");
        bt6.setBounds(78,200,50,50);
        bt6.setBackground(Color.DARK_GRAY);
        bt6.setForeground(Color.CYAN);
        bt6.setCursor(cs);
        c.add(bt6);
        
        bt7 = new JButton("6");
        bt7.setBounds(145,200,50,50);
        bt7.setBackground(Color.DARK_GRAY);
        bt7.setForeground(Color.CYAN);
        bt7.setCursor(cs);
        c.add(bt7);
        
        bt8 = new JButton("X");
        bt8.setBounds(210,200,50,50);
        bt8.setBackground(Color.DARK_GRAY);
        bt8.setForeground(Color.CYAN);
        bt8.setCursor(cs);
        c.add(bt8);
        
        // 3rd line//
        
        bt9 = new JButton("1");
        bt9.setBounds(10,260,50,50);
        bt9.setBackground(Color.DARK_GRAY);
        bt9.setForeground(Color.CYAN);
        bt9.setCursor(cs);
        c.add(bt9);
        
        bt10 = new JButton("2");
        bt10.setBounds(78,260,50,50);
        bt10.setBackground(Color.DARK_GRAY);
        bt10.setForeground(Color.CYAN);
        bt10.setCursor(cs);
        c.add(bt10);
        
        bt11 = new JButton("3");
        bt11.setBounds(145,260,50,50);
        bt11.setBackground(Color.DARK_GRAY);
        bt11.setForeground(Color.CYAN);
        bt11.setCursor(cs);
        c.add(bt11);
        
        bt12 = new JButton("-");
        bt12.setBounds(210,260,50,50);
        bt12.setBackground(Color.DARK_GRAY);
        bt12.setForeground(Color.CYAN);
        bt12.setCursor(cs);
        c.add(bt12);
        
        //4th line//
        
        bt13 = new JButton("0");
        bt13.setBounds(10,320,50,50);
        bt13.setBackground(Color.DARK_GRAY);
        bt13.setForeground(Color.CYAN);
        bt13.setCursor(cs);
        c.add(bt13);
        
        bt14 = new JButton(".");
        bt14.setBounds(78,320,50,50);
        bt14.setBackground(Color.DARK_GRAY);
        bt14.setForeground(Color.CYAN);
        bt14.setCursor(cs);
        c.add(bt14);
        
        bt15 = new JButton("+");
        bt15.setBounds(145,320,50,50);
        bt15.setBackground(Color.DARK_GRAY);
        bt15.setForeground(Color.CYAN);
        bt15.setCursor(cs);
        c.add(bt15);
        
        bt16 = new JButton("=");
        bt16.setBounds(210,320,50,50);
        bt16.setBackground(Color.DARK_GRAY);
        bt16.setForeground(Color.CYAN);
        bt16.setCursor(cs);
        c.add(bt16);
        
        //action button//
        //action clear monitor//
        clearbutton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
               tf.setText("");
           } 
        });
        
        bt1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int num7 = Integer.parseInt(bt1.getText());
            }
        });
        
        
    }
    
    public static void main(String[] args) {
        Calculator frame = new Calculator();
        frame.setVisible(true);
    }
}
