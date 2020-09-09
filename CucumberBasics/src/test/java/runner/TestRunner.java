package runner;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import  io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//import org.junit.runner.RunWith;

//Run with MAVEN
//@RunWith(Cucumber.class) //--JUnit
@CucumberOptions(features = {"src/test/java/Features"}, plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json"}, glue = "Steps")
//Run with TestNG - add extends AbstractTestNGCucumberTests
public class TestRunner extends AbstractTestNGCucumberTests {
}
