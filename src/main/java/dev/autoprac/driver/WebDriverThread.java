package dev.autoprac.driver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverThread {
	WebDriver webdriver;

	public WebDriver getDriver() throws MalformedURLException {
		if (webdriver == null) {
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			// capabilities.setPlatform(Platform.LINUX);
			capabilities.setBrowserName(BrowserType.CHROME);
			webdriver = new RemoteWebDriver(new URL("http://localhost:4444"), capabilities);

			webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			webdriver.manage().window().maximize();
		}
		return webdriver;
	}
}
