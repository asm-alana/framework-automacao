package site.dominio.page;

import org.openqa.selenium.WebDriver;
import site.dominio.core.setup.DriverFactory;

import static site.dominio.core.setup.DriverFactory.*;

public class AlexPalermoLoginAcao {

    AlexPalermoLoginTela alexPalermoLoginTela = new AlexPalermoLoginTela(getDriver());
    public void acessarSite() {
        getDriver().get("https://alexspalermo.github.io/AlexSPalermo.LoginCadastro.github.io/#paralogin");
    }

    public void inserirEmail(String email) {
        alexPalermoLoginTela.campoEmail.clear();
        alexPalermoLoginTela.campoEmail.sendKeys(email);
    }

    public void inserirSenha(String senha) {
        alexPalermoLoginTela.campoSenha.sendKeys(senha);
        alexPalermoLoginTela.btnLogin.click();
    }
}
