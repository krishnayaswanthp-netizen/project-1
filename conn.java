package bank.managment.system;
import java.sql.*;

public class conn {

    Connection connection;
    Statement statement;
    public conn(){

    try{
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/BankSystem","root","Bunny@2005");
        statement=connection.createStatement();
    }
    catch(Exception e){
        e.printStackTrace();
    }
}

}