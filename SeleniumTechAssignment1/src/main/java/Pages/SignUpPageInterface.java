package Pages;

import java.io.IOException;

import Checker.RegisterationChecker;
import Checker.SignUpPageChecker;
import Exception.ElementNotFound;

public interface SignUpPageInterface {
	
	public SignUpPage enterEmailIdInSignUpText() throws IOException, ElementNotFound;
	public SignUpPage enterEmailIdFromCreatedSignUpPropertyFile() throws IOException;
	public SignUpPageChecker verify() throws IOException;
	public RegisterationChecker clickSignUpButton() throws IOException, ElementNotFound;
}
