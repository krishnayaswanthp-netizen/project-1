package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class withdrawl extends JFrame implements ActionListener {
    String pin;
    TextField text1;
    JButton b1,b2;

    withdrawl(String pin){

        this.pin=pin;
        ImageIcon image1= new ImageIcon(ClassLoader.getSystemResource("images/atm2.png"));
        Image image2=image1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon image3= new ImageIcon(image2);
        JLabel image =new JLabel(image3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel l1=new JLabel("MAXIMUM WITHDRAWL IS 10,000");
        l1.setFont(new Font("System",Font.BOLD,16));
        l1.setForeground(Color.WHITE);
        l1.setBounds(460,180,700,35);
        image.add(l1);

        JLabel l2=new JLabel("PLEASE ENTER YOUR AMOUNT");
        l2.setFont(new Font("System",Font.BOLD,16));
        l2.setForeground(Color.WHITE);
        l2.setBounds(460,220,400,35);
        image.add(l2);

        text1= new TextField();
        text1.setBounds(460,260,320,25);
        text1.setFont(new Font("raleway",Font.BOLD,22));
        text1.setBackground(new Color(65,125,128));
        text1.setForeground(Color.WHITE);
        image.add(text1);

        b1=new JButton("WITHDRAWL");
        b1.setBounds(700,362,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        image.add(b1);

        b2=new JButton("Back");
        b2.setBounds(700,406,150,35);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        image.add(b2);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){

        try{
            String amount=text1.getText();
            Date date =new Date();
            if(text1.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please enter the amount you want to withdraw");
        }
            else {
                conn c=new conn();
                ResultSet resultSet=c.statement.executeQuery("select * from bank where TRIM(pin)='"+pin+"'");
                int balance=0;
                while(resultSet.next()){
                    if (resultSet.getString("type").equals("Deposit")) {
                        balance += Integer.parseInt(resultSet.getString("amount"));

                    } else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }
                if (balance<Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"INSUFFICIENT BALANCE");
                    return;
                }
                c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Withdrawl','"+amount+"')");
                JOptionPane.showMessageDialog(null,"Rs: "+amount+" Debited successfully");
                setVisible(false);
                new main_transaction(pin);
            }
        } catch (Exception E) {
            E.printStackTrace();

        }
        } else if (e.getSource()==b2) {
            setVisible(false);
            new main_transaction(pin);
            
        }
        {
            
        }

    }

    public static void main(String[] args) {
        new withdrawl("");
    }
}
