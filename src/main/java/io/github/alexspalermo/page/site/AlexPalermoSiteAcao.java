package io.github.alexspalermo.page.site;

import static io.github.alexspalermo.core.setup.DriverFactory.getDriver;

public class AlexPalermoSiteAcao {

    public void acessarTelaDeLogin() {
        getDriver().get("https://alexspalermo.github.io/AlexSPalermo.LoginCadastro.github.io/#paralogin");
    }

    public void acessarTelaDeCadastro(){
        getDriver().get("https://alexspalermo.github.io/AlexSPalermo.LoginCadastro.github.io/");
    }
}
