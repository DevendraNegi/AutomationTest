package resources;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"/src/test/java/resources"},glue={"/src/test/java/steps"})
public class TestRunner {

}
