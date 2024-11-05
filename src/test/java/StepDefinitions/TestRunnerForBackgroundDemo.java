package StepDefinitions;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/BackgroundDemo/BackgroundDemo.feature",
glue= {"StepsforBackground"},
monochrome= true,
plugin= {"pretty","html:target/HTML/report.html"}


)






public class TestRunnerForBackgroundDemo {

}
