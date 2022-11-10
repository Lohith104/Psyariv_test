package com.IPT.aaaa;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.Timeout;

public class Psyarxiv_IPT {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lohith\\eclipse-workspace\\MiniProject_IPT\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://psyarxiv.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("searchBox")).sendKeys("Psychology");
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		driver.findElement(By.id("sortBy")).click();

		List<WebElement> elements = driver.findElements(By.xpath("//button[@class='btn btn-link listOption']"));
		int size = elements.size();
		System.out.println(size);

		WebElement sort = driver.findElement(By.xpath("(//button[@class='btn btn-link listOption'])[3]"));
		sort.click();
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,500);");
		
		WebElement element = driver.findElement(By.xpath("(//span[@class='search-result-providers'])[1]"));
		String text = element.getText();
		System.out.println(text);
		
		String s = driver.getCurrentUrl();
		System.out.println(s);
		//boolean b = s.contains(s.equalstoignore());
		System.out.println();
		
		
		driver.findElement(By.xpath("//a[@href='https://psyarxiv.com/amevw/']")).click();
	    String title = driver.getTitle();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleIs(title));
		
		Thread.sleep(4000);
		j.executeScript("window.scrollBy(0,400);");
		driver.findElement(By.xpath("//button[text()='See more']")).click();
		WebElement element2 = driver.findElement(By.xpath("//p[@class='abstract ']"));
		String text2 = element2.getText();
		System.out.println(text2);
		
		
		
		
		
	}
}
