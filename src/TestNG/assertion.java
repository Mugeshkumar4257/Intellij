
package TestNG;


import org.testng.Assert;
import org.testng.annotations.Test;

public class assertion {
    String  name = "Mugesh";
    boolean value = false;
    @Test
    public void checkvalue(){
        /*if(name.equals("Mugesh")){
            System.out.println("value matches");
    }else System.out.println("value does not match");*/
        Assert.assertEquals(name,"Mugesh");
        Assert.assertNotEquals(name,"ugesh");
        Assert.assertFalse(value,"enter");
        //Assert.assertTrue(value,"Enter a ");
}}
