package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // Enter “standard_user” username
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        // Enter “secret_sauce” password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        // Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

        String actualMessage = "Products";
        String expectedMessage = driver.findElement(By.xpath("//span[@class='title']")).getText();
        Assert.assertEquals("Error Message is not Displayed", expectedMessage, actualMessage);
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        // Enter “standard_user” username
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        // Enter “secret_sauce” password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        // Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        // Verify the "Sauce Labs Backpack"
        String actualMessage = "Sauce Labs Backpack";
        String expectedMessage = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getText();
        Assert.assertEquals("Error Message is not Displayed", expectedMessage, actualMessage);

        // Verify the "Sauce Labs Bike Light"
        String actualMessage1 = "Sauce Labs Bike Light";
        String expectedMessage1 = driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']")).getText();
        Assert.assertEquals("Error Message is not Displayed", expectedMessage1, actualMessage1);

        // Verify the "Sauce Labs Bolt T-Shirt"
        String actualMessage2 = "Sauce Labs Bolt T-Shirt";
        String expectedMessage2 = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']")).getText();
        Assert.assertEquals("Error Message is not Displayed", expectedMessage2, actualMessage2);

        // Verify the "Sauce Labs Fleece Jacket"
        String actualMessage3 = "Sauce Labs Fleece Jacket";
        String expectedMessage3 = driver.findElement(By.xpath("//div[text()='Sauce Labs Fleece Jacket']")).getText();
        Assert.assertEquals("Error Message is not Displayed", expectedMessage3, actualMessage3);

        // Verify the "Sauce Labs Onesie"
        String actualMessage4 = "Sauce Labs Onesie";
        String expectedMessage4 = driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']")).getText();
        Assert.assertEquals("Error Message is not Displayed", expectedMessage4, actualMessage4);

        // Verify the "Test.allTheThings() T-Shirt (Red)"
        String actualMessage5 = "Test.allTheThings() T-Shirt (Red)";
        String expectedMessage5 = driver.findElement(By.xpath("//div[text()='Test.allTheThings() T-Shirt (Red)']")).getText();
        Assert.assertEquals("Error Message is not Displayed", expectedMessage5, actualMessage5);

    }

    @After
    public void tearDown() {
        closerBrowser();
    }
}
