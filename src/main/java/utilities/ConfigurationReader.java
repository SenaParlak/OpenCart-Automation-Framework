package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static final Properties properties = new Properties();

    static{
        try {
            FileInputStream file = new FileInputStream("src/test/resources/configuration.properties");
            properties.load(file);
        } catch (IOException e) {
            throw new RuntimeException("Could not load configuration.properties", e);
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
