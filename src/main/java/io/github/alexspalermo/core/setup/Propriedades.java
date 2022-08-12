package io.github.alexspalermo.core.setup;

public class Propriedades {

    public static boolean FECHAR_BROWSER = true;

    public static Browsers browser = Browsers.CHROME;

    public enum Browsers {
        CHROME,
        FIREFOX,
        HEADLESS
    }
}
