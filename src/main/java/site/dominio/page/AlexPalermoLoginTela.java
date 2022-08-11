package site.dominio.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import site.dominio.core.setup.PaginaBase;

public class AlexPalermoLoginTela extends PaginaBase {

    public AlexPalermoLoginTela(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email_login")
    public WebElement campoEmail;

    @FindBy(id = "senha_login")
    public WebElement campoSenha;

    @FindBy(xpath = "//input[@value='Logar']")
    public WebElement btnLogin;
}
