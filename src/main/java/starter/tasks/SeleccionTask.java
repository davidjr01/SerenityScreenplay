package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Select;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static starter.userinterfaces.PageHome.*;

public class SeleccionTask implements Task {
    public Double[] Lpecios;



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(sel2)
        );

    }

    public void ObeterDatosP(){
        Lpecios=new Double[PrecioProductos.size()];
        for (int i = 0; i <PrecioProductos.size(); i++){
            String x;
            x=PrecioProductos.get(i).getText().replace("$","");
            Double x2=Double.parseDouble(x);
            Lpecios[i]=x2;
        }

    }


    public static SeleccionTask Filtracion() {

        return instrumented(SeleccionTask.class);
    }

}
