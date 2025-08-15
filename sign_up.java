package bank.managment.system;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class sign_up extends JFrame implements ActionListener{

    JTextField text1,text2,text3,text4,text5,text6,text7,text8;
    JRadioButton r1,r2,r3,r4;
    JDateChooser datechooser;
    JButton nextButton;
    Random ran = new Random();
    long f4= (ran.nextLong() % 9000L)+1000L;
    String f= "" +Math.abs(f4);

    sign_up(){

        super("APPLICATION FORM");

        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("images/bank.png"));
        Image image2 =image1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon image3=new ImageIcon(image2);
        JLabel image= new JLabel(image3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel L1= new JLabel("APPLICATION FORM N0: "+f);
        L1.setBounds(160,20,600,40);
        L1.setFont(new Font("Raleway",Font.BOLD,38));
        add(L1);

        JLabel L2= new JLabel("Page1");
        L2.setFont(new Font("Raleway",Font.BOLD,22));
        L2.setBounds(330,70,600,30);
        add(L2);

        JLabel L3=new JLabel("PERSONAL DETAILS");
        L3.setBounds(290 ,100 ,600 ,30);
        L3.setFont(new Font("Raleway",Font.BOLD,22));
        add(L3);

        JLabel LT1=new JLabel("Name: ");
        LT1.setBounds(100 ,190 ,100 ,30);
        LT1.setFont(new Font("Raleway",Font.BOLD,22));
        add(LT1);

        text1 = new JTextField();
        text1.setFont(new Font("Raleway",Font.BOLD,14));
        text1.setBounds(300,190,400,30);
        add(text1);

        JLabel LT2=new JLabel("Father Name: ");
        LT2.setBounds(100 ,240 ,200 ,30);
        LT2.setFont(new Font("Raleway",Font.BOLD,22));
        add(LT2);

        text2 = new JTextField();
        text2.setFont(new Font("Raleway",Font.BOLD,14));
        text2.setBounds(300,240,400,30);
        add(text2);

        JLabel LT3=new JLabel("Date of Birth: ");
        LT3.setBounds(100 ,340 ,200 ,30);
        LT3.setFont(new Font("Raleway",Font.BOLD,20));
        add(LT3);

        datechooser = new JDateChooser();
        datechooser.setForeground(new Color(105,105,105));
        datechooser.setBounds(300,340,400,30);
        add(datechooser);

        JLabel LT4=new JLabel("Gender: ");
        LT4.setBounds(100 ,290 ,200 ,30);
        LT4.setFont(new Font("Raleway",Font.BOLD,20));
        add(LT4);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,290,90,30);
        add(r2);

        ButtonGroup BG= new ButtonGroup();
        BG.add(r1);
        BG.add(r2);

        JLabel LT5 =new JLabel("Marital Status: ");
        LT5.setFont(new Font("Raleway",Font.BOLD,14));
        LT5.setBounds(100,390,200,30);
        add(LT5);

        r3 = new JRadioButton("Married");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(222,255,228));
        r3.setBounds(300,390,100,30);
        add(r3);

        r4 = new JRadioButton("Unmarried");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(new Color(222,255,228));
        r4.setBounds(450,390,100,30);
        add(r4);

        ButtonGroup BG1= new ButtonGroup();
        BG1.add(r3);
        BG1.add(r4);

        JLabel LT6 =new JLabel("Email Address: ");
        LT6.setFont(new Font("Raleway",Font.BOLD,14));
        LT6.setBounds(100,440,200,30);
        add(LT6);

        text4 = new JTextField();
        text4.setFont(new Font("Raleway",Font.BOLD,14));
        text4.setBounds(300,440,400,30);
        add(text4);

        JLabel LT7 =new JLabel("Address: ");
        LT7.setFont(new Font("Raleway",Font.BOLD,14));
        LT7.setBounds(100,490,200,30);
        add(LT7);

        text5 = new JTextField();
        text5.setFont(new Font("Raleway",Font.BOLD,14));
        text5.setBounds(300,490,400,30);
        add(text5);

        JLabel LT8 =new JLabel("City: ");
        LT8.setFont(new Font("Raleway",Font.BOLD,14));
        LT8.setBounds(100,540,200,30);
        add(LT8);

        text6 = new JTextField();
        text6.setFont(new Font("Raleway",Font.BOLD,14));
        text6.setBounds(300,540,400,30);
        add(text6);

        JLabel LT9 =new JLabel("PIN CODE: ");
        LT9.setFont(new Font("Raleway",Font.BOLD,14));
        LT9.setBounds(100,590,200,30);
        add(LT9);

        text7 = new JTextField();
        text7.setFont(new Font("Raleway",Font.BOLD,14));
        text7.setBounds(300,590,400,30);
        add(text7);

        JLabel LT10 =new JLabel("State: ");
        LT10.setFont(new Font("Raleway",Font.BOLD,14));
        LT10.setBounds(100,640,200,30);
        add(LT10);

        text8 = new JTextField();
        text8.setFont(new Font("Raleway",Font.BOLD,14));
        text8.setBounds(300,640,400,30);
        add(text8);

        nextButton = new JButton("NEXT");
        nextButton.setFont(new Font("Raleway",Font.BOLD,14));
        nextButton.setBackground(Color.black);
        nextButton.setForeground(Color.WHITE);
        nextButton.setBounds(620,710,80,30);
        nextButton.addActionListener(this);
        add(nextButton);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno= f;
        String name=text1.getText();
        String fname=text2.getText();
        String dob= ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(r1.isSelected()){
            gender="Male";
        }
        else if(r2.isSelected()){
            gender="Female";
        }
        String email=text4.getText();
        String marital=null;
        if (r3.isSelected()){
            marital="Married";
        }
        else if (r4.isSelected()){
            marital="Unmarried";
        }
        String address=text5.getText();
        String city=text6.getText();
        String pincode=text7.getText();
        String state=text8.getText();

        try{
            if (text1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }
            else {
                    conn con1 = new conn();
                String q = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new sign_up2(f);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String [] args){
        new sign_up();
    }
}
