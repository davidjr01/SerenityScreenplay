package starter.Util;

import java.util.Arrays;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static starter.userinterfaces.PageHome.TitulosProductos;

public class FiltroAlfabetica {
    public static String valor;
    public String [] LProductos;
    public String [] lTemp;
    public static String flagTittle="False";
    public  FiltroAlfabetica(String valor){
        this.valor=valor;
    }
    public String validacion(){
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
        return  flagTittle;
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
    public static String SeleccionarItems(){
        String item="";
        if(valor.equals("Name(ZtoA)")){
            item="za";
        }else if(valor.equals("Name(AtoZ)")){
            item="az";
        }
        return item;
    }
}
