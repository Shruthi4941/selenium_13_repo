package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileuploadNaukri {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
WebElement ex = driver.findElement(By.xpath("(//div[@class='focusable optionWrap  '])[1]"));
//driver.findElement(By.xpath("(//div[@class='focusable optionWrap  '])[1]")).click();

WebElement amc = driver.findElement(By.xpath("//input[@type='file']"));
amc.sendKeys("C:\\Users\\Suraj Kumar\\OneDrive\\Desktop\\Current Test Set.pdf");
Actions act=new Actions(driver);
 
act.scrollToElement(ex).perform();
act.click(ex).perform();
Thread.sleep(2000);
//driver.quit();
	}

}
