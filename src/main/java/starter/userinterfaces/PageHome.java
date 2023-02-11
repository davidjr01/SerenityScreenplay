package starter.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.List;

public class PageHome extends PageObject {
    public static By TituloV= By.xpath("//span[@class='title']");
    public static final Target sel2=Target.the("Seleccion de filtros").locatedBy("//select[@class='product_sort_container']");
    public static final Target PrecioProductos=Target.the("lista de  precio de Prodcutos").locatedBy("//div[@class='inventory_item_price']");
    public static final Target TitulosProductos=Target.the("lista de  precio de Prodcutos").locatedBy("//div[@class='inventory_item_name']");
    public static final Target BtAgregar=Target.the("Boton agregar producto").locatedBy("//button[@id='add-to-cart-sauce-labs-backpack']");
    public static final Target BT_Carrito=Target.the("Boton Carrito").locatedBy("//a[@class='shopping_cart_link']");







}
