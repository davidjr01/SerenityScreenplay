package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static starter.userinterfaces.PageHome.*;

public class BtnCarritoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BT_Carrito)
        );

    }
    public static BtnCarritoTask BtnCarrito() {

        return instrumented(BtnCarritoTask.class);
    }
}
