package Steps;

import Base.BaseUtil;
//import Transformation.EmailTranform;
//import com.sun.org.apache.xpath.internal.operations.Equals;
//import com.sun.xml.internal.ws.policy.sourcemodel.AssertionData;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import org.asynchttpclient.util.Assertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.LoginPages;

//import java.util.ArrayList;
import java.util.List;

public class LoginStep extends BaseUtil {
    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() {

        System.out.println("Navigate Login page");
        //base.Driver.navigate().to("https://www.udemy.com/join/login-popup/?locale=en_US&response_type=html&next=https%3A%2F%2Fwww.udemy.com%2F");
        //base.Driver.get("http://www.executeautomation.com/demosite/Login.html");--TEST
        base.Driver.get("https://www.udemy.com/join/login-popup/");
    }

    @And("I click login button")
    public void iClickLoginButton() {
        //System.out.println("Click login button");
        //base.Driver.findElement(By.name("Login")).submit();
        LoginPages pages = new LoginPages(base.Driver);
        pages.ClickLogin();
    }

    @Then("I should see the userform page")
    public void iShouldSeeTheUserformPage() {
        //System.out.println("The driver is: " + base.StepInfo);
        //System.out.println("I should see userform page");
        //Assert.assertEquals("Its not displayed", base.Driver.findElement(By.name("Initial")).isDisplayed(), true);--TEST
        Assert.assertEquals("Its not displayed", base.Driver.findElement(By.className("main-content")).isDisplayed(), true);
    }

    @And("I enter the following for Login")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {
        List<String> data = table.row(1);
        //System.out.println(" The value is: " + data.get(0));
        //System.out.println(" The value is: " + data.get(1));
        //base.Driver.findElement(By.name("UserName")).sendKeys(data.get(0));
        //base.Driver.findElement(By.name("Password")).sendKeys(data.get(1));
        LoginPages page = new LoginPages(base.Driver);
        page.Login(data.get(0), data.get(1));

        //Create an ArrayList
        //List<User> users = new ArrayList<User>();
        //Store all th users
        //users = table.asList(User.class);

        //for (User user : users) {
        //System.out.println("The UserName is: " + user.username);
        // System.out.println("The Password is: " + user.password);

        //base.Driver.findElement(By.name("UserName")).sendKeys(user.username);
        //base.Driver.findElement(By.name("Password")).sendKeys(user.password);
        //}
    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String userName, String password) throws Throwable {
        System.out.println("UserName: " + userName);
        System.out.println("Password: " + password);
    }

    @And("^I enter the users email address as Email:([^\"]*)$")
    //public void iEnterTheUsersEmailAddressAsEmailAdmin(@Tranform(EmailTranform.class)) throws Throwable {
    public void iEnterTheUsersEmailAddressAsEmailAdmin(String email) throws Throwable {
        System.out.println("The Email Address is: " + email);
    }

    public class User {
        public String username;
        public String password;

        public User(String userName, String passWord) {
            username = userName;
            password = passWord;
        }
    }
}
