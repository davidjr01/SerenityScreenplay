package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ui.Select;

import java.util.Arrays;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static starter.userinterfaces.PageHome.*;

public class FAlfabeticoTask implements Task {
    public static String valor,item;
    public String [] LProductos;
    public String [] lTemp;
    public static String flagTittle="False";


    public FAlfabeticoTask (String valor ){
        this.valor=valor;
        SetItems(valor);
    }
    public static void SetItems(String valor){
        if(valor.equals("Name(ZtoA)")){
            item="za";
        }else if(valor.equals("Name(AtoZ)")){
            item="az";
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
        int tam=TitulosProductos.resolveAllFor(theActorInTheSpotlight()).size();
        if(valor.equals("Name(ZtoA)")){
            ObeterTitulos();
            for (int i = 0; i <tam;i++){
                if(LProductos[i].equals(lTemp[(tam-1)-i])){
                    flagTittle="True";
                }
                else{
                    flagTittle="False";
                    break;
                }
            }


        }else if(valor.equals("Name(AtoZ)")){
            ObeterTitulos();
            for (int i = 0; i <tam;i++){
                if(LProductos[i]==lTemp[i]){
                    flagTittle="True";
                }else{
                    flagTittle="False";
                    break;
                }
            }
        }
    }
    public void ObeterTitulos(){
        int tam=TitulosProductos.resolveAllFor(theActorInTheSpotlight()).size();
        LProductos=new String[tam];
        lTemp=new String[tam];
        for (int i = 0; i <tam; i++){
            LProductos[i]=TitulosProductos.resolveAllFor(theActorInTheSpotlight()).get(i).getText();
            lTemp[i]=TitulosProductos.resolveAllFor(theActorInTheSpotlight()).get(i).getText();
        }
        Arrays.sort(lTemp);

    }

    public static FAlfabeticoTask FiltracionPor(String valor) {

        return instrumented(FAlfabeticoTask.class,valor);
    }

}
