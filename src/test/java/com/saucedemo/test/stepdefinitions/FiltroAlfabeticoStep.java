package com.saucedemo.test.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.questions.ValidacionFiltroAlfa;
import starter.tasks.FAlfabeticoTask;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class FiltroAlfabeticoStep {
    @When("filtra busqueda por nombre de producto  {string}")
    public void filtrarBusquedaPorNombreDeProducto(String Valor) {
        theActorInTheSpotlight().wasAbleTo(
                FAlfabeticoTask.FiltracionPor(Valor)
        );

    }
    @Then("Valida que se haya filtrado de forma alfabetica {string}")
    public void validamosQueSeHayaFiltradoDeFormaAlfabetica(String Valor) {
        theActorInTheSpotlight().should(
                seeThat("validacion filtro", ValidacionFiltroAlfa.Value(),equalTo(Valor))
        );

    }
}
