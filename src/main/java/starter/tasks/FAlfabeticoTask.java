package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ui.Select;
import starter.Util.FiltroAlfabetica;

import java.util.Arrays;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static starter.userinterfaces.PageHome.*;

public class FAlfabeticoTask implements Task {
    public static String valor,item;
    public static String flagTittle="False";
    public FiltroAlfabetica filtro;


    public FAlfabeticoTask (String valor ){
        this.valor=valor;
        filtro=new FiltroAlfabetica(valor);
        item=filtro.SeleccionarItems();
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Select.values(item).from(sel2)
        );
        flagTittle= filtro.validacion();
    }


    public static FAlfabeticoTask FiltracionPor(String valor) {

        return instrumented(FAlfabeticoTask.class,valor);
    }

}
