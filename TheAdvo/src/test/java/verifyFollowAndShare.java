import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;


public class verifyFollowAndShare {

@Test
    public void main(){
        System.setProperty("webdriver.chrome.driver", "/Users/karinameliksetova/Documents/git/TheAdvo/Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver ();
        driver.get ("https://darksky.net/forecast/40.7127,-74.0059/us12/en");

  }

}
