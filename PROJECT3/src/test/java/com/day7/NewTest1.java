package com.day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest1 {
  @Test
  public void openGoogle() {
	  WebDriverManager.chromedriver().setup();
      ChromeOptions co=new ChromeOptions();
      co.addArguments("--remote-allow-origins=*");
      WebDriver driver=new ChromeDriver(co);
      driver.get("https://www.google.com");
      
     
}
}
