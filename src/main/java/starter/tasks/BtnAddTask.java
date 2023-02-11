package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static starter.userinterfaces.PageHome.*;


public class BtnAddTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BtAgregar)
        );

    }
    public static BtnAddTask Agregar() {

        return instrumented(BtnAddTask.class);
    }
}
