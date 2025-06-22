package org.daythree;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class question11 {

public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
				
				d.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
				
				d.manage().window().maximize();
				
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				d.findElement(By.id("firstName")).sendKeys("apirl");
				
				d.findElement(By.id("lastName")).sendKeys("fool");
				
				d.findElement(By.xpath("//span[text()='Next']")).click();
				
}

}
