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

public class question2 {
public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver d=new ChromeDriver();
				
				d.get("https://www.google.co.in/webhp");
				
				d.manage().window().maximize();
				
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				WebElement search = d.findElement(By.name("q"));
				search.sendKeys("Vel Murugan");
	  
//				Actions a=new Actions(d);
//				
//				a.doubleClick(search).perform();
				Robot r=new Robot();
				
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_A);
				
				r.keyRelease(KeyEvent.VK_CONTROL);
				r.keyRelease(KeyEvent.VK_A);
				
				Thread.sleep(4000);
				
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_X);
				
				r.keyRelease(KeyEvent.VK_CONTROL);
				r.keyRelease(KeyEvent.VK_X);
				
				
}
}
