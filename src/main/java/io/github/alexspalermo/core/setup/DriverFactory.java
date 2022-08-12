package io.github.alexspalermo.core.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {

    protected static WebDriver driver;

    public static WebDriver getDriver(){

        if(driver == null){
            switch (Propriedades.browser){
                case CHROME:
                    ChromeOptions option = new ChromeOptions();
                    option.addArguments("--disable-notifications");
                    driver = new ChromeDriver(option);
                    driver.manage().window().maximize();
                    break;
                case FIREFOX:
                    FirefoxOptions options = new FirefoxOptions();
                    options.addArguments("--disable-notifications");
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    break;
                case HEADLESS:
                    ChromeOptions optionHEADLESS = new ChromeOptions();
                    optionHEADLESS.addArguments("--disable-notifications");
                    optionHEADLESS.addArguments("--headless");
                    driver = new ChromeDriver(optionHEADLESS);
                    driver.manage().window().maximize();
            }
        }
        return driver;
    }

    public static void killDriver() {
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
