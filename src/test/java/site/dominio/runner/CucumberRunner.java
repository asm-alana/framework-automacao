package site.dominio.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import site.dominio.core.setup.DriverFactory;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"site.dominio"},
        tags = "",
        plugin = {"json:src/test/resources/evidencias/relatorio/json/report.json","html:src/test/resources/evidencias/relatorio/html/report.html"},
        monochrome = true,
        dryRun = false
)

public class CucumberRunner {

    @AfterClass
    public static void finalizarRunner() {
        DriverFactory.killDriver();
    }
}