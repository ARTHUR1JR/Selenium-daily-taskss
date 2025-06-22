package org.dayfour;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class question5 {

public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
				
				d.get("http://www.greenstechnologys.com/");
				
				d.manage().window().maximize();
				
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				WebElement para = d.findElement(By.xpath("(//p[@style='text-align:justify; font-size:18px;'])[1]"));
			
				System.out.println(para.getText());
				
				
				
}

}
