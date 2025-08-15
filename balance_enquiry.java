package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class balance_enqiury extends JFrame implements ActionListener {
    String pin;
    JLabel l2;
    JButton b1;
    balance_enqiury(String pin){

        this.pin=pin;

        ImageIcon image1= new ImageIcon(ClassLoader.getSystemResource("images/atm2.png"));
        Image image2=image1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon image3= new ImageIcon(image2);
        JLabel image =new JLabel(image3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel l1=new JLabel("YOUR CURRENT BALANCE IS: ");
        l1.setFont(new Font("System",Font.BOLD,16));
        l1.setForeground(Color.WHITE);
        l1.setBounds(430,180,700,35);
        image.add(l1);

        l2=new JLabel();
        l2.setFont(new Font("System",Font.BOLD,16));
        l2.setForeground(Color.WHITE);
        l2.setBounds(430,220,400,35);
        image.add(l2);

        b1=new JButton("BACK");
        b1.setBounds(700,406,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        image.add(b1);

        int balance =0;

        try{
            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery("Select * from bank where pin = '"+pin+"'");
            while (resultSet.next()){
                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        l2.setText(""+balance);


        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        setVisible(false);
        new main_transaction(pin);

    }

    public static void main(String[] args) {
        new balance_enqiury("");
    }
}
