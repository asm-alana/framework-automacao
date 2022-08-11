package site.dominio.page;

import org.junit.Assert;
import site.dominio.core.util.utilidades.ComandosUteis;

public class AlexPalermoLoginVerificar {

    ComandosUteis comandosUteis = new ComandosUteis();
    String textoObtido = comandosUteis.alertaObterTexto();

    public void visualizoAMensagem(String mensagem) {
        Assert.assertEquals(mensagem, textoObtido);
    }
}
