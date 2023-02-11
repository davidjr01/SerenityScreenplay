package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ui.Select;
import starter.Util.FiltroUtil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static starter.userinterfaces.PageHome.PrecioProductos;
import static starter.userinterfaces.PageHome.sel2;

public class FiltrarTask implements Task {
    public static String valor,item;
    public static String flagPrice="False";
    public FiltroUtil filtro;
    public FiltrarTask(String valor){
        this.valor=valor;
        filtro=new FiltroUtil(valor);
        item=filtro.Selecciontems();
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Select.values(item).from(sel2)
        );
        flagPrice=filtro.Validacion();
    }
    public static FiltrarTask FiltracionPor(String valor) {
        return instrumented(FiltrarTask.class,valor);
    }
}
