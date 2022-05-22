package HomeDepot1.HomeD;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.homedepot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement allDepts = driver.findElement(By.cssSelector(".ShoppingLinks__item:first-child"));
		
		Actions mouse = new Actions(driver);
		mouse.moveToElement(allDepts).build().perform();
		
		WebElement spring_saving = driver.findElement(By.xpath("(//a[@title='Spring Savings'])[1]"));
		mouse.moveToElement(spring_saving).build().perform();
		
		WebElement lawn = driver.findElement(By.xpath("//li[@class='MainFlyout__item']/a[@title='Lawn & Garden Savings']"));
		mouse.moveToElement(lawn).click().build().perform();
		
		System.out.println(driver.getTitle());
		
		
    }
}
