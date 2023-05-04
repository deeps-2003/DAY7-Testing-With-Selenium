package com.day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task1 {
  @Test
  public void method1() {
	  WebDriverManager.chromedriver().setup();
      ChromeOptions co=new ChromeOptions();
      co.addArguments("--remote-allow-origins=*");
      WebDriver driver=new ChromeDriver(co);
      driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
      
      String actualtitle=driver.getTitle();
      String expectedtitle="Guest Registration Form-User Registration";
      Assert.assertEquals(actualtitle, null);
  }
  }

