package co.com.choucair.tested.certification.Prueba_Utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Location {

    public static final Target BTNLOCATION = Target.the("btn location").
            locatedBy("//a[@aria-label=\"Next step - select your devices\"]");
}

