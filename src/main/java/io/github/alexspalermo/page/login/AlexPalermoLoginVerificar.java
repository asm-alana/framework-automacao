package io.github.alexspalermo.page.login;

import org.junit.Assert;
import io.github.alexspalermo.core.util.utilidades.ComandosUteis;

public class AlexPalermoLoginVerificar {

    ComandosUteis comandosUteis = new ComandosUteis();
    String textoObtido = comandosUteis.alertaObterTexto();

    public void visualizoAMensagem(String mensagem) {
        Assert.assertEquals(mensagem, textoObtido);
    }
}
