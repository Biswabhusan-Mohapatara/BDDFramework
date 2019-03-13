package com.products.genericlib;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseClass {
        public static WebDriver driver;
        public Fileutils flib=new Fileutils();
        
        @Before
        public void configBC() throws Throwable {
        	System.out.println("===========================Launch Browser===========================");
        	Properties pObj=flib.getproperty();
        	String browserName=pObj.getProperty("browser");
        	if (browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./resources/chrome.exe");
				driver=new ChromeDriver();
			}else if (browserName.equals("firefox")) {
				System.setProperty("webdriver.chrome.driver", "./resources/firefox.exe");
				driver=new FirefoxDriver();
			}else if (browserName.equals("ie")) {
				System.setProperty("webdriver.ie.driver", "./resources/iexplore.exe");
				driver=new InternetExplorerDriver();
			}
        	driver.manage().window().maximize();
        	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        	
        }
        public void configBM() throws Throwable {
        	System.out.println("============================Login==================================");
        	Properties pObj=flib.getproperty();
        	String url1=pObj.getProperty("url");
        	driver.get(url1);
        	
        	driver.findElement(By.name("user_name")).sendKeys(pObj.getProperty("username"));
        	driver.findElement(By.name("user_password")).sendKeys(pObj.getProperty("password"));
        	Thread.sleep(4000);
        	driver.findElement(By.id("submitButton")).click();
        }
        
        @After
        public void configAM() {
        	System.out.println("==============================Logout=================================");
        	driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
        	driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
        	
        }
}
