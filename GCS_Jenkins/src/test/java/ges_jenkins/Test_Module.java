package ges_jenkins;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class  Test_Module
{

	@Test
	public void HOME() throws Exception 
	{    
		WebDriverManager.chromedriver().setup();
		Thread.sleep(3000); 
		WebDriver driver =new ChromeDriver();
		Thread.sleep(3000);
		driver.get("http://20.219.145.143/signin");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='basic_username']")).sendKeys("GI2327");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='basic_password']")).sendKeys("@123#");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Remember me']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='ant-btn']")).click();
		Thread.sleep(3000);
		System.out.println("Home Page");
	}
	@Test
	public void LOGEFFOTS() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		Thread.sleep(3000); 
		WebDriver driver =new ChromeDriver();
		Thread.sleep(3000);
		driver.get("http://20.219.145.143/signin");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='basic_username']")).sendKeys("GI2327");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='basic_password']")).sendKeys("@123#");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Remember me']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='ant-btn']")).click();
		Thread.sleep(3000);
		System.out.println("Log Efforts");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@title='Log Efforts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/timesheets/submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=' New Timesheet']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[@class='ant-btn gx-mt-3 addBtn ant-btn-text']")).click();
		driver.findElement(By.xpath("//span[@class='ant-cascader-picker']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='ant-cascader-menu']")).click();
		driver.findElement(By.xpath("//li[text()='Project Not Assigned']")).click();
		driver.findElement(By.xpath("(//li[@title='Project Not Assigned'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='ant-picker-input'])[3]")).click();
		Thread.sleep(4000);
		WebElement element = driver.findElement(By.xpath("//div[@class='ant-picker-content']/ul/li[9]/div[text()='08']"));	
		Actions act = new Actions(driver);
		Thread.sleep(4000);
		act.scrollToElement(element).perform();
		Thread.sleep(4000);
		element.click();
		Thread.sleep(3000);
		WebElement element1 = driver.findElement(By.xpath("(//div[@class='ant-picker-input'])[4]"));
		Thread.sleep(4000);
		act.moveToElement(element1).build().perform();
		element1.click();
		Thread.sleep(6000);
		WebElement element2 = driver.findElement(By.xpath("(//div[@class='ant-picker-content'])[2]/ul[1]/li[9]/div[text()='08']"));
		Thread.sleep(4000);
		act.scrollToElement(element2).perform();
		Thread.sleep(4000);
		element2.click();
		Thread.sleep(3000);
		WebElement element3 = driver.findElement(By.xpath("(//div[@class='ant-picker-input'])[5]"));
		act.moveToElement(element3).click().build().perform();
		WebElement element4 = driver.findElement(By.xpath("(//div[@class='ant-picker-content'])[3]/ul[1]/li[9]/div[text()='08']"));
		Thread.sleep(6000);
		act.scrollToElement(element4).perform();
		Thread.sleep(4000);
		element4.click();
		WebElement element5 = driver.findElement(By.xpath("(//div[@class='ant-picker-input'])[6]"));
		act.moveToElement(element5).click().build().perform();
		WebElement element6 =driver.findElement(By.xpath("(//div[@class='ant-picker-content'])[4]/ul/li[9]/div[text()='08']"));
		Thread.sleep(6000);
		act.scrollToElement(element6).perform();
		Thread.sleep(4000);
		element6.click();
		WebElement element7 = driver.findElement(By.xpath("(//div[@class='ant-picker-input'])[7]"));
		act.moveToElement(element7).click().build().perform();
		WebElement element8 = driver.findElement(By.xpath("(//div[@class='ant-picker-content'])[5]/ul/li[9]/div[text()='08']"));
		Thread.sleep(6000);
		act.scrollToElement(element8).perform();
		Thread.sleep(4000);
		element8.click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[text()='OK']")).click();
	}

}
