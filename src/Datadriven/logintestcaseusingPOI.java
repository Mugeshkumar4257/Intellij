package Datadriven;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*HSSF ---> excel 2003
XSSF ---> excel 2007 or later
XSSF Workbook and HSSF Workbook ---> Excelworkbook */



public class logintestcaseusingPOI {
    String path = "C:\\Users\\n509255\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe";

    static List<String> usernameList = new ArrayList<String>();
    static List<String> passwordList = new ArrayList<String>();


    public void readExcel() throws IOException {
        FileInputStream excel = new FileInputStream("C:\\Users\\n509255\\Downloads\\file1.xlt");
        Workbook workbook = new HSSFWorkbook(excel);
        Sheet sheet = workbook.getSheetAt(0);
        Iterator<Row> rowIterator = sheet.iterator();

        while(rowIterator.hasNext()) {
            Row Rowvalue = rowIterator.next();

            Iterator<Cell> columnIterator = Rowvalue.iterator();
            int i = 2;
            while (columnIterator.hasNext()) {
                if (i % 2 == 0) {
                    //Cell username = columnIterator.next();
                    usernameList.add(columnIterator.next().toString());

                } else {
                    // Cell password = columnIterator.next();
                    passwordList.add(columnIterator.next().toString());
                }
                i++;
            }

        }}

        public void login(String uname,String psward){
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

public void executetest(){
        for (int i=0 ;i< usernameList.size();i++){
            login(usernameList.get(i),passwordList.get(i));
        }
}

public static void main(String[] args) throws IOException {

    logintestcaseusingPOI usingPOI = new logintestcaseusingPOI();
    usingPOI.readExcel();
    System.out.println(usernameList);
    System.out.println(passwordList);
    usingPOI.executetest();
}}


