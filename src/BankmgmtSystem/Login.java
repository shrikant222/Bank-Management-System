package BankmgmtSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
  JLabel label1,label2,label3;
  JTextField testfield2;
  JPasswordField pass3;
  JButton b1,b2,b3;
    Login(){
        super("Bank System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,0,100,100);
        add(image);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2=ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3= new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630,350,100,100);
        add(iimage);
        label1=new JLabel("WELCOME To ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde",Font.BOLD,38));
            label1.setBounds(230,125,450,40);
            add(label1);


        label2 = new JLabel("card No.");
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setBounds(150,190,375,30);
        add(label2);
        testfield2= new JFormattedTextField();
        testfield2.setBounds(325,190,230,30);
        testfield2.setFont(new Font("Arial",Font.BOLD,28));
        add(testfield2);

        label3 = new JLabel("PIN: ");
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setBounds(150,250,375,30);
        add(label3);

        pass3= new JPasswordField(15);
        pass3.setFont(new Font("Arial",Font.BOLD,28));
        pass3.setBounds(325,250,375,30);
        add(pass3);
        b1 = new JButton("SIGN IN");
        b1.setFont(new Font("Arial",Font.BOLD,14));
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.setBounds(300,300,100,30);
        b1.addActionListener(this);
        add(b1);

         b2= new JButton("CLEAR");
         b2.setFont(new Font("Arial",Font.BOLD,14));
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
         b2.setBounds(430,300,100,30);
        b2.addActionListener(this);
         add(b2);

        b3 = new JButton("SIGN UP");
        b3.setFont(new Font("Arial",Font.BOLD,14));
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.BLACK);
        b3.setBounds(300,350,230,30);
        b3.addActionListener(this);
        add(b3);


        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2=iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3= new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);

        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       try{
           if(e.getSource() ==b1){

           }
           else if(e.getSource()==b2){
             testfield2.setText("");
             pass3.setText("");
           }
           else if(e.getSource()==b3){

           }
       }
       catch (Exception E){
           E.printStackTrace();
       }
    }

    public static void main(String[] args) {
        new Login();
    }
}
