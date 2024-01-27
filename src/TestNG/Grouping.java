package TestNG;

import org.testng.annotations.Test;

public class Grouping {

    @Test(groups = {"Apple"})
    public void apple1(){
        System.out.println("Apple run success");
    }
    @Test(groups = {"Apple"})
    public void apple2(){
        System.out.println("Apple run success");
    }
    @Test(groups = {"Vivo"})
    public void vivo1(){
        System.out.println("vivo1 run success");
    }
    @Test(groups = {"vivo"})
    public void vivo2(){
        System.out.println("vivo2 run success");
    }
    @Test(groups = {"Moto"})
    public void moto1(){
        System.out.println("moto1 run success");
    }
    @Test(groups = {"Moto"})
    public void moto2(){
        System.out.println("moto2 run success");
    }
    @Test(groups = {"lenovo"})
    public void lenovo1(){
        System.out.println("lenovo1 run success");
    }
    @Test(groups = {"lenovo"})
    public void lenovo2(){
        System.out.println("lenovo2 run success");
    }
}
