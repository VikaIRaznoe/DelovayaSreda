package ru.delovayasreda;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.delovayasreda.utills.FileReader;

import java.util.concurrent.TimeUnit;

public class BaseTest
{

    public static WebDriver driver;
    public static WebDriverWait webDriverWait;
    private static final String WEBDRIVER_SETTINGS_ADDRESS = "settings.properties";
    private static final String TIMEOUT = FileReader.getPropertyFromFile(WEBDRIVER_SETTINGS_ADDRESS,
            "timeout");

    @BeforeClass
    public void tearUp(){
        driver = new SafariDriver();
        driver.manage().timeouts().implicitlyWait(Integer.parseInt(TIMEOUT), TimeUnit.SECONDS);
        driver.manage().window().maximize();
        webDriverWait = new WebDriverWait(driver,Integer.parseInt(TIMEOUT));
        driver.get("https://mail.ru");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}

