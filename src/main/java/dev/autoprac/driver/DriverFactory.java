package dev.autoprac.driver;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class DriverFactory extends AbstractTestNGCucumberTests {

	private static ThreadLocal<WebDriverThread> webDriverThread;
	List<WebDriverThread> webDriverPool = new ArrayList<>();
	Properties properties;

	@BeforeSuite
	public void initialiseDriverPool() {
		webDriverThread = new ThreadLocal<WebDriverThread>() {
			@Override
			protected WebDriverThread initialValue() {
				WebDriverThread driverThread = new WebDriverThread();
				webDriverPool.add(driverThread);
				return driverThread;
			}
		};
	}

	public static WebDriver getDriver() throws MalformedURLException {
		WebDriver driver = webDriverThread.get().getDriver();
		return driver;
	}

	@AfterSuite
	public void quitAllDrivers() throws MalformedURLException {
		System.out.println(webDriverPool.size());
		for (WebDriverThread driverTread : webDriverPool) {
			driverTread.getDriver().quit();
		}
	}

}
