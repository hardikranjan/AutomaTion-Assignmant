package Pages;

import java.io.IOException;

import Checker.LoginPageChecker;
import Checker.RegisterationChecker;
import Exception.ElementNotFound;
import Utils.Util;

public interface LoginPageInterface {
	public SignUpPage openSignUpPage() throws IOException, ElementNotFound;
	public LoginPage signUpStatus() throws IOException;
	public LoginPageChecker verify() throws IOException;
	public RegisterationChecker check() throws IOException;
	public Util navigate();
}
