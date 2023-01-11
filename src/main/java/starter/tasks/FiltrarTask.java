package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ui.Select;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static starter.userinterfaces.PageHome.PrecioProductos;
import static starter.userinterfaces.PageHome.sel2;

public class FiltrarTask implements Task {
    public static String valor,item;

    public Double[] Lpecios;

    public static String flagPrice="False";

    public FiltrarTask(String valor){
        this.valor=valor;
        SetItems(valor);
    }

    public static void SetItems(String valor){
        if(valor.equals("LowPrice")){
            item="lohi";
        }else if(valor.equals("HighPrice")){
            item="hilo";
        }
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Select.values(item).from(sel2)
        );
        validacion();
    }

    public void validacion(){
        int sizes=PrecioProductos.resolveAllFor(theActorInTheSpotlight()).size();
        if(valor.equals("LowPrice")){
            ObeterDatosP();
            for (int i = 0; i <sizes-1; i++) {
                if(Lpecios[i]<=Lpecios[i+1]){
                    flagPrice="True";
                }else{
                    flagPrice="False";
                    break;
                }
            }
        }else if(valor.equals("HighPrice")){
            ObeterDatosP();
            for (int i = 0; i <sizes-1; i++) {
                if(Lpecios[i]>=Lpecios[i+1]){
                    flagPrice="True";
                }else{
                    flagPrice="False";
                    break;
                }
            }
        }
    }

    public void ObeterDatosP(){
        int sizes=PrecioProductos.resolveAllFor(theActorInTheSpotlight()).size();
        Lpecios=new Double[sizes];
        for (int i = 0; i <sizes; i++){
            String x;
            x=PrecioProductos.resolveAllFor(theActorInTheSpotlight()).get(i).getText().replace("$","");
            Double x2=Double.parseDouble(x);
            Lpecios[i]=x2;
        }
    }


    public static FiltrarTask FiltracionPor(String valor) {

        return instrumented(FiltrarTask.class,valor);
    }

}
