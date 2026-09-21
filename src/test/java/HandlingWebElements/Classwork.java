package HandlingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Classwork {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/2018/09/automation-form.html");

        WebElement Name =
                driver.findElement(By.xpath("//input[@id='name']"));

        WebElement Email =
                driver.findElement(By.xpath("//input[@id='email']"));

        WebElement Phone =
                driver.findElement(By.xpath("//input[@id='phone']"));

        WebElement Address =
                driver.findElement(By.xpath("//textarea[@id='textarea']"));

        WebElement Gender =
                driver.findElement(By.xpath("//input[@id='male']"));

        WebElement Monday =
                driver.findElement(By.xpath("//input[@id='monday']"));

        WebElement Thursday =
                driver.findElement(By.xpath("//input[@id='thursday']"));

        WebElement Country =
                driver.findElement(By.xpath("//select[@id='country']"));

        WebElement Nepal =
                driver.findElement(By.xpath("//option[text()='Nepal']"));

        Name.sendKeys("Punam");
        Email.sendKeys("punam@gmail.com");
        Phone.sendKeys("9800000000");
        Address.sendKeys("Kathmandu, Nepal");

        Gender.click();

        Monday.click();
        Thursday.click();

        Country.click();
        Nepal.click();

        WebElement Start =
                driver.findElement(By.xpath("//button[text()='Start']"));

        Start.click();

        driver.switchTo().alert().accept();

        WebElement Stop =
                driver.findElement(By.xpath("//button[text()='Stop']"));

        Stop.click();

        driver.switchTo().alert().accept();

        WebElement DoubleClick =
                driver.findElement(By.id("field2"));

        Actions actions = new Actions(driver);

        actions.doubleClick(DoubleClick).perform();

        WebElement Source =
                driver.findElement(By.id("draggable"));

        WebElement Target =
                driver.findElement(By.id("droppable"));

        actions.dragAndDrop(Source, Target).perform();

        driver.quit();
    }
}