package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/db.feature"},
        glue = {"step"},
        snippets = SnippetType.CAMELCASE,
        strict = true
)
public class CucumberRunner {
}
