package treinamentoINMSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestePortal {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://practice.automationtesting.in/my-account/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("weswes@teste.com");
		driver.findElement(By.id("password")).sendKeys("_teste_1234");
		driver.findElement(By.name("login")).click();
		
		//driver.quit();
	}

}
