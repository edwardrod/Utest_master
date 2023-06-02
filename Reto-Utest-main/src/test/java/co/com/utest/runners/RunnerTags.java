package co.com.utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/registro_usuario.feature",
        tags = "@stories",
        glue = "co.com.utest.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}
