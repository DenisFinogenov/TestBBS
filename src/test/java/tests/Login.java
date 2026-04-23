package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class Login extends BaseTest {
    @Test
    public void correctLogin() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath( "//input[@data-test='username']")).sendKeys("неправильно");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        String errorText = driver.findElement(By.xpath("//h3[@ata-test='eror']")).getText();

        assertTrue(driver.findElement(By.xpath("//h3[@ata-test='eror']")).isDisplayed());
        assertEquals(errorText, "Epic sadface: Username and password do not match any user in this service");

    }
}