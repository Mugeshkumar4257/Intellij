package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Paralleltesting {

    String path = "C:\\Users\\n509255\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe";
    WebDriver driver;

    @BeforeSuite
    public void before(){
        System.setProperty("webdriver.edge.driver",path);
        driver = new EdgeDriver();
    }
    @Test
    public void Opengoogle(){
        driver.get("https://www.google.com");
}
   @Test
   public void openbing(){
    driver.get("https://www.bing.com");
}
    @AfterSuite
    public void end(){
    driver.quit();
}


}
