package starter.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.saucedemo.com")
public class LoginPage extends PageObject {

    public static final Target ImputUsuario=Target.the("Imput par el usuario").locatedBy("//input[@id='user-name']");
    public static final Target ImputPassword=Target.the("Imput par el password").locatedBy("//input[@id='password']");
    public static final Target BotonLogin=Target.the("Boton para login").locatedBy("//input[@id='login-button']");


}
