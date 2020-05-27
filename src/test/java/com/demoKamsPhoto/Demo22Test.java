package com.demoKamsPhoto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Demo22Test {
WebDriver driver;
	
	@Test
	public void demoT()
	{
		for(int i=0;i<=1000;i++)
		{
			try {	
		driver = new ChromeDriver();
		
		driver.navigate().to("https://fotofox.live/top-kids-jharkhand-2020/?contest=photo-detail&photo_id=4947");
		
		for(int j=0;i<=1000;i++)
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[text()=' Vote for this photo!']")).click();
			Thread.sleep(3000);
			WebDriverWait wait=new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Registration']")));
			Thread.sleep(2000);
			driver.navigate().back();
		}
		driver.close();
	} catch (Exception e) {
		driver.close();
	}
		}
	}
	

}
