package io.github.alexspalermo.page.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import io.github.alexspalermo.core.setup.PaginaBase;

public class AlexPalermoLoginTela extends PaginaBase {

    public AlexPalermoLoginTela(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email_login")
    public WebElement campoEmailLogin;

    @FindBy(id = "senha_login")
    public WebElement campoSenhaLogin;

    @FindBy(xpath = "//input[@value='Logar']")
    public WebElement btnLogin;
}
