package selectedmenu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test {

	public static void main(String[] args) {
		String url = "https://demoqa.com/select-menu";
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		Select oldStyleMenu = new Select(driver.findElement(By.id("oldSelectMenu")));
		
		//Old Style Select Menu
		//oldStyleMenu.selectByValue("7");
		oldStyleMenu.selectByVisibleText("Magenta");
		
		
	}

}
