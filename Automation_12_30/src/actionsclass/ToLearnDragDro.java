package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnDragDro {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
driver.get("https://www.globalsqa.com/demo-site/draganddrop/#:~:text=QA%20Demo%20Site%20|%20Website%20for%20Automation%20|%20Drag%20And");
	WebElement photoframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	driver.switchTo().frame(photoframe);
	WebElement img1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	WebElement trash = driver.findElement(By.id("trash"));
	Actions act=new Actions(driver);
	act.dragAndDrop(img1, trash).perform();
	WebElement gallery = driver.findElement(By.id("gallery"));
	act.pause(2000);
	act.dragAndDrop(img1, gallery).perform();
	}
	

}
