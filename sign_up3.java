package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class sign_up3 extends JFrame implements ActionListener
{
    String formno;
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton b1,b2;

    public sign_up3(String formno){

        this.formno=formno;

        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("images/bank.png"));
        Image image2 =image1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon image3=new ImageIcon(image2);
        JLabel image= new JLabel(image3);
        image.setBounds(150,5,100,100);
        add(image);

        JLabel l1=new JLabel("page 3:");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel l2=new JLabel("Account Detalis:");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(280,70,400,40);
        add(l2);

        JLabel l3=new JLabel("Account Type:");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,140,150,30);
        add(l3);

        r1=new JRadioButton("Saving Account");
        r1.setBackground(new Color(215,252,252));
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBounds(100,180,150,30);
        add(r1);

        r2=new JRadioButton("Fixed Deposite Account");
        r2.setBackground(new Color(215,252,252));
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBounds(350,180,300,30);
        add(r2);

        r3=new JRadioButton("Current Account");
        r3.setBackground(new Color(215,252,252));
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBounds(100,220,250,30);
        add(r3);

        r4=new JRadioButton("Recurring Deposite Account");
        r4.setBackground(new Color(215,252,252));
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBounds(350,220,250,30);
        add(r4);

        ButtonGroup bg= new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);

        JLabel l4=new JLabel("card no:");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,300,200,30);
        add(l4);

        JLabel l5=new JLabel("(Your 16-digit card no):");
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        l5.setBounds(100,330,200,20);
        add(l5);

        JLabel l6=new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(330,300,250,30);
        add(l6);

        JLabel l7=new JLabel("(it would appear on ATM card/cheque book and Statements)");
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        l7.setBounds(330,330,500,20);
        add(l7);

        JLabel l8=new JLabel("PIN:");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,370,200,30);
        add(l8);

        JLabel l9=new JLabel("XXXX");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(330,370,200,30);
        add(l9);

        JLabel l10=new JLabel("($-digit password:");
        l10.setFont(new Font("Raleway",Font.BOLD,12));
        l10.setBounds(100,400,200,20);
        add(l10);

        JLabel l11=new JLabel("Service Required:");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,450,200,30);
        add(l11);

        c1=new JCheckBox("ATM card");
        c1.setBackground(new Color(215,252,252));
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);

        c2=new JCheckBox("Internet Banking");
        c2.setBackground(new Color(215,252,252));
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);

        c3=new JCheckBox("Moblie Banking");
        c3.setBackground(new Color(215,252,252));
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);

        c4=new JCheckBox("Email Alerts");
        c4.setBackground(new Color(215,252,252));
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);

        c5=new JCheckBox("Check Book");
        c5.setBackground(new Color(215,252,252));
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);

        c6=new JCheckBox("E-Statement");
        c6.setBackground(new Color(215,252,252));
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);

        JCheckBox c7=new JCheckBox("I here by declare that the above entered detalis correct to the best of my knowledge",true);
        c7.setBackground(new Color(215,252,252));
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,680,700,20);
        add(c7);

        JLabel l12=new JLabel("Form no:");
        l12.setFont(new Font("Raleway",Font.BOLD,14));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13=new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,14));
        l13.setBounds(760,10,60,30);
        add(l13);

        b1=new JButton("Submit");
        b1.setFont(new Font("Raleway",Font.BOLD,14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(250,720,100,30);
        b1.addActionListener(this);
        add(b1);

        b2=new JButton("Cancel");
        b2.setFont(new Font("Raleway",Font.BOLD,14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(420,720,100,30);
        b1.addActionListener(this);
        add(b2);

        getContentPane().setBackground(new Color(215,252,252));
        setSize(850,800);
        setLayout(null);
        setLocation(400,20);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype=null;
        if(r1.isSelected()){
            atype="Saving Account";
        }
        else if(r2.isSelected()){
            atype="Fixed Deposite Account";
        }
        else if(r3.isSelected()){
            atype="Current Account";
        }
        else if(r4.isSelected()){
            atype="Recurring Deposite Account";
        }
        Random ran= new Random();
        long f7=(ran.nextLong()%90000000L) + 1409963000000000L;
        String card= " " +Math.abs(f7);
        long f3= (ran.nextLong()%9000L) + 1000L;
        String pin=""+Math.abs(f3);

        String fac= "";
        if(c1.isSelected()){
            fac+="ATM card";
        } else if (c2.isSelected()) {
            fac+="Internet Banking";
        }
        else if (c3.isSelected()) {
            fac+="Moblie Banking";
        }
        else if (c4.isSelected()) {
            fac+="Email Alerts";
        }
        else if (c5.isSelected()) {
            fac+="Check Book";
        }
        else if (c6.isSelected()) {
            fac+="E-Statement";
        }
        try {
            if(e.getSource()==b1){
                if (atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the fields");
                }

                else{
                    conn c1=new conn();
                    String q1= "insert into sign_up3 values('"+formno+"','"+atype+"','"+card+"','"+pin+"','"+fac+"')";
                    String q2= "insert into login values('"+formno+"','"+card+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number:"+card+"\n Pin :"+pin);
                    new Deposit(pin);
                    setVisible(false);
                }
                }
            else if(e.getSource()==b2){
                System.exit(0);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String [] args){
        new sign_up3("");
}
}
