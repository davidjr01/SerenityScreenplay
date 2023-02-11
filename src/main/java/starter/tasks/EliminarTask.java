package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static starter.userinterfaces.CarritoPage.*;

public class EliminarTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Btn_Eliminar),
                Click.on(Btn_Regresar)
        );

    }
    public static EliminarTask Eliminar() {

        return instrumented(EliminarTask.class);
    }
}
