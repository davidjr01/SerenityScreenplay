package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import starter.userinterfaces.CarritoPage;

public class ValidarTituloCarrito implements Question<String> {

    public static Question<String>Value(){
        return new ValidarTituloCarrito();
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(CarritoPage.Titulo_Carrito).getText();
    }
}
