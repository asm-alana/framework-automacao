package io.github.alexspalermo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.github.alexspalermo.core.setup.DriverFactory;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"io.github.alexspalermo"},
        tags = "@regressivo",
        plugin = {"json:src/test/resources/evidencias/relatorio/json/report.json","html:src/test/resources/evidencias/relatorio/html/report.html"},
        monochrome = true,
        snippets = SnippetType.CAMELCASE,
        dryRun = false
)

public class CucumberRunner {

    @AfterClass
    public static void finalizarRunner() {
        DriverFactory.killDriver();
    }
}