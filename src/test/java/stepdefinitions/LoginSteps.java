package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.WebDriver;
import starter.tasks.LoginTask;
import starter.userinterfaces.LoginPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actions.Hit.the;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class LoginSteps {
    private WebDriver navegador;
    //private Actor actor= Actor.named("David");
    private LoginPage loginPage=new LoginPage();


    @Given("que el usuario ingrese a la pagina web")
    public void queElUsuarioIngreseALaPaginaWeb() {
        theActorCalled("david").can(BrowseTheWeb.with(navegador));
        theActorInTheSpotlight().wasAbleTo(Open.browserOn(loginPage));

    }

    @When("el se logea con las credenciales {string} {string}")
    public void elSeLogeaConLasCredenciales(String usuario, String password) {
        theActorInTheSpotlight().wasAbleTo(
                LoginTask.IngresarCredenciales(usuario,password)
        );

    }
    @Then("el valida  en la pagina principal {string}")
    public void elValidaEnLaPaginaPrincipal(String titulo) {


    }
}
