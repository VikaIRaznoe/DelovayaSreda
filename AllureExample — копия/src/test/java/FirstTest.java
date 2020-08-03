import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new SafariDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get("https://demo.nopcommerce.com/");
        driver.get("https://mail.ru");
        driver.manage().window().maximize();
    }

    @Test
    public void test(){
       WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Создать почту')] "));
       element.click();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
