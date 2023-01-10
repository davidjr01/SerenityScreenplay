package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ui.Select;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static starter.userinterfaces.PageHome.sel2;

public class FiltrarTask implements Task {
    public static String valor,item;

    public FiltrarTask(String valor){
        this.valor=valor;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Select.values("za").from(sel2)
        );

    }

    public static FiltrarTask FiltracionPor(String valor) {

        return instrumented(FiltrarTask.class,valor);
    }

}
