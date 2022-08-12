package io.github.alexspalermo.page.cadastro;

public class AlexPalermoCadastroAtividade {

    AlexPalermoCadastroAcao alexPalermoCadastroAcao = new AlexPalermoCadastroAcao();

    public void inserirNoCampoNomeOValor(String nome) {
        alexPalermoCadastroAcao.inserirNome(nome);
    }

    public void inserirNoCampoEMailOValor(String email) {
        alexPalermoCadastroAcao.inserirEmail(email);
    }

    public void naSenhaInserirOValor(String senha) {
        alexPalermoCadastroAcao.inserirSenha(senha);
    }
}
