package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import starter.userinterfaces.CheckOutPage;

public class ValidacionCheckout implements Question<String> {
    public static Question<String>Value(){
        return new ValidacionCheckout();
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(CheckOutPage.Titulo_CheckOut).getText();
    }

}
