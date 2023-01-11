package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.tasks.FAlfabeticoTask;

public class ValidacionFiltroAlfa  implements Question<String> {
    public static Question<String>Value(){
        return new ValidacionFiltroAlfa();
    }
    @Override
    public String answeredBy(Actor actor) {
        return FAlfabeticoTask.flagTittle;
    }
}
