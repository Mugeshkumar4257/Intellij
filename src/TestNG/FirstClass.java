package TestNG;
import org.testng.annotations.Test;

public class FirstClass {

    @Test (priority = 0)
    public void start ()
    {

        System.out.println("Start the car");
    }



    /*@Test(priority = 4,enabled = false)
    public void music (){
        System.out.println("turn on the music");
    }
    @Test(priority = 1)
    public void firstgear(){
        System.out.println("first gear");
    }
    @Test(priority = 2)
    public void secondgear(){
        System.out.println("second gear");
    }
    @Test(priority = 3)
    public void thirdgear(){
        System.out.println("third gear");
    }*/
}


