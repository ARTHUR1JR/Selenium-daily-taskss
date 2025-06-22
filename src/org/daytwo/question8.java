package org.daytwo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class question8 {

public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
				
				d.get("https://www.instagram.com/accounts/login/?hl=en)");
				
				d.manage().window().maximize();
				
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				
				WebElement user = d.findElement(By.xpath("(//input[@class='_aa4b _add6 _ac4d _ap35'])[1]"));
				user.sendKeys("mkp");
				
				WebElement pass = d.findElement(By.xpath("//input[@type='password']"));
				pass.sendKeys("123asdasdad");
				
				WebElement btn = d.findElement(By.xpath("//div[@class='x9f619 xjbqb8w x78zum5 x15mokao x1ga7v0g x16uus16 xbiv7yw x1xmf6yo x1e56ztr x11hdunq x11gldyt x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']"));
       			btn.click();
				
	}
	
}
