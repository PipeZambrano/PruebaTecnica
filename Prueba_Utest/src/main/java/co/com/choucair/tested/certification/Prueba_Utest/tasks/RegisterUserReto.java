package co.com.choucair.tested.certification.Prueba_Utest.tasks;

import co.com.choucair.tested.certification.Prueba_Utest.userinterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterUserReto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Home.REGISTER),
                SendKeys.of("Andres").into(Personal.FIRSTNAME),
                SendKeys.of("Zambrano").into(Personal.LASTNAME),
                SendKeys.of("zamborojas@gmail.com").into(Personal.EMAIL),
                SendKeys.of("August").into(Personal.BIRTHMONTH),
                SendKeys.of("24").into(Personal.BIRTHDAY),
                SendKeys.of("2001").into(Personal.BIRTHYEAR),
                Click.on(Personal.NEXTLOCATION),
                Click.on(Location.BTNLOCATION),
                Click.on(Devices.SISTEMA),
                Click.on(Devices.WINDOWS),
                Click.on(Devices.VERSION),
                Click.on(Devices.XP),
                Click.on(Devices.LANGUAGE),
                Click.on(Devices.ENGLISH),
                Click.on(Devices.BTNLASTFINAL),
                SendKeys.of("Qwerasdf1234*").into(Complete.PASSWORD),
                SendKeys.of("Qwerasdf1234*").into(Complete.CONFIRMPASSWORD),
                Click.on(Complete.CHECKONE),
                Click.on(Complete.CHECKTWO),
                Click.on(Complete.BTNCOMPLETE)


        );
    }
    public static RegisterUserReto makeinformation(){
        return instrumented(RegisterUserReto.class);
    }
}
