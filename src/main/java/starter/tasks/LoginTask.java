package starter.tasks;

import lombok.extern.java.Log;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static starter.userinterfaces.LoginPage.*;


public class LoginTask implements Task {

    private String usuario, password,titulo;
    public  LoginTask(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(ImputUsuario),
                Enter.theValue(password).into(ImputPassword),
                Click.on(BotonLogin)
        );


    }

    public static LoginTask IngresarCredenciales(String usuario, String password) {
        return instrumented(LoginTask.class,usuario,password);
    }

}
