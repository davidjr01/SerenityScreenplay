package Config;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;

public class SetTheStage {
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());

    }
}
