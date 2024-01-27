package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class loginPage {
    String path = "C:\\Users\\n509255\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe";
    WebDriver driver;
    @Test
    public void log(){
        System.setProperty("Webdriver.Edge.driver",path);
        driver = new EdgeDriver();
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();

        PageFactory.initElements(driver,Pomloginpage.class);
        Pomloginpage.username.sendKeys("student");
        Pomloginpage.password.sendKeys("Password123");
        Pomloginpage.submit.click();

        // --> used when static is not there to create objects
        /*Pomloginpage pomloginpage = new Pomloginpage();*/

        //basic pom structure
        /*Pomloginpage.username(driver).sendKeys("student");
        Pomloginpage.password(driver).sendKeys("Password123");
        Pomloginpage.submit(driver).click();*/

        // basic code
        /*WebElement name = driver.findElement(By.id("username"));
        name.sendKeys("student");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password123");
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();*/

    }

}
