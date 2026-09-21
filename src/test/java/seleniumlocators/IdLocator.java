package seleniumlocators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       driver.get("https://www.saucedemo.com/"); // it should visit th e saucedemo site

        WebElement userNameField = driver.findElement(By.id("user-name")); // it finds the username Field
        userNameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.id("password")); // it finds the password Field
        passwordField.sendKeys( "secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button")); // it finds the login button
        loginButton.click();


    }
}
