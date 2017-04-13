package signupautomation;

import java.io.IOException;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Checker.HomePageChecker;
import Checker.LoginPageChecker;
import Checker.RegisterationChecker;
import Exception.ElementNotFound;
import Pages.Browser;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SignUpPage;

public class VerifyPage {
	WebDriver webDriver;
	Browser browser;
	HomePage homepage;
	LoginPage loginPage;
	WebElement webElement;
	SignUpPage signUpPage;
	HomePageChecker hpageChecker;
	LoginPageChecker lpageChecker;
	RegisterationChecker schecker;
	
	
	
	
}
