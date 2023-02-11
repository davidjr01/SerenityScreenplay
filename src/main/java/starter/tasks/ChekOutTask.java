package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static starter.userinterfaces.CarritoPage.*;

public class ChekOutTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Btn_CheckOut)
        );
    }
    public static ChekOutTask BtnChecOut() {

        return instrumented(ChekOutTask.class);
    }
}
