package starter.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CarritoPage extends PageObject {
    public static final Target Titulo_Carrito=Target.the("Titulo de la pagina del carrito de compras").locatedBy("//span[@class='title']");
    public static final Target Titulo_Producto=Target.the("Titulo de la pagina del producto del carrito de compras").locatedBy("//div[@class='inventory_item_name']");
    public static final Target Btn_Eliminar=Target.the("Boton Eliminar").locatedBy("//button[@id='remove-sauce-labs-backpack']");
    public static final Target Btn_Regresar=Target.the("Titulo de la pagina del carrito de compras").locatedBy("//button[@id='continue-shopping']");
    public static final Target Btn_CheckOut=Target.the("Titulo de la pagina del carrito de compras").locatedBy("//button[@id='checkout']");
}
