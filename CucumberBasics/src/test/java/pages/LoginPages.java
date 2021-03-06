package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {
    public LoginPages(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //TEST
    /*@FindBy(how = How.NAME, using = "UserName")
    public WebElement txtUserName;

    @FindBy(how = How.NAME, using = "Password")
    public WebElement txtPassword;

    @FindBy(how = How.NAME, using = "Login")
    public WebElement btnLogin;*/

    @FindBy(how = How.NAME, using = "email")
    public WebElement txtUserName;

    @FindBy(how = How.NAME, using = "password")
    public WebElement txtPassword;

    @FindBy(how = How.NAME, using = "submit")
    public WebElement btnLogin;

    public void Login(String username, String password) {
        txtUserName.sendKeys(username);
        txtPassword.sendKeys(password);
    }

    public void ClickLogin() {
        btnLogin.submit();
    }
}
