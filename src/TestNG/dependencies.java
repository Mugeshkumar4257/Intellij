package TestNG;

import org.testng.annotations.Test;

public class dependencies {

    @Test
    public void sslc(){
        System.out.println("Cleared 10");
    }
    @Test(dependsOnMethods = "sslc")
    public void hsc(){
        System.out.println("cleared 12");
    }
    @Test(dependsOnMethods = "hsc")
    public void admission(){
        System.out.println("Can get the engineering admission");
    }
}
