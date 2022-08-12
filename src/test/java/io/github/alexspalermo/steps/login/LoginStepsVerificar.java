package io.github.alexspalermo.steps.login;

import io.cucumber.java.pt.Entao;
import io.github.alexspalermo.core.util.utilidades.ComandosUteis;
import io.github.alexspalermo.page.login.AlexPalermoLoginVerificar;

public class LoginStepsVerificar {

    ComandosUteis comandosUteis = new ComandosUteis();
    AlexPalermoLoginVerificar alexPalermoLoginVerificar = new AlexPalermoLoginVerificar();

    @Entao("visualizo a mensagem {string}")
    public void visualizoAMensagem(String mensagem) {
        alexPalermoLoginVerificar.visualizoAMensagem(mensagem);
    }
}
