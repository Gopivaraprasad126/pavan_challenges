package seleniumChallanges;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.cs.Ale;

public class Alerts {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https:testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		/*1)
		Alert alert = driver.switchTo().alert();
		alert.accept();*/
		//2)Explicit wait
		Alert alert = driver.switchTo().alert();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		alert.accept(); 
		
	/*3)using JavaScriptExecutor
	JavascriptExecutor js = (JavascriptExecutor)driver;
	try {
	js.executeScript("window.alert=function{};");
	}
	catch(Exception e) {
		
	}*/
	}
}
