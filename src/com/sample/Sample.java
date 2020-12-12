package com.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args)  {
		
		WebDriver driver;
		String path1="chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path1);
		driver=new ChromeDriver();
		driver.get("https://www.pagalworld.mobi/02-sunn-raha-hai-aashiqui-21/download.html");
		driver.manage().window().maximize();
}
}