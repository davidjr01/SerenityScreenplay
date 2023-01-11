package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.tasks.FiltrarTask;

public class ValidacionFiltroPrice implements Question<String> {

    public static Question<String>Value(){
        return new ValidacionFiltroPrice();
    }
    @Override
    public String answeredBy(Actor actor) {
        return FiltrarTask.flagPrice;
    }
}
