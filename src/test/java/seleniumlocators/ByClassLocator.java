package seleniumlocators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ByClassLocator {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

        driver.get("https://www.saucedemo.com/");

        WebElement userNameField = driver.findElement(By.className("input_error"));
        userNameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys( "secret_sauce");

        WebElement loginButton = driver.findElement(By.className("submit-button"));
        loginButton.click();


    }
}
