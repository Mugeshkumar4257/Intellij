package Datadriven;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/*steps with JXL JARS (download jar)  ----> NOTE: 97-2003 save format of excel sheet
* 1. File location
* 2. Get Workbook
* 3. get sheet
* 4.get rows
* 5.get columns
* 6. iterate and get the contents from the cell*/

public class Extractdatafromfile {

    String [][] data = null;

    @DataProvider(name ="logindata")
    public String[][] publicloginprovider() throws BiffException, IOException {
        data = getexceldata();
        return data;

    }

    public String[][] getexceldata() throws IOException, BiffException {
        FileInputStream excel = new FileInputStream("C:\\Users\\n509255\\Downloads\\file.xlt");
        Workbook workbook = Workbook.getWorkbook(excel);
        Sheet sheet = workbook.getSheet(0);
        int rows = sheet.getRows();
        int columns = sheet.getColumns();

        String testdata[][] = new String[rows-1][columns];
        for(int i =1 ; i<rows;i++){
            for(int j=0;j<columns;j++){
                testdata[i-1][j] = sheet.getCell(j,i).getContents();
            }

        }
        return testdata;

    }

    String path = "C:\\Users\\n509255\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe";
    @Test(dataProvider = "logindata")
    public void loginpage(String uname, String psward){
        System.setProperty("Webdriver.Edge.driver",path);
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
        WebElement name = driver.findElement(By.id("username"));
        name.sendKeys(uname);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(psward);
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();
        driver.quit();

    }
}
