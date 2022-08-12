package io.github.alexspalermo.steps.site;

import io.cucumber.java.pt.Dado;
import io.github.alexspalermo.page.site.AlexPalermoSiteAtividade;

public class SiteSteps {

    AlexPalermoSiteAtividade alexPalermoSiteAtividade = new AlexPalermoSiteAtividade();

    @Dado("que estou na tela de Login do site alexspalermo")
    public void queEstouNaTelaDeLoginDoSiteAlexspalermo() {
        alexPalermoSiteAtividade.queEstouNaTelaDeLoginDoSiteAlexspalermo();
    }

    @Dado("que estou na tela de Cadastro no site alexspalermo")
    public void queEstouNaTelaDeCadastroNoSiteAlexspalermo() {
        alexPalermoSiteAtividade.queEstouNaTelaDeCadastroNoSiteAlexspalermo();
    }
}
