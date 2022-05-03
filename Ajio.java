package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='genderfilter']/following-sibling::label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/following-sibling::label")).click();
		Thread.sleep(2000);
		System.out.println("Number of items: "+ driver.findElement(By.xpath("//div[@class='length']")).getText());
		System.out.println("========================");
		Thread.sleep(2000);
		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		System.out.println(" Size :" + bagBrandList.size());

		for (WebElement webElement : bagBrandList) {
			String text = webElement.getText();
			System.out.println(text);
		}
		System.out.println("========================");
		List<WebElement> bagNameList = driver.findElements(By.className("nameCls"));
		System.out.println(" Size :" + bagNameList.size());
		System.out.println(" Names of the Bags");
		for (WebElement webElement : bagNameList) {
			String text = webElement.getText();
			System.out.println(text);
		}
		Thread.sleep(2000);
		driver.close();
	

	}

}
