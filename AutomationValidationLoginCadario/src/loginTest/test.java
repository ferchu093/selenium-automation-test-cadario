package loginTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://food-delivery-customer.smartersvision.com/login");
		d.findElement(By.id("email")).sendKeys("client@demo.com");
		d.findElement(By.id("password")).sendKeys("contraseñamal");
		d.findElement(By.xpath("//*[@id=\"login\"]/form/div[6]/button")).click();
		String u=d.getCurrentUrl();
		if(u.equals("https://food-delivery-customer.smartersvision.com/"))
		{
			System.out.println("Test Correcto");
			
		}
		else
		{
			
			System.out.println("Test Fallido");
		}
		d.close();
		
	}

}
