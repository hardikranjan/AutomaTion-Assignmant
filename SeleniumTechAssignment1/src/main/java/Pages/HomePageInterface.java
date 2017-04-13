package Pages;

import java.io.IOException;

import Checker.HomePageChecker;
import Exception.ElementNotFound;

public interface HomePageInterface {
	public HomePage openHomePageUrl() throws IOException, ElementNotFound;
	public LoginPage openLoginPage() throws IOException, ElementNotFound;
	public HomePageChecker verify() throws IOException;
}
