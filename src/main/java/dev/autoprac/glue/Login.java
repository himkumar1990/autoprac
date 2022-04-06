package dev.autoprac.glue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	@When("login page is loaded")
	public void login_page_is_loaded() {
	   System.out.println("loaded");
	}
	@When("username is entered")
	public void username_is_entered() {
	   System.out.println("username is entered");
	}
	@When("password is entered")
	public void password_is_entered() {
		 System.out.println("password is entered");
	}
	@When("submit button is clicked")
	public void submit_button_is_clicked() {
		 System.out.println("submit button is clicked");
	}
	@Then("home page is displayed")
	public void home_page_is_displayed() {
		 System.out.println("home page should be displayed");
	}
}
