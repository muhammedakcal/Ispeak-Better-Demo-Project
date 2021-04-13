package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    public static void readProperties(String filePath) {

        try {
            FileInputStream file = new FileInputStream(filePath);
            properties = new Properties();
            properties.load(file);
            file.close();
        } catch (IOException e) {
            System.out.println("an exception occured in configreader class");
        }

    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}