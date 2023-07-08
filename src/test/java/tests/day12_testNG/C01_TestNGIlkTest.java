package tests.day12_testNG;

import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_TestNGIlkTest {
    @Test
    public void test01(){
        /*
        POM'de driver
         */


        Driver.getDriver().get("https://www.amazon.com");
        ReusableMethods.bekle(5);
        Driver.closeDriver();
    }
    @Test
    public void test02(){
        //youtube anasayfaya gidin
        Driver.getDriver().get("https://www.youtube.com");
        ReusableMethods.bekle(3);

        //url yazdirin
        System.out.println(Driver.getDriver().getCurrentUrl());
        ReusableMethods.bekle(3);

        //sayfayi kapatin
        Driver.closeDriver();
    }
}
