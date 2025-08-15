package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {

    String pin;
    TextField text1;
    JButton b1,b2;

    Deposit(String pin){

        this.pin=pin;
        ImageIcon image1= new ImageIcon(ClassLoader.getSystemResource("images/atm2.png"));
        Image image2=image1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon image3= new ImageIcon(image2);
        JLabel image =new JLabel(image3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel l1=new JLabel("ENTER THE AMOUNT YOU WANT TO DEPOSITE");
        l1.setFont(new Font("System",Font.BOLD,16));
        l1.setForeground(Color.WHITE);
        l1.setBounds(460,180,400,35);
        image.add(l1);

        text1= new TextField();
        text1.setBounds(460,230,320,25);
        text1.setFont(new Font("raleway",Font.BOLD,22));
        text1.setBackground(new Color(65,125,128));
        text1.setForeground(Color.WHITE);
        image.add(text1);

        b1=new JButton("Deposit");
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
        try {
            String amount = text1.getText();
            Date date = new Date();
        if(e.getSource()==b1){
                    if(text1.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"please enter the amount you want to deposit");
                    }
                    else {
                        conn c1=new conn();
                        c1.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");
                        JOptionPane.showMessageDialog(null,"Rs." +amount+" Deposited Successfully");
                        setVisible(false);
                        new main_transaction(pin);
                    }

            } else if (e.getSource()==b2) {
                    setVisible(false);
                    new main_transaction(pin);
        }
        } catch (Exception E) {
            E.printStackTrace();

        }

    }

    public static void main(String[] args) {

        new Deposit("");
    }

}
