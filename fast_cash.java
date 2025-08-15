package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class fast_cash extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    fast_cash(String pin){
        this.pin=pin;

        ImageIcon image= new ImageIcon(ClassLoader.getSystemResource("images/atm2.png"));
        Image image1= image.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon image2= new ImageIcon(image1);
        JLabel image3= new JLabel(image2);
        image3.setBounds(0,0,1550,830);
        add(image3);

        JLabel l1= new JLabel("SELECT WITHDRAWL AMOUNT");
        l1.setBounds(445,180,700,35);
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Raleway",Font.BOLD,24));
        image3.add(l1);

        b1= new JButton("Rs.100");
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(65,125,128));
        b1.setBounds(410,274,150,35);
//        b1.setFont(new Font("Raleway",Font.BOLD,15));
        b1.addActionListener(this);
        image3.add(b1);

        b2= new JButton("Rs.500");
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65,125,128));
        b2.setBounds(700,274,150,35);
//        b2.setFont(new Font("Raleway",Font.BOLD,15));
        b2.addActionListener(this);
        image3.add(b2);


        b3= new JButton("Rs.1000");
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(65,125,128));
        b3.setBounds(410,318,150,35);
//        b3.setFont(new Font("Raleway",Font.BOLD,15));
        b3.addActionListener(this);
        image3.add(b3);


        b4= new JButton("Rs.2000");
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(65,125,128));
        b4.setBounds(700,318,150,35);
//        b4.setFont(new Font("Raleway",Font.BOLD,15));
        b4.addActionListener(this);
        image3.add(b4);


        b5= new JButton("Rs.5000");
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(65,125,128));
        b5.setBounds(410,362,150,35);
//        b5.setFont(new Font("Raleway",Font.BOLD,15));
        b5.addActionListener(this);
        image3.add(b5);


        b6= new JButton("Rs.10000");
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(65,125,128));
        b6.setBounds(700,362,150,35);
//        b6.setFont(new Font("Raleway",Font.BOLD,15));
        b6.addActionListener(this);
        image3.add(b6);


        b7= new JButton("BACK");
        b7.setForeground(Color.WHITE);
        b7.setBackground(new Color(65,125,128));
        b7.setBounds(700,406,150,35);
//        b7.setFont(new Font("Raleway",Font.BOLD,15));
        b7.addActionListener(this);
        image3.add(b7);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }
//
    @Override
    public void actionPerformed(ActionEvent e) {
                if(e.getSource()==b7){
                    setVisible(false);
                    new main_transaction(pin);
                }
                else{
                    String amount= ((JButton)e.getSource()).getText().substring(3);
                    conn c= new conn();
                    Date date=new Date();
        try {
            ResultSet resultSet=c.statement.executeQuery("select * from bank where TRIM(pin)='"+pin+"'");
            int balance=0;
            while (resultSet.next()){
                if (resultSet.getString("type").equals("Deposit")){
                        balance+=Integer.parseInt(resultSet.getString("amount"));
                }
                else {
                    balance-=Integer.parseInt(resultSet.getString("amount"));
                }
            }

                if (e.getSource()!=b7 && balance<Integer.parseInt(amount)){
                            JOptionPane.showMessageDialog(null,"INSUFFICIENT BALANCE");
                            return;
            }
                c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Withdrawl','"+amount+"')");
                JOptionPane.showMessageDialog(null,"Rs"+amount+" Debited Successfully");
        }
        catch (Exception ex) {
            ex.printStackTrace();
                }

        setVisible(false);
        new main_transaction(pin);
                }
    }

    public static void main(String[] args) {
        new fast_cash("");
    }
}
