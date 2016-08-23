import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;


/**
 * Created by webonise on 23/8/16.
 */
public class MyFirstTest {

    @Test
    public void goToWebPage()
    {
        String from_city = "Pune";
        String to_city = "Delhi";


        System.setProperty("webdriver.chrome.driver", "/home/webonise/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.tripadvisor.in/");
        assertTrue(driver.getTitle().contains("TripAdvisor"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('tabFlights').setAttribute('class', 'tabContent loaded active')");

        WebElement flightFromElement = driver.findElement(By.id("mainSearch"));
        flightFromElement.click();
        flightFromElement.sendKeys("PUNE!");

/*


        js.executeScript("document.getElementById('//id of element').setAttribute('attr', '10')");
        driver.findElement(By.)
                metaFlightFrom*/
        driver.quit();

        /*
        WebDriverWait _wait = new WebDriverWait(driver, 1200);
        driver.get("https://www.tripadvisor.in/");
        _wait.until(ExpectedConditions.elementToBeSelected((By.className("pcd_header"))));
        driver.get("https://www.tripadvisor.in/");
        assertTrue(driver.getTitle().contains("TripAdvisor"));*/

    }

}
