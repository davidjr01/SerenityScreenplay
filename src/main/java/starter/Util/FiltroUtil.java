package starter.Util;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static starter.userinterfaces.PageHome.PrecioProductos;

public class FiltroUtil {
    public static  String valor;
    public Double[] Lpecios;
    public static String flagPrice="False";
    public FiltroUtil(String valor) {
        this.valor=valor;
    }
    public String Selecciontems(){
        String item="";
        if(valor.equals("LowPrice")){
            item="lohi";
        }else if(valor.equals("HighPrice")){
            item="hilo";
        }
        return item;
    }

    public String Validacion(){
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
        return flagPrice;
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
}
