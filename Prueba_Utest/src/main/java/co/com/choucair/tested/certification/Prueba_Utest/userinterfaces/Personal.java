package co.com.choucair.tested.certification.Prueba_Utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Personal {
    public static final Target FIRSTNAME = Target.the("first name").
            locatedBy("//input[@id=\"firstName\"]");

    public static final Target LASTNAME = Target.the("last name").
            locatedBy("//input[@id=\"lastName\"]");

    public static final Target EMAIL = Target.the("email").
            locatedBy("//input[@id=\"email\"]");

    public static final Target BIRTHMONTH = Target.the("month").
            locatedBy("//select[@id=\"birthMonth\"]");

    public static final Target BIRTHDAY = Target.the("day").
            locatedBy("//select[@id=\"birthDay\"]");

    public static final Target BIRTHYEAR = Target.the("year").
            locatedBy("//select[@id=\"birthYear\"]");

    public static final Target NEXTLOCATION = Target.the("nextlocation").
            locatedBy("//a[@class=\"btn btn-blue\"]");


}
