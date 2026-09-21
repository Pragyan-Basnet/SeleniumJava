package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ByCssSelectorExample {
    public static void main(String[] args) {
        ChromeOptions obj = new ChromeOptions();
        obj.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(obj);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.saucedemo.com/");


    }
}
