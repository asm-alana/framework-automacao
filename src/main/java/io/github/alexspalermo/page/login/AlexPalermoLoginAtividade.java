package io.github.alexspalermo.page.login;

public class AlexPalermoLoginAtividade {

    AlexPalermoLoginAcao alexPalermoLoginAcao = new AlexPalermoLoginAcao();
    
    public void insiroNoCampoEmailOValor(String email) {
        alexPalermoLoginAcao.inserirEmail(email);
    }

    public void insiroNoCampoSenhaOValor(String senha) {
        alexPalermoLoginAcao.inserirSenha(senha);
    }

}
