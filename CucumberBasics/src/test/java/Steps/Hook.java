package Steps;

import Base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializaTest() {
        System.out.println("Opening the browser: Chrome");

        System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Mozilla Firefox\\geckodriver.exe");
        base.Driver= new FirefoxDriver();

        //Passing a dummy WebDriver instance
        //base.StepInfo = "FirefoxDriver";
    }

    @After
    public void TearDownTest(Scenario scenario) {

        if (scenario.isFailed()) {
            //Take screenshotte
            System.out.println(scenario.getName());
        }

        System.out.println("Closing the browser: Chrome");
    }
}
