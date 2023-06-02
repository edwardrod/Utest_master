package co.com.utest.tasks;

import co.com.utest.model.UtestDatos;
import co.com.utest.userinterface.PaginaDispositivos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;
import static co.com.utest.userinterface.PaginaDispositivos.*;

public class LlenarPaginaDispositivos implements Task {
    private List<UtestDatos> datos;

    public LlenarPaginaDispositivos(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static LlenarPaginaDispositivos laPagina(List<UtestDatos> datos) {
        return Tasks.instrumented(LlenarPaginaDispositivos.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(//Click.on(BORRAR_CONTENEDOR_COMPUTADOR),
                Click.on(CONTENEDOR_COMPUTADOR),
                Enter.theValue(datos.get(0).getStrComputador()).into(COMPUTADOR).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONTENEDOR_VERSION_COMPUTADOR),
                Enter.theValue(datos.get(0).getStrVersionComputador()).into(VERSION_COMPUTADOR).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONTENEDOR_LENGUAJE_COMPUTADOR),
                Enter.theValue(datos.get(0).getStrLenguajeComputador()).into(LENGUAJE_COMPUTADOR).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONTENEDOR_DISPOSITIVO_MOVIL),
                Enter.theValue(datos.get(0).getStrDispositivoMovil()).into(DISPOSITIVO_MOVIL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONTENEDOR_MODELO_DISPOSITIVO_MOVIL),
                Enter.theValue(datos.get(0).getStrModeloDispositivoMovil()).into(MODELO_DISPOSITIVO_MOVIL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONTENEDOR_SISTEMAOPERATIVO_MOVIL),
                Enter.theValue(datos.get(0).getStrSistemaOperativoMovil()).into(SISTEMAOPERATIVO_MOVIL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(BOTON_PASOFINAL)
        );

    }
}
