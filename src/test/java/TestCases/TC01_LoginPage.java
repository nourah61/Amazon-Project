package TestCases;

import org.example.pages.P01_HomePage;
import org.testng.annotations.Test;

public class TC01_LoginPage extends TestBases{

P01_HomePage homePage;

@Test (priority = 1)
    public void firstcase () throws InterruptedException {

 homePage = new P01_HomePage(driver);

 //step 1 click skip
    homePage.skiplogin.click();

    //step 2 search

   // homePage.search.click();
    Thread.sleep(3000);
    homePage.search.sendKeys("iphone");

}









    }
