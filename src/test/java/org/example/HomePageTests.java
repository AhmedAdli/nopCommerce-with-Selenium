package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTests {
   private WebDriver driver;

    @Test
    public void ClickRegiester(){
        new HomePage(driver).
                hoverAccounBtn()
                .clickRegisterBtn()
                .verifyRegisterPageOpened();
    }

    @BeforeTest
    public  void SetDriver()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.nopcommerce.com/en");
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
