package Checker;

import java.io.IOException;

import Pages.HomePage;

public interface HomPageCheckerInterface {
	
	public HomePage checkLoginButtonDisplayed() throws IOException;
	public HomePage checkTitle() throws IOException;
}
