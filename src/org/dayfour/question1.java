package org.dayfour;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class question1 {

public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
				
				d.get("http://www.greenstechnologys.com ");
				
				d.manage().window().maximize();
				
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				
				WebElement txt = d.findElement(By.xpath("//h1[text()='No 1 Software Training Institutes in Chennai with Placements']"));
				
				System.out.println(txt.getText());
				
				
				
}
	

}
