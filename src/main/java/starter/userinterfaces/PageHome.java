package starter.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PageHome extends PageObject {
    public static final Target TituloV=Target.the("Titulo de la pagina para validacion").locatedBy("//span[@class='title']");
}
