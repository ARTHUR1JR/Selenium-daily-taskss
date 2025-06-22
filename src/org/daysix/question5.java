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

public class question5 {

public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver d=new ChromeDriver();
				
				d.get("http://greenstech.in/selenium-course-content.html");
				
				d.manage().window().maximize();
				
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				

				WebElement res = d.findElement(By.xpath("(//h2[@class='mb-0'])[3]"));
				
				Actions a =new Actions(d);
				
				a.contextClick(res).perform();
				
				Robot r=new Robot();
				
				for(int i=0;i<3;i++) {
					r.keyPress(KeyEvent.VK_DOWN);
					r.keyRelease(KeyEvent.VK_DOWN);
				}
				
				r.keyPress(KeyEvent.VK_ENTER);
				
				
}

}
