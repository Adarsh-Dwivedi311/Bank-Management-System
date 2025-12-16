package Bank.Management.System;


import java.sql.*;

public class Conn {
    Connection connection;
    public Statement statement;

    public Conn(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","ADARSH00");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
