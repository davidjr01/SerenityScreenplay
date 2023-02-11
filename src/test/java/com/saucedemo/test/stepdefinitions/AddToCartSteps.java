package com.saucedemo.test.stepdefinitions;

import com.saucedemo.test.Config.SetTheStage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.questions.ValidacionProducto;
import starter.questions.ValidarTituloCarrito;
import starter.tasks.BtnAddTask;
import starter.tasks.BtnCarritoTask;
import starter.tasks.EliminarTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class AddToCartSteps {
    private SetTheStage sets=new SetTheStage();
    @Given("el usuario agregue el producto al carrito de compras")
    public void elUsuarioAgregueElProductoAlCarritoDeCompras() {
        sets.setTheStage();
        theActorCalled("david").wasAbleTo(
                BtnAddTask.Agregar()
        );

    }
    @When("el usuario da click al boton  carrito de compras")
    public void elDaClickAlBotonCarritoDeCompras() {
        theActorInTheSpotlight().attemptsTo(
                BtnCarritoTask.BtnCarrito()
        );
    }
    @When("el usuario verifica que este en la pagina del carrito de compras {string}")
    public void verificaQueEsteEnLaPaginaDelCarritoDeCompras(String Valor) {
        theActorInTheSpotlight().should(
                seeThat("El titululo", ValidarTituloCarrito.Value(),equalTo(Valor))
        );

    }
    @When("el usuario valida que el producto se encuentre en el carrito {string}")
    public void validaQueElProductoSeEncuentreEnElCarrito(String Valor) {
        theActorInTheSpotlight().should(
                seeThat("El titululo del producto", ValidacionProducto.Value(),equalTo(Valor))
        );

    }
    @Then("el usuario elimina el producto del carrito y regresamos al home")
    public void eliminaElProductoDelCarritoYRegresamosAlHome() {
        theActorInTheSpotlight().attemptsTo(
                EliminarTask.Eliminar()
        );
    }
}
