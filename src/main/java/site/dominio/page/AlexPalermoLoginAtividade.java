package site.dominio.page;

import site.dominio.core.util.utilidades.ComandosUteis;

public class AlexPalermoLoginAtividade {

    AlexPalermoLoginAcao alexPalermoLoginAcao = new AlexPalermoLoginAcao();
    
    public void queEstouNoSiteAlexspalermo() {
        alexPalermoLoginAcao.acessarSite();
    }

    public void insiroNoCampoEmailOValor(String email) {
        alexPalermoLoginAcao.inserirEmail(email);
    }

    public void insiroNoCampoSenhaOValor(String senha) {
        alexPalermoLoginAcao.inserirSenha(senha);
    }

}
