package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login_page extends JFrame implements ActionListener{

    JLabel label1 , label2 , label3 ;
    JTextField text2 ;
    JPasswordField pass3 ;
    JButton b1,b2,b3;
    login_page()
    {

        super("bank managment system");

        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("images/bank.png"));
        Image image2 =image1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon image3=new ImageIcon(image2);
        JLabel image= new JLabel(image3);
        image.setBounds(350,10,100,100);
        add(image);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/card.png"));
        Image i2 =i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel ii= new JLabel(i3);
        ii.setBounds(630,350,100,100);
        add(ii);



        label1=new JLabel("WELCOME TO BANK");
        label1.setForeground(Color.white);
        label1.setFont(new Font("AventGrade",Font.BOLD,38));
        label1.setBounds(230,125,450,40);
        add(label1);

        label2 = new JLabel("card no.");
        label2.setForeground(Color.white);
        label2.setFont(new Font("Raleway",Font.BOLD,28));
        label2.setBounds(150,190,375,30);
        add(label2);


        text2=new JTextField(15);
        text2.setBounds(325,190,230, 30);
        text2.setFont(new Font("Arial",Font.BOLD,14));
        add(text2);



        label3 = new JLabel("PIN");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("ralway",Font.BOLD,28));
        label3.setBounds(150,250,375,30);
        add(label3);

        pass3 = new JPasswordField(15);
        pass3.setFont(new Font("Arial",Font.BOLD,14));
        pass3.setBounds(325,250,230,30);
        add(pass3);

        b1= new JButton("SIN IN");
        b1.setFont(new Font("Arial",Font.BOLD,14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(300,300,100,30);
        b1.addActionListener(this);
        add(b1);

        b2=new JButton("CLEAR");
        b2.setFont(new Font("Arial",Font.BOLD,14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(430,300,100,30);
        b2.addActionListener(this);
        add(b2);

        b3=new JButton("SIGN UP");
        b3.setFont(new Font("Arial",Font.BOLD,14));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(300,350,230,30);
        b3.addActionListener(this);
        add(b3);



        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("images/backbg.png"));
        Image i21 =i11.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon i31 = new ImageIcon(i21);
        JLabel iii= new JLabel(i31);
        iii.setBounds(0,0,850,480);
        add(iii);


        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
//        setUndecorated(true);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if (e.getSource()==b1) {

                conn c=new conn();
                String cardno=text2.getText().trim();
                String pin= pass3.getText().trim();
                String q="select * from login where TRIM(card_number)= '"+cardno+"' and TRIM(pin)='"+pin+"'";
                ResultSet resultSet= c.statement.executeQuery(q);

                if (resultSet.next()){
                        setVisible(false);
                        new main_transaction(pin);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid Card Number or PIN");
                }

            }
            else if(e.getSource()==b2){
                text2.setText("");
                pass3.setText("");
            }
            else if (e.getSource()==b3){

                new sign_up();
                setVisible(false);
            }

        }
        catch (Exception E)
        {
            E.printStackTrace();
        }
    }

    public static void main(String [] args){
       new login_page();
}

}
