package radiobutton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class test {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get( "https://testautomation.co/webelements");
		List<WebElement> browserradios = driver.findElements(By.name("browser"));
		//browserradios.get(1).click();
		for (WebElement radio:browserradios)
		{
			System.out.println(radio.getAttribute("value"));
			if (radio.getAttribute("value").equals("safari"))
					{
				radio.click();
					}
		}
		
		
	}
			
	

}
