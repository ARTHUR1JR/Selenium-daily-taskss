package org.dayfour;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class question8 {

public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
				
				d.get("http://adactinhotelapp.com/");
				
				d.manage().window().maximize();
				
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				WebElement user = d.findElement(By.id("username"));
				user.sendKeys("mukesh");
				String s = user.getAttribute("value");
				System.out.println(s);
				
				WebElement pass = d.findElement(By.id("password"));
				pass.sendKeys("123123");
				String e = pass.getAttribute("value");
				System.out.println(e);
				
}
	
	

}
