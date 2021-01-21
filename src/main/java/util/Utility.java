package util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.*;
import java.net.URL;
import java.util.Properties;

public class Utility {

    private static ObjectMapper JSONMapper = new ObjectMapper();

    private static XmlMapper XMLMapper = new XmlMapper();

    private static ClassLoader classLoader = Utility.class.getClassLoader();

    private static Properties envProperties = new Properties();

    private static WebDriver driver;

    static {
        try(FileInputStream stream = new FileInputStream(getResource("environment.properties"))) {
            envProperties.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static File getResource(String resourcePath) {
        URL path = classLoader.getResource(resourcePath);
        assert path != null;
        return new File(path.getPath());
    }

    public static ObjectMapper getJSONMapper() {
        return JSONMapper;
    }

    public static XmlMapper getXMLMapper() {
        return XMLMapper;
    }

    public static File getParametersFile() {
        String path = getProperty("data.path");
        return getResource(path);
    }

    public static String getProperty(String key) {
        return envProperties.getProperty(key);
    }

    public static WebDriver getDriver() {
        if(driver == null) {
            driver = new InternetExplorerDriver();
        }
        return driver;
    }
}
