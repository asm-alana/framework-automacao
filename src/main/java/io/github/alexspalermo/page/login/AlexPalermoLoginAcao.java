package io.github.alexspalermo.page.login;

import static io.github.alexspalermo.core.setup.DriverFactory.*;

public class AlexPalermoLoginAcao {

    AlexPalermoLoginTela alexPalermoLoginTela = new AlexPalermoLoginTela(getDriver());


    public void inserirEmail(String email) {
        alexPalermoLoginTela.campoEmailLogin.clear();
        alexPalermoLoginTela.campoEmailLogin.sendKeys(email);
    }

    public void inserirSenha(String senha) {
        alexPalermoLoginTela.campoSenhaLogin.sendKeys(senha);
        alexPalermoLoginTela.btnLogin.click();
    }
}
