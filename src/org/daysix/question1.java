package org.daysix;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class question1 {
public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver d=new ChromeDriver();
				
				d.get("https://www.facebook.com/");
				
				d.manage().window().maximize();
				
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				
				WebElement user = d.findElement(By.id("email"));
				user.sendKeys("mukpgmail");
				
				Actions a=new Actions(d);
				
				a.doubleClick(user).perform();
				a.contextClick(user).perform();
				
				
				
				Robot r=new Robot();
				
				
				for(int i=0;i<8;i++){
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				}
				
				r.keyPress(KeyEvent.VK_ENTER);
				//r.keyRelease(KeyEvent.VK_ENTER);
				
				WebElement pass = d.findElement(By.id("pass"));
				pass.click();
				a.contextClick(pass).perform();
				for(int j=0;j<4;j++){
					r.keyPress(KeyEvent.VK_DOWN);
					r.keyRelease(KeyEvent.VK_DOWN);
					}
					
					r.keyPress(KeyEvent.VK_ENTER);
//=====================================================================================
					//using keyboard shortcuts
					
//				r.keyPress(KeyEvent.VK_CONTROL);
//				r.keyPress(KeyEvent.VK_C);
//				
//				r.keyRelease(KeyEvent.VK_CONTROL);
//				r.keyRelease(KeyEvent.VK_C);
//				
//				d.findElement(By.id("pass")).click();
//				//Thread.sleep(2000);
//				
//				r.keyPress(KeyEvent.VK_CONTROL);
//				r.keyPress(KeyEvent.VK_V);
//				
//				r.keyRelease(KeyEvent.VK_CONTROL);
//				r.keyRelease(KeyEvent.VK_V);
				
				
				
				
}
	
	
}
