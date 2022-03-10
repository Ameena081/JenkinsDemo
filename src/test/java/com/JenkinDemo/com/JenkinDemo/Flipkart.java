package com.JenkinDemo.com.JenkinDemo;



	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Flipkart{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com");
			
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobiles unser 20000",Keys.ENTER);
			
			List<WebElement> prices = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
			System.out.println("ss");
			for(int i=1;i<prices.size();i++) {
				
				String mobilecost=prices.get(i).getText();
				System.out.println(mobilecost);
				String[] mobileprice = mobilecost.split(",");
				String mobilepricess=mobileprice[0]+mobileprice[1];
//				System.out.println(mobilepricess);
		}

	}
	}



