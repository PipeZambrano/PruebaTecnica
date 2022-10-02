package co.com.choucair.tested.certification.Prueba_Utest.stepdefinitions;

import co.com.choucair.tested.certification.Prueba_Utest.tasks.RegisterUserReto;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterUserStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Andres");
    }

    @Given("^User in the home page$")
    public void userInTheHomePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.utest.com/"));

    }

    @When("^User create an account filling all fields$")
    public void userCreateAnAccountFillingAllFields() {
        theActorInTheSpotlight().attemptsTo(RegisterUserReto.makeinformation());

    }

    @Then("^User sees its username$")
    public void userSeesItsUsername() {

    }
}
