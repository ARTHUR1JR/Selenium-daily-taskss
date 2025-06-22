package org.daythree;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class question6 {

public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
				
				d.get("https://www.redbus.in/");
				
				d.manage().window().maximize();
				
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//skipping all redbus tasks
				
				//task: signup and generate otp
				
				
				
				
				
				
}
}
