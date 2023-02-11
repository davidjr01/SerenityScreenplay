package com.saucedemo.test.stepdefinitions;

import com.saucedemo.test.Config.SetTheStage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.questions.ValidacionCheckout;
import starter.questions.ValidacionProducto;
import starter.tasks.ChekOutTask;
import starter.tasks.FinishTask;
import starter.tasks.InformationTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class CheckOutSteps {
    private SetTheStage sets=new SetTheStage();
    @When("el usuario da click en el boton Checkout")
    public void leDaClickEnElBotonCheckout() {
        sets.setTheStage();
        theActorCalled("david").wasAbleTo(
                ChekOutTask.BtnChecOut()
        );
    }

    @When("el usuario ingresa sus credenciales {string} {string},{string}")
    public void elIngresaSusCredenciales(String nombre, String apellido, String zipCode) {

        theActorInTheSpotlight().attemptsTo(
                InformationTask.IngresarInformacion(nombre,apellido,zipCode)
        );

    }

    @When("el usuario da click en el boton FINISH")
    public void daClickEnElBotonFINISH() {
        theActorInTheSpotlight().attemptsTo(
                FinishTask.Finalizar()
        );

    }
    @Then("el usuario valida que se realizo la compra {string}")
    public void validaQueSeRealizoLaCompra(String Valor) {
        theActorInTheSpotlight().should(
                seeThat("El titululo Compras", ValidacionCheckout.Value(),equalTo(Valor))
        );

    }
}
