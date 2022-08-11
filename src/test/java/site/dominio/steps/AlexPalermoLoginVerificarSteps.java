package site.dominio.steps;

import io.cucumber.java.pt.Entao;
import site.dominio.core.util.utilidades.ComandosUteis;
import site.dominio.page.AlexPalermoLoginVerificar;

public class AlexPalermoLoginVerificarSteps {

    ComandosUteis comandosUteis = new ComandosUteis();
    AlexPalermoLoginVerificar alexPalermoLoginVerificar = new AlexPalermoLoginVerificar();

    @Entao("visualizo a mensagem {string}")
    public void visualizoAMensagem(String mensagem) {
        alexPalermoLoginVerificar.visualizoAMensagem(mensagem);
    }
}
