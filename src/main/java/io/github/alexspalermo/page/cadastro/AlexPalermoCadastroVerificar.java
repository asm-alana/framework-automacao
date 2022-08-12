package io.github.alexspalermo.page.cadastro;

import io.github.alexspalermo.core.util.utilidades.ComandosUteis;
import org.junit.Assert;

public class AlexPalermoCadastroVerificar {

    ComandosUteis comandosUteis = new ComandosUteis();
    String alertaObtido = comandosUteis.alertaObterTexto();
    public void visualizareiAMensagemDeSucesso(String msgSucesso) {
        Assert.assertEquals(msgSucesso, alertaObtido);
    }
}
