package io.github.alexspalermo.steps.login;

import io.cucumber.java.pt.Quando;
import io.github.alexspalermo.page.login.AlexPalermoLoginAtividade;

public class LoginStepsAtividade {

    AlexPalermoLoginAtividade alexPalermoLoginAtividade = new AlexPalermoLoginAtividade();

    @Quando("insiro no campo email o valor {string}")
    public void insiroNoCampoEmailOValor(String email) {
        alexPalermoLoginAtividade.insiroNoCampoEmailOValor(email);
    }
    @Quando("insiro no campo senha o valor {string}")
    public void insiroNoCampoSenhaOValor(String senha) {
        alexPalermoLoginAtividade.insiroNoCampoSenhaOValor(senha);
    }
}
