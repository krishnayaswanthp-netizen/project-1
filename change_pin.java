package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class change_pin extends JFrame implements ActionListener {
    String pin;
    JTextField text1;
    JButton b1,b2;
    JPasswordField p1,p2;

    change_pin(String pin){

        this.pin=pin;

        ImageIcon image1= new ImageIcon(ClassLoader.getSystemResource("images/atm2.png"));
        Image image2=image1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon image3= new ImageIcon(image2);
        JLabel image =new JLabel(image3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel l1=new JLabel("CHANGE YOUR PIN");
        l1.setFont(new Font("System",Font.BOLD,16));
        l1.setForeground(Color.WHITE);
        l1.setBounds(430,180,400,35);
        image.add(l1);

        JLabel l2=new JLabel("NEW PIN:");
        l2.setFont(new Font("System",Font.BOLD,16));
        l2.setForeground(Color.WHITE);
        l2.setBounds(430,220,150,35);
        image.add(l2);

        text1=new JTextField();
        text1.setBounds(600,220,180,25);
        text1.setFont(new Font("raleway",Font.BOLD,22));
        text1.setBackground(new Color(65,125,128));
        text1.setForeground(Color.WHITE);
        image.add(text1);

        JLabel l3=new JLabel("Re-Enter New PIN:");
        l3.setFont(new Font("System",Font.BOLD,16));
        l3.setForeground(Color.WHITE);
        l3.setBounds(430,250,400,35);
        image.add(l3);


        p2=new JPasswordField();
        p2.setBounds(600,255,180,25);
        p2.setFont(new Font("raleway",Font.BOLD,22));
        p2.setBackground(new Color(65,125,128));
        p2.setForeground(Color.WHITE);
        image.add(p2);

        b1=new JButton("CHANGE");
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
            String pin1 = text1.getText();
            String pin2 = p2.getText();
            if(!pin1.equals(pin2)){
                    JOptionPane.showMessageDialog(null,"Entered PIN Does Not Match");
                    return;
            }
            if(e.getSource()==b1){
                if(text1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Entered New PIN");
                    return;
                }
                if(p2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Re-Entered PIN");
                    return;
                }
                conn c=new conn();
                String q1="update bank set pin='"+pin1+"' where pin='"+pin+"'";
                String q2="update login set pin='"+pin1+"' where pin='"+pin+"'";
                String q3="update sign_up3 set pin='"+pin1+"' where pin='"+pin+"'";
                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null,"PIN Has Been Changed Successfully");
                setVisible(false);
                new main_transaction(pin);
            } else if (e.getSource()==b2) {
                setVisible(false);
                new main_transaction(pin);
                
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new change_pin("");
    }
}
