package library;

import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LearningProperty {

    Properties property;
    FileInputStream fs;
    @Test
    public void testProperty() throws IOException {
        property = new Properties();

        fs = new FileInputStream(System.getProperty("user.dir")+"\\config.properties");

        property.load(fs);

        System.out.println(property.getProperty("name"));
        System.out.println(property.getProperty("url"));
        System.out.println(property.getProperty("browser"));
        System.out.println(property.getProperty("version"));
    }
}
