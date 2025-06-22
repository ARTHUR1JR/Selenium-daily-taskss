package org.dayfour;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class question6 {
public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
				
				d.get("https://www.facebook.com/");
				
				d.manage().window().maximize();
				
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				WebElement user = d.findElement(By.id("email"));
				user.sendKeys("mukkkkk");
				String e = user.getAttribute("value");
				System.out.println(e);
				
				WebElement pass = d.findElement(By.id("pass"));
				pass.sendKeys("123");
				String s = pass.getAttribute("value");
				System.out.println(s);
				
}

	

}
