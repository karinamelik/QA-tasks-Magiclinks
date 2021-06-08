import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


public class verifyFollowAndShare {

@Test
    public void VerifyFollowAndShare() {
    System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("https://theadvo.com/");
    WebElement webElement = driver.findElement(By.xpath("(//a[contains (text(), 'Visit profile')])[1]"));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();;", webElement);
    for(String winHandle : driver.getWindowHandles()){
        driver.switchTo().window(winHandle);
    }
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),'Follow')]")).isDisplayed());
    Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),'Share')]")).isDisplayed());
    driver.quit();

}

}
