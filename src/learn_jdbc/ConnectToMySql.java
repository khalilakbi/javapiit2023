package learn_jdbc;

import learn_exceptions.learn_properties.Config;

import java.sql.*;

public class ConnectToMySql {
    public static Connection connection;
    public static Statement statement;
    public static ResultSet resultSet;

    public static Connection setConnection(){
        String driver = Config.loadProperties().getProperty("driver");
        String host = Config.loadProperties().getProperty("host");
        String username = Config.loadProperties().getProperty("username");
        String password = Config.loadProperties().getProperty("password");
        try{
            Class.forName(driver);
            connection = DriverManager.getConnection(host,username,password);
        }catch (ClassNotFoundException | SQLException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("you are connected to mysql");
        return connection;
    }


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
   setConnection();
//        String url = "jdbc:mysql://localhost:3306/classicmodels";
//        String username = "root";
//        String password = "Lilakh18@";
//
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection connection = DriverManager.getConnection(url,username,password);
//        Statement statement = connection.createStatement();
//        ResultSet result = statement.executeQuery("Select * from customers;");
//        while (result.next()){
//            System.out.println(result.getString(2)+" "+result.getString(3));
//        }



    }
}
