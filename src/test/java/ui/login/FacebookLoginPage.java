package ui.login;

import org.openqa.selenium.By;

public class FacebookLoginPage {
    public static By USERNAME_FIELD = By.cssSelector("#email_container > input");
    public static By PASSWORD_FIELD = By.id("pass");
    public static By LOGIN_BUTTON = By.id("loginbutton");
}
