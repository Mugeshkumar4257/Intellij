
package Datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
public class login {

    /*correct username - correct password
    correct username - wrong password
    wrong username - wrong password
    wrong  username - correct password*/
    String path = "C:\\Users\\n509255\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe";
    WebDriver driver ;
    WebElement user,passwo,button;
    String [][] data = {
            {"student","Password123"},
            {"stude","Password12"},
            {"student","Password12"},
            {"stude","Password123"},
    };

    @DataProvider (name = "logindata")
    public String[][] datalofinprovider(){
        return data;

    }
    @Test(dataProvider = "logindata")

    public void login(String uname,String psword){
        System.setProperty("Webdriver.Edge.driver", path );
        driver = new EdgeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        user = driver.findElement(By.id("username"));
        user.sendKeys(uname);
        passwo = driver.findElement(By.id("password"));
        passwo.sendKeys(psword);
        button = driver.findElement(By.id("submit"));
        button.click();
        driver.quit();

    }

}
