package org.dayfour;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class question11 {
public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
				
				d.get("https://www.flipkart.com/");
				
				d.manage().window().maximize();
				
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				d.findElement(By.xpath("(//a[@title='Login'])[1]")).click();
				
				WebElement email = d.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));
				
				email.sendKeys("1234@gmail.com");
				
				String psp = email.getAttribute("value");
				System.out.println(psp);
				
				
				
				
}
	

}
