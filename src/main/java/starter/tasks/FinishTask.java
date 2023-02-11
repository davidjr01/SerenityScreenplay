package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static starter.userinterfaces.CheckOutPage.*;

public class FinishTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Btn_Finish)
        );

    }
    public static FinishTask Finalizar() {

        return instrumented(FinishTask.class);
    }
}
