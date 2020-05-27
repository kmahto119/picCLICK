package com.demoKamsPhoto;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Demo5Test {
WebDriver driver;
	
	@Test
	public void demoT()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://fotofox.live/top-kids-jharkhand-2020/?contest=photo-detail&photo_id=4947");
		
		for(int i=0;i<=1000;i++)
		{
		
			try {	
				Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' Vote for this photo!']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Registration']")));
		//driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			} catch (Exception e) {
				e.printStackTrace();
				driver.navigate().refresh();
			}
			
			driver.navigate().back();
			
		//driver.navigate().back();
		//driver.navigate().to("https://fotofox.live/top-kids-jharkhand-2020/?contest=photo-detail&photo_id=4947");
		//driver.close();
	
	
		}
	}


}
