package com.saucedemo.test.stepdefinitions;

import com.saucedemo.test.Config.SetTheStage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.tasks.FiltrarTask;
import starter.tasks.LoginTask;
import starter.tasks.SeleccionTask;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class HomeSteps {
    private SetTheStage sets=new SetTheStage();
    @Given("que el usuario de click a la seccion de filtracion")
    public void queElUsuarioDeClickALaSeccionDeFiltracion() {
        //sets.setTheStage();
        /*/theActorCalled("david").wasAbleTo(
                SeleccionTask.Filtracion()
        ); */
        theActorInTheSpotlight().wasAbleTo(
                SeleccionTask.Filtracion()
        );

    }
    @When("filtrar busqueda por precio {string}")
    public void filtrarBusquedaPorPrecio(String Valor) {
        theActorInTheSpotlight().wasAbleTo(
                FiltrarTask.FiltracionPor(Valor)
        );

    }
    @Then("Validamos que se haya filtrado de forma correcta {string}")
    public void validamosQueSeHayaFiltradoDeFormaCorrecta(String string) {

    }

}
