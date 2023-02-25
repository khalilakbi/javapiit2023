package learn_exceptions.learn_properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static final String path = System.getProperty("user.dir") + File.separator + "resources" + File.separator
            + "config.properties";
    static Properties prop;

    public static Properties loadProperties() {
        prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream(path);
            prop.load(fis);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return prop;
    }


    public static void main(String[] args) {
        Properties p = loadProperties();
        System.out.println(p.getProperty("username"));
//        String path = System.getProperty("user.dir") + File.separator + "resources" + File.separator + "config.properties";
//        System.out.println(path);
//        Properties prop = new Properties();
//        try{
//            FileInputStream fis = new FileInputStream(path);
//            prop.load(fis);
//        }catch (IOException ex){
//            System.out.println(ex.getMessage());
//        }
//
//        System.out.println(prop.getProperty("username"));
//        System.out.println(prop.getProperty("password"));
//
    }
}
