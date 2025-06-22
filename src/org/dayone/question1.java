package org.dayone;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class question1 {

	
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver d= new  ChromeDriver();
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		d.get(" http://www.greenstechnologys.com/");
		Thread.sleep(3000);
		
		// the laoding page if it takes too long ::netwrok issue for me lol XD
		
		
		d.get("http://gmail.com/");
		Thread.sleep(3000);
		
		d.get("http://www.flipkart.com/");
		Thread.sleep(3000);
		
		d.get("http://greenstech.in/selenium-course-content.html");

		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

}
