package io.github.alexspalermo.page.cadastro;

import static io.github.alexspalermo.core.setup.DriverFactory.getDriver;

public class AlexPalermoCadastroAcao {

    AlexPalermoCadastroTela alexPalermoCadastroTela = new AlexPalermoCadastroTela(getDriver());
    public void inserirNome(String nome) {
        alexPalermoCadastroTela.campoNomeCadastro.clear();
        alexPalermoCadastroTela.campoNomeCadastro.sendKeys(nome);
    }

    public void inserirEmail(String email) {
        alexPalermoCadastroTela.campoEmailCadastro.clear();
        alexPalermoCadastroTela.campoEmailCadastro.sendKeys(email);
    }

    public void inserirSenha(String senha) {
        alexPalermoCadastroTela.campoSenhaCadastro.clear();
        alexPalermoCadastroTela.campoSenhaCadastro.sendKeys(senha);
        alexPalermoCadastroTela.btnCadastrar.click();
    }
}
