package learn_exceptions.learn_properties;

import java.util.Properties;

public class TestConfig {
    public static void main(String[] args) {
        Properties p = Config.loadProperties();
        System.out.println(p.getProperty("username"));
    }
}
