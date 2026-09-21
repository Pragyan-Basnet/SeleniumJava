package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class CssSelectorClasswork {
    public static void main(String[] args) {
            ChromeOptions obj = new ChromeOptions();
            obj.addArguments("--incognito");

            WebDriver driver = new ChromeDriver(obj);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            WebElement UserNameField = driver.findElement(By.cssSelector("input.oxd-input"));
            WebElement Password = driver.findElement(By.cssSelector("input[placeholder='Password']"));
            WebElement Loginbutton = driver.findElement(By.cssSelector("button.oxd-button"));

            UserNameField.sendKeys("Admin");
            Password.sendKeys("admin123");
            Loginbutton.click();


    }
}
