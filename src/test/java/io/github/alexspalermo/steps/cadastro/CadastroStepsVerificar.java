package io.github.alexspalermo.steps.cadastro;

import io.cucumber.java.pt.Entao;
import io.github.alexspalermo.page.cadastro.AlexPalermoCadastroVerificar;

public class CadastroStepsVerificar {

    AlexPalermoCadastroVerificar alexPalermoCadastroVerificar = new AlexPalermoCadastroVerificar();

    @Entao("visualizarei a mensagem de sucesso {string}")
    public void visualizareiAMensagemDeSucesso(String msgSucesso) {
        alexPalermoCadastroVerificar.visualizareiAMensagemDeSucesso(msgSucesso);
    }
}
