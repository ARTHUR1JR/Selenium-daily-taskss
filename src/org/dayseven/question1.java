package org.dayseven;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class question1 {
	public static void main(String[] args) throws IOException  {
		WebDriver d = new ChromeDriver();
		
		d.get("http://www.greenstechnologys.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		TakesScreenshot t = (TakesScreenshot)d;
		File src = t.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Project\\Selenium-daily-taskss\\src\\org\\dayseven\\q1.png");
		FileUtils.copyFile(src,des);
	}

}
