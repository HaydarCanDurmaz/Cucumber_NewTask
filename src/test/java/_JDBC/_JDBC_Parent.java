package _JDBC;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class _JDBC_Parent {
    public static Connection connection;
    public static Statement statement;
    @BeforeClass
    public  void  DBConnectionsOpen(){

        String hostUrl = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";

        try {
            connection = DriverManager.getConnection(hostUrl,username,password);
            statement = connection.createStatement();

        }catch (Exception e)
        {
            System.out.println("e = " + e.getMessage());
        }
    }
    @AfterClass
    public  void  DBConnectionsClose(){
        try {
            connection.close();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

}
