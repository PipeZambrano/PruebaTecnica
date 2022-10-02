package co.com.choucair.tested.certification.Prueba_Utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Complete {

    public static final Target PASSWORD = Target.the("password").
            locatedBy("//input[@name=\"password\"]");

    public static final Target CONFIRMPASSWORD = Target.the("confirm password").
            locatedBy("//input[@name=\"confirmPassword\"]");

    public static final Target CHECKONE = Target.the("check one").
            locatedBy("//span[@class=\"checkmark signup-consent__checkbox error\"]");

    public static final Target CHECKTWO = Target.the("check two").
            locatedBy("//span[@ng-class=\"{error: userForm.privacySetting.$error.required}\"]");

    public static final Target BTNCOMPLETE = Target.the("btn complete").
            locatedBy("//a[@class=\"btn btn-blue\"]");
}
