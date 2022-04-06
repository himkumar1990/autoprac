package dev.autoprac.model;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

import dev.autoprac.driver.DriverFactory;

public class BasePage {

	protected WebDriver webdriver;

	public BasePage() throws MalformedURLException {
		webdriver = DriverFactory.getDriver();
	}
}
