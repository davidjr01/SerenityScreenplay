package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import starter.userinterfaces.PageHome;

public class ValidacionHomePage implements Question <String> {

    public static Question<String>Value(){
        return new ValidacionHomePage();
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(PageHome.TituloV).getText();
    }
}
