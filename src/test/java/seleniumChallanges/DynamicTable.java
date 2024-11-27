package seleniumChallanges;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver(); 
	driver.get("https://practice.expandtesting.com/dynamic-table");
	driver.manage().window().maximize();
	 List<WebElement> element =driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));
	  int rsize=element.size();
	  for(int r=1;r<=rsize;r++) {
		  WebElement name=driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr["+r+"]/td[1]"));
		  name.getText();
	  }

	}

}
