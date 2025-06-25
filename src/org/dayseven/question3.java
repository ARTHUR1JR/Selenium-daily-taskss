package org.dayseven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class question3 {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
				
				d.get("http://toolsqa.com/");
				d.manage().window().maximize();
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				JavascriptExecutor j =(JavascriptExecutor)d;	
				
				WebElement down = d.findElement(By.xpath("//div[contains(text(),'It was an excellent training. The trainer had very')]"));
				
				j.executeScript("arguments[0].scrollIntoView(true)", down);
				System.out.println(down.getText());
}
}