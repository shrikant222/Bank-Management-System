package BankmgmtSystem;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.EventListener;
import java.util.Random;
import java.awt.event.ActionEvent;

 class SignUP extends JFrame implements ActionListener {
    JTextField name,fname,mailtext,ad,ct;
    JButton next;
    JDateChooser dateChooser;
    JRadioButton rone,rtwo,msy,msn;
    Random ran =new Random();
    long ff =ran.nextLong(1111,9999);
    SignUP(){
        super("Application form: ");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("Application From Number:-"+ff);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

       JLabel lable2 = new JLabel("page 1");
       lable2.setBounds(400,70,600,30);
       lable2.setFont(new Font("Ralway",Font.BOLD,22));
       add(lable2);

       JLabel lable3 = new JLabel("Personal Details:-");
       lable3.setFont(new Font("Ralway",Font.BOLD,38));
       lable3.setBounds(290,100,600,30);
       add(lable3);

       JLabel lableName = new JLabel("Name: ");
       lableName.setFont(new Font("Ralway", Font.BOLD,20));
       lableName.setBounds(100,190,100,30);
       add(lableName);

       name = new JFormattedTextField();
       name.setFont(new Font("Ralway",Font.BOLD,14));
       name.setBounds(300,190,400,30);
       add(name);

        JLabel namef = new JLabel("Father's Name: ");
        namef.setFont(new Font("Railway", Font.BOLD,20));
        namef.setBounds(100,250,200,30);
        add(namef);

        fname = new JFormattedTextField();
        fname.setFont(new Font("Railway",Font.BOLD,14));
        fname.setBounds(300,250,400,30);
        add(fname);

        JLabel dob = new JLabel("Date of Birth: ");
        dob.setFont(new Font("Railway", Font.BOLD,20));
        dob.setBounds(100,350,200,30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(237, 226, 207, 97));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        JLabel genderl = new JLabel("Gender: ");
        genderl.setFont(new Font("Railway", Font.BOLD,20));
        genderl.setBounds(100,290,200,30);
        add(genderl);
        rone = new JRadioButton("Male");
        rone.setFont(new Font("Ralway",Font.BOLD,14));
        rone.setBackground(new Color(237,226,207));
        rone.setBounds(300,290,100,30);
        add(rone);

        rtwo = new JRadioButton("Female");
        rtwo.setFont(new Font("Ralway",Font.BOLD,14));
        rtwo.setBackground(new Color(237,226,207));
        rtwo.setBounds(450,290,100,30);
        add(rtwo);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rone);
        bg.add(rtwo);

        JLabel mail = new JLabel("Email: ");
        mail.setFont(new Font("Railway", Font.BOLD,20));
        mail.setBounds(100,390,200,30);
        add(mail);


        mailtext = new JFormattedTextField();
        mailtext.setFont(new Font("Ralway",Font.BOLD,14));
        mailtext.setBounds(300,390,400,30);
        add(mailtext);

        JLabel mar = new JLabel("Marital Status : ");
        mar.setFont(new Font("Railway", Font.BOLD,20));
        mar.setBounds(100,440,200,30);
        add(mar);


        msy = new JRadioButton("Married");
        msy.setFont(new Font("Ralway",Font.BOLD,14));
        msy.setBounds(300,440,100,30);
        add(msy);
        msn = new JRadioButton("Unmarried");
        msn.setFont(new Font("Ralway",Font.BOLD,14));
        rone.setBackground(new Color(237,226,207));
        msn.setBounds(450,440,100,30);
        add(msn);

        JLabel add = new JLabel("Address : ");
        add.setFont(new Font("Railway", Font.BOLD,20));
        rone.setBackground(new Color(237,226,207));
        add.setBounds(100,490,200,30);
        add(add);
        ButtonGroup bb= new ButtonGroup();
        bb.add(msy);
        bb.add(msn);


        ad = new JFormattedTextField();
        ad.setFont(new Font("Ralway",Font.BOLD,14));
        ad.setBounds(300,490,400,30);
        add(ad);

        JLabel city = new JLabel("City : ");
        city.setFont(new Font("Railway", Font.BOLD,20));
        city.setBounds(100,540,200,30);
        add(city);


        ct = new JFormattedTextField();
        ct.setFont(new Font("Ralway",Font.BOLD,14));
        ct.setBounds(300,540,400,30);
        add(ct);
        next = new JButton("Next: ");
        next.setFont(new Font("Ralway",Font.BOLD,14));
        next.setForeground(new Color(0x222725));
        next.setBounds(620,710,80,30);
        next.addActionListener((ActionListener) this);
        add(next);

        getContentPane().setBackground(new Color(237, 226, 207, 97));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }
    @Override
     public void actionPerformed(ActionEvent e) {
        String frf= String.valueOf(ff);
        String dname = name.getText();
        String dfname =fname.getText();
        String bod = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender =null;
        if(rone.isSelected()){
            gender="Male";
        }
        else if(rtwo.isSelected()){
            gender="Female";
        }
        String email=mailtext.getText();
        String marital=null;
        if(msy.isSelected()){
            marital="Married";
        }
        else if(msn.isSelected()){
            marital="Unmarried";
        }
        String addres = ad.getText();
        String city = ct.getText();



        try{
           if(name.getText().equals("")){
               JOptionPane.showMessageDialog(null,"Fill all the fileds");
                          }
           else {
               DatabaseConnection con1 = new DatabaseConnection();
               String q = "Insert into signup values('"+frf+"','"+dname+"','"+dfname+"','"+bod+"','"+gender+"','"+email+"','"+marital+"','"+addres+"','"+city+"')";
               con1.statement.executeUpdate(q);
               new Signuptwo();
               setVisible(false);
           }
        }
        catch (Exception e1){
            e1.printStackTrace();
        }
     }

     public static void main(String[] args) {
         new SignUP();
     }
 }
