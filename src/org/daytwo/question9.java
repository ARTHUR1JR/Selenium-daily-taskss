package org.daytwo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class question9 {

public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
				
				d.get("http://demo.automationtesting.in/Register.html");
				
				d.manage().window().maximize();
				
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				
				WebElement fname = d.findElement(By.xpath("(//input[@type='text'])[1]"));
				fname.sendKeys("mkp");
				
				WebElement lname = d.findElement(By.xpath("(//input[@type='text'])[2]"));
				lname.sendKeys("pkm");
				
				WebElement add = d.findElement(By.xpath("//textarea[@rows='3']"));
				add.sendKeys("neyveli");
				
				
				WebElement email = d.findElement(By.xpath("//input[@type='email']"));
				email.sendKeys("example@gmail.com");
				
				WebElement phn = d.findElement(By.xpath("//input[@type='tel']"));
				phn.sendKeys("123123123213");
				
				WebElement radiobtn = d.findElement(By.xpath("(//input[@type='radio'])[1]"));
				radiobtn.click();
				
				d.findElement(By.id("checkbox1")).click();
				
				d.findElement(By.id("checkbox2")).click();
				
				
				
				d.findElement(By.id("msdd")).click();
				
				d.findElement(By.xpath("//a[text()='English']")).click();
				

				
				WebElement skill = d.findElement(By.id("Skills"));
				
				WebElement country = d.findElement(By.xpath("(//select[@type='text'])[2]"));
				
				Select q=new Select(skill);
				
				q.selectByVisibleText("Java");
				
			
				Select a=new Select(country);
				
				
				WebElement selectcount = d.findElement(By.xpath("//span[@role='presentation']"));
				
				selectcount.click();
				
				d.findElement(By.xpath("//li[text()='United States of America']")).click();
				
				WebElement year = d.findElement(By.xpath("(//select[@type='text'])[3]"));

				Select f=new Select (year);
				
				f.selectByVisibleText("2003");
				
				WebElement month = d.findElement(By.xpath("(//select[@type='text'])[4]"));

				Select k=new Select (month);
				
				k.selectByVisibleText("May");
				
				
				WebElement day = d.findElement(By.xpath("(//select[@type='text'])[5]"));

				Select v=new Select (day);
				
				v.selectByVisibleText("10");
				
				d.findElement(By.id("firstpassword")).sendKeys("123123123");
				
				d.findElement(By.id("secondpassword")).sendKeys("13123123");
				
				
				
				
				
				
	}
	
	
	

}
