package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class loginWithoutFindbyAndTestby {
    String path = "C:\\Users\\n509255\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe";
    public static WebElement username;
    public static WebElement password;
    public static WebElement submit;
@Test
    public void login(){
        System.setProperty("Webdriver.Edge.driver",path);
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
        PageFactory.initElements(driver,loginWithoutFindbyAndTestby.class);
        username.sendKeys("student");
        password.sendKeys("Password123");
        submit.click();
    }
}

