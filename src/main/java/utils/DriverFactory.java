package utils;

import base.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class DriverFactory
{
    public static WebDriver driver;
    public static Properties prop;
    public static Properties or;
    public static String browser;

    public static WebDriver getDriver()
    {
        // read from data.properties
        prop = new Properties();
        try {
            FileInputStream  fs = new FileInputStream("./src/main/java/conf/data.properties");
            prop.load(fs);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        // read from or.properties

        or = new Properties();
        try
        {
            FileInputStream fis = new FileInputStream("./src/main/java/conf/or.properties");
            or.load(fis);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        browser = prop.getProperty("browserName");
        if(browser.equals("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(browser.equals("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        BasePage.initPages();
        return driver;
    }

    public static void closeDriver()
    {
        driver.quit();
    }
}
