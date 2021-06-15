package co.com.toyota.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/search_motor_toyota.feature"},
        glue = {"co.com.toyota.definitions"},
        snippets = SnippetType.CAMELCASE
//        plugin = {"pretty", "html:target/cucumber-reports"},
//        tags =  {"@"}
)
public class ToyotaRunner {
}
