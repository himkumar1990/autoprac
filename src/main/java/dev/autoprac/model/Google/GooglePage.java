package dev.autoprac.model.Google;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dev.autoprac.model.BasePage;

public class GooglePage extends BasePage {

	@FindBy(name = "q")
	WebElement searchBox;

	@FindBy(tagName = "h3")
	List<WebElement> searchResult;

	public GooglePage() throws Exception {
		PageFactory.initElements(webdriver, this);
	}

	public void enterTextInSearchBox(String text) {
		searchBox.sendKeys(text + Keys.ENTER);
	}

	public boolean isListOfSearchResultDisplayed() {
		if (searchResult.size() > 0)
			return true;
		else
			return false;
	}
}
