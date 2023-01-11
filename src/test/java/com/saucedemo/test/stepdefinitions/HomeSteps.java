package com.saucedemo.test.stepdefinitions;

import com.saucedemo.test.Config.SetTheStage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.questions.ValidacionFiltroPrice;
import starter.questions.ValidacionHomePage;
import starter.tasks.FiltrarTask;
import starter.tasks.LoginTask;
import starter.tasks.SeleccionTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;


public class HomeSteps {
    private SetTheStage sets=new SetTheStage();
    @Given("el da click a la seccion de filtracion")
    public void queElUsuarioDeClickALaSeccionDeFiltracion() {
        //sets.setTheStage();
        /*/theActorCalled("david").wasAbleTo(
                SeleccionTask.Filtracion()
        ); */
        theActorInTheSpotlight().wasAbleTo(
                SeleccionTask.Filtracion()
        );

    }
    @When("el filtra la busqueda por precio {string}")
    public void filtrarBusquedaPorPrecio(String Valor) {
        theActorInTheSpotlight().wasAbleTo(
                FiltrarTask.FiltracionPor(Valor)
        );

    }
    @Then("valida que se haya filtrado de forma correcta {string}")
    public void validamosQueSeHayaFiltradoDeFormaCorrecta(String valor) {
        theActorInTheSpotlight().should(
                seeThat("validacion filtro", ValidacionFiltroPrice.Value(),equalTo(valor))
        );
    }

}
