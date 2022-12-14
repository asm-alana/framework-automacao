package io.github.alexspalermo.hooks;

import io.github.alexspalermo.core.setup.DriverFactory;

import org.junit.After;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import io.github.alexspalermo.core.setup.Propriedades;


import java.io.File;
import java.io.IOException;

import static io.github.alexspalermo.core.setup.DriverFactory.killDriver;

public class HookAfter {

    @Rule
    public TestName testName = new TestName();

    @After
    public void finaliza() throws IOException {
        TakesScreenshot screenShot = (TakesScreenshot) DriverFactory.getDriver();
        File arquivo = screenShot.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(arquivo, new File("target" + File.separator + "screenshot/" +
                File.separator + testName.getMethodName() + ".jpg"));

        if (Propriedades.FECHAR_BROWSER) {
            killDriver();
        }

    }
}
