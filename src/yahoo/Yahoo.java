package yahoo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gotomeeting.com");
		
		
		//first name
		driver.findElement(By.cssSelector("#hero-trial-form > div > div.row.no-gutter.hero__name-row > div:nth-child(1) > div > input")).sendKeys("Qadeer");
		Thread.sleep(5000);
		
		//last name
		driver.findElement(By.cssSelector("#hero-trial-form > div > div.row.no-gutter.hero__name-row > div:nth-child(2) > div > input")).sendKeys("Aali");
		Thread.sleep(5000);
		
		//email
		driver.findElement(By.cssSelector("#hero-trial-form > div > div:nth-child(30) > div > div.form-input.form-input-text > input")).sendKeys("dumysel@gmail.com");
		Thread.sleep(5000);
		
		//password
		driver.findElement(By.cssSelector("#hero-trial-form > div > div:nth-child(30) > div > div.form-input.form-input-password > input")).sendKeys("A@li123 ");
		Thread.sleep(5000);
		//submit
		driver.findElement(By.name("formSubmit")).click();
		Thread.sleep(10000);
		driver.quit();

	}

}
