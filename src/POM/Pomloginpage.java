package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Pomloginpage {
@FindBy(how = How.ID,using = "username") // (@Find by) Page factory class in build in Selenium
    public static WebElement username;
@FindBy(id="password")
    public static WebElement password;
@FindBy(id="submit")
    public static WebElement submit;



     //basic pom structure
    /*public static WebElement username(WebDriver driver){
        return driver.findElement(By.id("username"));
    }
    public static WebElement password(WebDriver driver){
        return driver.findElement(By.id("password"));
    }
    public static WebElement submit(WebDriver driver){
        return driver.findElement(By.id("submit"));
    }*/
}
