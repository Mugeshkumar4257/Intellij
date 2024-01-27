package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Suite {
    // open google chrome 1. google .co.in 2. bing.com 3. yahoo.com and close the browser
    String path = "C:\\Users\\n509255\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe";
    WebDriver driver ;
    long Starttime,endtime,time;

    @BeforeSuite
    public void open(){
        Starttime= System.currentTimeMillis();
        System.setProperty("webdriver.edge.driver",path);
        driver = new EdgeDriver();
    }
     @Test
    public void google(){
        driver.get("https://www.google.com");
    }

    @Test
    public void bing(){
        driver.get("https://www.bing.com");
    }

    @Test
    public void yahoo(){
        driver.get("https://www.yahoo.com");
    }

    @AfterSuite
    public void close(){
         driver.quit();
         endtime = System.currentTimeMillis();
         time = endtime - Starttime ;
        System.out.println(time);
    }

}




