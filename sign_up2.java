package bank.managment.system;

import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sign_up2 extends JFrame implements ActionListener {

    String formno;
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField text1,text2,text3;
    JButton next;
    JRadioButton R1,R2,R3,R4,R5,R6;


    public sign_up2(String formno){
        super("APPLICATION FORM");
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("images/bank.png"));
        Image image2 =image1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon image3=new ImageIcon(image2);
        JLabel image= new JLabel(image3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno=formno;

        JLabel l1=new JLabel("Page2:- ");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2=new JLabel("Additional details:- ");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3=new JLabel("religion :- ");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion[]={"Hindu","Muslim","Christian","Sikh","Other",};
        comboBox=new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel l4=new JLabel("Category :- ");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,170,150,30);
        add(l4);

        String Category[]={"general","OBC","BC","SC","ST","Other"};
        comboBox2=new JComboBox(Category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel l5=new JLabel("Income :- ");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String income[]={"NULL","<1,50,000","<2,50,000","<5,00,000","upto 10,00,000","Above 10,00,000"};
        comboBox3=new JComboBox(income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel l6=new JLabel("Educational :- ");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(100,270,150,30);
        add(l6);

        String edu[]={"NON-Graduate","Gradute","Post-Gradute","doctrate","Others"};
        comboBox4=new JComboBox(edu);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        JLabel l7=new JLabel("Occupation :- ");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(100,340,150,30);
        add(l7);

        String Occ[]={"Salaried","Self-employyed","Bussiness","Student","Retired","Others"};
        comboBox5=new JComboBox(Occ);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,340,320,30);
        add(comboBox5);

        JLabel l8=new JLabel("PAN NO :- ");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,390,150,30);
        add(l8);

        text1 =new JTextField();
        text1.setFont(new Font("Raleway",Font.BOLD,18));
        text1.setBounds(350,390,320,30);
        add(text1);

        JLabel l9=new JLabel("ADHAR NO :- ");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(100,440,150,30);
        add(l9);

        text2=new JTextField();
        text2.setFont(new Font("Raleway",Font.BOLD,18));
        text2.setBounds(350,440,320,30);
        add(text2);

        JLabel l10=new JLabel("Senior citizen :- ");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setBounds(100,490,150,30);
        add(l10);

        R1=new JRadioButton("Yes");
        R1.setFont(new Font("Raleway",Font.BOLD,14));
        R1.setBackground(new Color(252,208,76));
        R1.setBounds(350,490,100,30);
        add(R1);

        R2=new JRadioButton("No");
        R2.setFont(new Font("Raleway",Font.BOLD,14));
        R2.setBackground(new Color(252,208,76));
        R2.setBounds(460,490,100,30);
        add(R2);
        ButtonGroup BG= new ButtonGroup();
        BG.add(R1);
        BG.add(R2);

        JLabel l11=new JLabel("Existing Account :- ");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,540,200,30);
        add(l11);

        R3=new JRadioButton("Yes");
        R3.setFont(new Font("Raleway",Font.BOLD,14));
        R3.setBackground(new Color(252,208,76));
        R3.setBounds(350,540,100,30);
        add(R3);

        R4=new JRadioButton("No");
        R4.setFont(new Font("Raleway",Font.BOLD,14));
        R4.setBackground(new Color(252,208,76));
        R4.setBounds(460,540,100,30);
        add(R4);
        ButtonGroup BG1= new ButtonGroup();
        BG1.add(R3);
        BG1.add(R4);


        JLabel l12=new JLabel("Form No :- ");
        l12.setFont(new Font("Raleway",Font.BOLD,18));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13=new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,14));
        l13.setBounds(760,10,60,30);
        add(l13);

        next=new JButton("NEXT");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);


        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252, 208, 76));

        setVisible(true);
     }

    @Override
    public void actionPerformed(ActionEvent e) {

        String religion= (String) comboBox.getSelectedItem();
        String category= (String) comboBox2.getSelectedItem();
        String income= (String) comboBox3.getSelectedItem();
        String education= (String) comboBox4.getSelectedItem();
        String occupation= (String) comboBox5.getSelectedItem();
        String pan=(String) text1.getText();
        String aadhar=(String) text1.getText();

        String scitizen=null;
        if(R1.isSelected()){
            scitizen="Yes";
        }
        else if(R2.isSelected()){
            scitizen="No";
        }
        String eaccount=null;
        if(R3.isSelected()){
            eaccount="Yes";
        }
        else if(R4.isSelected()){
            eaccount="No";
        }
        try {
            if(text1.getText().equals("") || text2.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }
            else {
                 conn c1= new conn();
                 String q= "insert into sign_up2 values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eaccount+"')";
                 c1.statement.executeUpdate(q);
                 new sign_up3(formno);
                 setVisible(false);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String [] args){
        new sign_up2("");
    }
}
