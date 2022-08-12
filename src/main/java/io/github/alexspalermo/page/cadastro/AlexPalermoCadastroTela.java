package io.github.alexspalermo.page.cadastro;

import io.github.alexspalermo.core.setup.PaginaBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlexPalermoCadastroTela extends PaginaBase {

    public AlexPalermoCadastroTela(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "nome_cad")
    public WebElement campoNomeCadastro;

    @FindBy(id = "email_cad")
    public WebElement campoEmailCadastro;

    @FindBy(id = "senha_cad")
    public WebElement campoSenhaCadastro;

    @FindBy(xpath = "//input[@value='Cadastrar']")
    public WebElement btnCadastrar;
}
