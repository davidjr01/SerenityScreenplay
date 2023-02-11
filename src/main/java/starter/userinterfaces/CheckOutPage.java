package starter.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CheckOutPage extends PageObject {
    public static final Target Titulo_CheckOut=Target.the("Titulo de la pagina del carrito de compras").locatedBy("//span[@class='title']");
    public static final Target Nombre=Target.the("Titulo de la pagina del carrito de compras").locatedBy("//input[@id='first-name']");
    public static final Target Apellido=Target.the("Titulo de la pagina del carrito de compras").locatedBy("//input[@id='last-name']");
    public static final Target Zips=Target.the("Titulo de la pagina del carrito de compras").locatedBy("//input[@id='postal-code']");
    public static final Target Btn_Continuar=Target.the("Titulo de la pagina del carrito de compras").locatedBy("//input[@id='continue']");
    public static final Target Btn_Finish=Target.the("Titulo de la pagina del carrito de compras").locatedBy("//button[@id='finish']");
    public static final Target Btn_BackHome=Target.the("Titulo de la pagina del carrito de compras").locatedBy("//button[@id='back-to-products']");


}
