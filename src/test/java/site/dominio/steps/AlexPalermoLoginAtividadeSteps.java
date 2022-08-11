package site.dominio.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import site.dominio.page.AlexPalermoLoginAtividade;

public class AlexPalermoLoginAtividadeSteps {

    AlexPalermoLoginAtividade alexPalermoLoginAtividade = new AlexPalermoLoginAtividade();

    @Dado("que estou no site alexspalermo")
    public void queEstouNoSiteAlexspalermo() {
        alexPalermoLoginAtividade.queEstouNoSiteAlexspalermo();
    }

    @Quando("insiro no campo email o valor {string}")
    public void insiroNoCampoEmailOValor(String email) {
        alexPalermoLoginAtividade.insiroNoCampoEmailOValor(email);
    }
    @Quando("insiro no campo senha o valor {string}")
    public void insiroNoCampoSenhaOValor(String senha) {
        alexPalermoLoginAtividade.insiroNoCampoSenhaOValor(senha);
    }
}
