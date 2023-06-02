package co.com.utest.tasks;

import co.com.utest.model.UtestDatos;
import co.com.utest.userinterface.PaginaDireccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;
import static co.com.utest.userinterface.PaginaDireccion.*;

public class LlenarPaginaDireccion implements Task {
    private List<UtestDatos> datos;

    public LlenarPaginaDireccion(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static LlenarPaginaDireccion laPagina(List<UtestDatos> datos) {
        return Tasks.instrumented(LlenarPaginaDireccion.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.get(0).getStrCiudad()).into(CIUDAD),
                Hit.the(Keys.ARROW_DOWN).into(CIUDAD),
                Hit.the(Keys.ENTER).into(CIUDAD),
                Enter.theValue(datos.get(0).getStrCodigoPostal()).into(CODIGO_POSTAL),
                Click.on(CONTENEDOR_PAIS),
                Enter.theValue(datos.get(0).getStrPais()).into(PAIS).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(BOTON_DISPOSITIVOS)
                );
    }
}
