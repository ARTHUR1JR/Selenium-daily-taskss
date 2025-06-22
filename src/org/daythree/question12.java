package org.daythree;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class question12 {

public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
				
				d.get("https://www.snapdeal.com/");
				
				d.manage().window().maximize();
				
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				d.findElement(By.xpath("//span[text()='Sign In']")).click();
				
				d.findElement(By.xpath("(//span[text()='Register'])[1]")).click();
				
				d.findElement(By.xpath("(//input[@type='text'])[7]")).click();
				
				
				d.findElement(By.xpath("//button[@class='btn col-xs-24 btn-large btn-skyblue continueBtn marT20 marB30']")).click();
				
}
	
	//not working in mobile no 

}
