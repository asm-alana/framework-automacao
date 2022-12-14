package io.github.alexspalermo.core.util.utilidades;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static io.github.alexspalermo.core.setup.DriverFactory.getDriver;

public class ComandosUteis {

    public void escrever(By by, String texto) {
        getDriver().findElement(by).clear();
        getDriver().findElement(by).sendKeys(texto);
    }

    public void escrever(String id_campo, String texto) {
        escrever(By.id(id_campo), texto);
    }

    /* ------- RADIO E CHECK ------ */

    public void clicarRadio(By by) {
        getDriver().findElement(by).click();
    }

    public void clicarRadio(String id) {
        clicarRadio(By.id(id));
    }

    public boolean isRadioMarcado(String id) {
        return getDriver().findElement(By.id(id)).isSelected();
    }

    public void clicarCheck(String id) {
        getDriver().findElement(By.id(id)).click();
    }

    public boolean isCheckMarcado(String id) {
        return getDriver().findElement(By.id(id)).isSelected();
    }

    /*-------- COMBO --------- */

    public void selecionarCombo(By by, String valor) {
        WebElement element = getDriver().findElement(by);
        Select combo = new Select(element);
        combo.selectByVisibleText(valor);

    }

    public void selecionarCombo(String id, String valor) {
        selecionarCombo(By.id(id), valor);

    }

    public void deselecionarCombo(String id, String valor) {
        WebElement element = getDriver().findElement(By.id(id));
        Select combo = new Select(element);
        combo.deselectByVisibleText(valor);
    }

    public String obterValorCombo(String id) {
        WebElement element = getDriver().findElement(By.id(id));
        Select combo = new Select(element);
        return combo.getFirstSelectedOption().getText();
    }

    public List<String> obterValoresCombo(String id) {
        WebElement element = getDriver().findElement(By.id("elementosForm:esportes"));
        Select combo = new Select(element);
        List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
        List<String> valores = new ArrayList<String>();
        for (WebElement opcao : allSelectedOptions) {
            valores.add(opcao.getText());
        }
        return valores;
    }

    public int obterQuantidadeOpcoesCombo(String id) {
        WebElement element = getDriver().findElement(By.id(id));
        Select combo = new Select(element);
        List<WebElement> options = combo.getOptions();
        return options.size();
    }

    public boolean verificarOpcaoCombo(String id, String opcao) {
        WebElement element = getDriver().findElement(By.id(id));
        Select combo = new Select(element);
        List<WebElement> options = combo.getOptions();
        for (WebElement option : options) {
            if (option.getText().equals(opcao)) {
                return true;
            }
        }
        return false;
    }

    public void selecionarComboPrime(String radical, String valor) {
        clicarRadio(By.xpath("//label[@id='" + radical + "_label']/../..//span"));
        clicarRadio(By.xpath("//*[@id='" + radical + "_items']//li[.='" + valor + "']"));
    }

    /* ------- BOT??O -------- */
    public void clicarBotao(String id) {
        getDriver().findElement(By.id(id)).click();
    }

    public String obterValueElemento(String id_campo) {
        return getDriver().findElement(By.id(id_campo)).getAttribute("value");
    }

    /* ------- LINK -------- */

    public void clicarLink(String link) {
        getDriver().findElement(By.linkText(link)).click();
    }

    /* ------- TEXTO -------- */

    public String obterTexto(By by) {
        return getDriver().findElement(by).getText();
    }

    public String obterTexto(String id) { // m??todo mais espec??fico est?? chamando o mais gen??rico
        return obterTexto(By.id(id));
    }

    /* ------- ALERTS -------- */

    public String alertaObterTexto() {
        Alert alert = getDriver().switchTo().alert();
        return alert.getText();
    }

    public void alertaEscrever(String valor) {
        Alert alert = getDriver().switchTo().alert();
        alert.sendKeys(valor);
        alert.accept();
    }

    public String alertaObterTextoEAceita() {
        Alert alert = getDriver().switchTo().alert();
        String valor = alert.getText();
        alert.accept();
        return valor;
    }

    public String alertaObterTextoENega() {
        Alert alert = getDriver().switchTo().alert();
        String valor = alert.getText();
        alert.dismiss();
        return valor;
    }

    /* ------- FRAMES E JANELAS -------- */

    public void entrarFrame(String id) {
        getDriver().switchTo().frame(id);
    }

    public void sairFrame() {
        getDriver().switchTo().defaultContent();
    }

    public void trocarJanela(String id) {
        getDriver().switchTo().window(id);
    }

    /*------------JavaScript -----------------*/

    public Object executarJS(String cmd, Object... param) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        return js.executeScript(cmd, param);
    }

    /*------------Tabela -----------------*/

    public void clicarBotaoTabela(String colunaBusca, String valor, String colunaBotao, String idTabela) {

        // procurar coluna do registro
        WebElement tabela = getDriver().findElement(By.xpath("//*[@id='elementosForm:tableUsuarios']"));
        int idColuna = ObterIndiceColuna(colunaBusca, tabela);

        // encontrar a linha do registro
        int idLinha = obterIndiceLinha(valor, tabela, idColuna);

        // procurar coluna do botao
        int idColunaBotao = ObterIndiceColuna(colunaBotao, tabela);

        // clicar no botao da celula encontrada
        WebElement celula = tabela.findElement(By.xpath(".//tr[" + idLinha + "]/td[" + idColunaBotao + "]"));
        celula.findElement(By.xpath(".//input")).click();
    }

    protected int obterIndiceLinha(String valor, WebElement tabela, int idColuna) {
        List<WebElement> linhas = tabela.findElements(By.xpath("./tbody/tr/td[" + idColuna + "]"));
        int idLinha = -1;
        for (int i = 0; i < linhas.size(); i++) {
            if (linhas.get(i).getText().equals(valor)) {
                idLinha = i + 1; // no xpath o ??ndice come??a com 1, ent??o essa linha iguala o c??digo e o xpath
                break;
            }
        }
        return idLinha;
    }

    protected int ObterIndiceColuna(String coluna, WebElement tabela) {
        List<WebElement> colunas = tabela.findElements(By.xpath(".//th"));
        int idColuna = -1;
        for (int i = 0; i < colunas.size(); i++) {
            if (colunas.get(i).getText().equals(coluna)) {
                idColuna = i + 1; // no xpath o ??ndice come??a com 1, ent??o essa linha iguala o c??digo e o xpath
                break;
            }
        }
        return idColuna;
    }

}
