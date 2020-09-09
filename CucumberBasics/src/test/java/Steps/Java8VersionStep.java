package Steps;

import io.cucumber.java8.En;
import io.cucumber.java8.StepDefinitionBody;

public class Java8VersionStep implements En {
    public Java8VersionStep() {
        And("^I just need to see how step looks for Cucumber-Java(\\d+)$", new StepDefinitionBody.A1<Integer>() {
            @Override
            public void accept(Integer arg0) throws Throwable {
                System.out.println("The value form new step class is: " + arg0);
            }
        });
    }
}
