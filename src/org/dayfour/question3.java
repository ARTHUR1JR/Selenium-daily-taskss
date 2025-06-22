package org.dayfour;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class question3 {

public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
				
				d.get("http://greenstech.in/selenium-course-content.html");
				
				d.manage().window().maximize();
				
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				
				WebElement address = d.findElement(By.xpath("(//div[@class='col-md-3 short-desc-with-logo widget widget_text'])[1]"));
				System.out.println(address.getText());
				
				
				
}
}
