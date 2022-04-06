package dev.autoprac.glue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement uploadPic = driver.findElement(By.xpath("//label[text()='Select picture']"));
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("document.getElementById('uploadPicture').scrollIntoView()");
		uploadPic.click();
		Runtime.getRuntime().exec("D:\\projects\\ecl workspace\\autoprac\\driver\\uploadfile.exe");
	}

}
