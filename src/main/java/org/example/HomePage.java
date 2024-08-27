package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class HomePage {

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private final By account_btn = By.className("user-actions-ico");
    private final By register_btn = By.linkText("Register");

    private WebDriver driver;
    String registerUrl= "https://www.nopcommerce.com/en/register?returnUrl=%2Fen";


    public HomePage hoverAccounBtn() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(account_btn))
                .perform();
        return this;
    }

    public HomePage clickRegisterBtn() {
        driver.findElement(register_btn).click();
        return this;
    }
    public HomePage verifyRegisterPageOpened(){
        String actualResult= driver.getCurrentUrl();
        Assert.assertEquals(actualResult,registerUrl);
        return this;
    }
}
