package site.dominio.hooks;

import io.cucumber.java.Scenario;
import org.junit.Before;

public class HookBefore {

    @Before
    public void iniciandoProjeto(Scenario cenario){
        String nomeDoCenario = cenario.getName();
        System.out.println("Iniciando o teste do cenario: " + nomeDoCenario);
    }
}
