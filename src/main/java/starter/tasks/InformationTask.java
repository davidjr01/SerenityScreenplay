package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static starter.userinterfaces.CheckOutPage.*;

public class InformationTask implements Task {
    public static String nombre,apellido,zipCode;
    public InformationTask(String nombre, String apellido,String zipCode){
        this.nombre=nombre;
        this.apellido=apellido;
        this.zipCode=zipCode;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombre).into(Nombre),
                Enter.theValue(apellido).into(Apellido),
                Enter.theValue(zipCode).into(Zips),
                Click.on(Btn_Continuar)
        );


    }

    public static InformationTask IngresarInformacion(String nombre, String apellido,String zipCode) {
        return instrumented(InformationTask.class,nombre,apellido,zipCode);
    }
}
