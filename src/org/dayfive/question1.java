package org.dayfive;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class question1 {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
				
				d.get("http://demo.guru99.com/test/drag_drop.html");
				
				d.manage().window().maximize();
				
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				WebElement src = d.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
				
				WebElement des = d.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
				
				WebElement debitsrc = d.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
				
				WebElement dess = d.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
				
				Actions a=new Actions(d);
				
				a.dragAndDrop(src, des).perform();
				
				a.dragAndDrop(debitsrc, dess).perform();
				
				
				
				
				
}

}
