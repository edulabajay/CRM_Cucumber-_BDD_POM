package com_BasePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com_qa_UtilityPage.TestUtils;

public class TestBase {


	public static WebDriver driver;
	public static Properties prop;


	
	//Super class Constructor
	public TestBase() {

		try {

			prop = new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\info\\eclipse-workspace\\CRM_CucumberBDD_POM_Maven\\src\\main\\java\\com_qa_ConfigureProperties\\config.properties");
			prop.load(ip);	

		}catch (FileNotFoundException e) {


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	// Initializing / Invoke browser
	@SuppressWarnings("deprecation")
	public static void initialize() {

		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
		}



		//Waits
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.Page_LOAD_TIMEOUTS, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAITS,TimeUnit.SECONDS);


		driver.get(prop.getProperty("url"));
	}
}

