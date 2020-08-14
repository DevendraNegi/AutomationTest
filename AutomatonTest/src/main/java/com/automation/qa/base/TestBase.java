package com.automation.qa.base;

import java.io.FileReader;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static Logger logger = LogManager.getLogger(TestBase.class);
	public static WebDriver driver;
	public static Properties prop;
public TestBase(){
	try{
		logger.info("TestBase()");
		FileReader reader=new FileReader("src/main/java/com/automation/qa/config/configure.properties");   
		prop=new Properties();  
		prop.load(reader);  
	}catch(Exception e){
		System.out.println(e);
	}	
}

public static void initilization(){
	logger.info("TestBase.initilization");
	String browserName=prop.getProperty("browser");
	if(browserName.equalsIgnoreCase("chrome")){
	System.setProperty("webdriver.chrome.driver", "C:/Users/Devendra/Downloads/chromedriver_win32/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(prop.getProperty("url"));
	}
}
}
