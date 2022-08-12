package io.github.alexspalermo.steps.cadastro;

import io.cucumber.java.pt.Quando;
import io.github.alexspalermo.page.cadastro.AlexPalermoCadastroAtividade;

public class CadastroStepsAtividade {

    AlexPalermoCadastroAtividade alexPalermoCadastroAtividade = new AlexPalermoCadastroAtividade();

    @Quando("inserir no campo nome o valor {string}")
    public void inserirNoCampoNomeOValor(String nome) {
       alexPalermoCadastroAtividade.inserirNoCampoNomeOValor(nome);
    }

    @Quando("inserir no campo e-mail o valor {string}")
    public void inserirNoCampoEMailOValor(String email) {
        alexPalermoCadastroAtividade.inserirNoCampoEMailOValor(email);
    }
    @Quando("na senha inserir o valor {string}")
    public void naSenhaInserirOValor(String senha) {
        alexPalermoCadastroAtividade.naSenhaInserirOValor(senha);
    }
}
