package co.com.choucair.tested.certification.Prueba_Utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Devices {

    public static final Target SISTEMA = Target.the("sistema").
            locatedBy("(//span[@class=\"ui-select-match-text pull-left ui-select-allow-clear\"])[1]");

    public static final Target WINDOWS = Target.the("windows").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[2]");

    public static final Target VERSION = Target.the("version").
            locatedBy("(//span[@class=\"ui-select-match-text pull-left ui-select-allow-clear\"])[2]");

    public static final Target XP = Target.the("xp").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[2]");

    public static final Target LANGUAGE = Target.the("language").
            locatedBy("(//span[@class=\"ui-select-match-text pull-left ui-select-allow-clear\"])[3]");

    public static final Target ENGLISH = Target.the("english").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[11]");

    public static final Target BTNLASTFINAL = Target.the("btn last final").
            locatedBy("//span[@aria-label=\"Next - final step\"]");



}

