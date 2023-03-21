package learn_jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.*;

public class ConnectToDB {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        String path = System.getProperty("user.dir") + File.separator + "resources"+ File.separator+"config.properties";

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(path);
        prop.load(fis);
        String username = prop.getProperty("host");
        System.out.println(username);
        Connection conn;
        Statement statement;
        ResultSet resultSet;
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","");
        statement = conn.createStatement();
        resultSet = statement.executeQuery("SELECT customerName,contactLastName FROM customers limit 10;");
        List<String> allFirstNAme  = new ArrayList<>();

         while (resultSet.next()){
            allFirstNAme.add(resultSet.getString(1));
        }
        System.out.println(allFirstNAme);
    }

}
