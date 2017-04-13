package Checker;

import java.io.IOException;

import Pages.SignUpPage;

public interface SignUpPageCheckerInterface {
	public SignUpPage checkSignUpTextBox() throws IOException;
	public SignUpPage checkSignUpTitle() throws IOException;
}
