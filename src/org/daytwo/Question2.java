//package org.daytwo;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Question2 {
//
//public static void main(String[] args) throws InterruptedException {
//		
//		WebDriver d=new ChromeDriver();
//		
//		d.get("https://www.redbus.in/");
//		
//		d.manage().window().maximize();
//		
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		Thread.sleep(3000);
//		
//		WebElement from = d.findElement(By.xpath("(//div[text()='From']"));
//		from.click();
//		Thread.sleep(2000);
//		from.sendKeys("cmbt");
//		Thread.sleep(2000);
//		from.sendKeys(Keys.ARROW_DOWN);
//		
//		
//
//		from.sendKeys(Keys.ENTER);
//		
//		
//		
//		
//		To.click();
//		To.sendKeys("villupuram");
//		
//
//}
//}

package org.daytwo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver d = new ChromeDriver();
        
        d.get("https://www.redbus.in/");
        d.manage().window().maximize();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
     // FROM field
        WebElement fromLabel = d.findElement(By.cssSelector("div.label__57eda7"));

        fromLabel.sendKeys("CMBT");
        Thread.sleep(500);
        fromLabel.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

        // TO field
        WebElement toInput = d.findElement(
            By.xpath("//input[contains(@placeholder,'To')]")
        );
        toInput.sendKeys("Villupuram");
        Thread.sleep(500);
        toInput.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);


        // You can proceed to select date, click search, etc., here...
    }
}
//pending question XD
//aree oo sambooooo