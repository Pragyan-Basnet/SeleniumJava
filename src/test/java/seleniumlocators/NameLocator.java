package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NameLocator {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //wait

        driver.get("https://www.saucedemo.com/");

        WebElement userNameField = driver.findElement(By.name("user-name"));
        userNameField.sendKeys("standard_user");
        WebElement password = driver.findElement (By.name("password"));
        password.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.name("login-button"));
        loginButton.click();

    }
}
