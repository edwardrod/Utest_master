package co.com.utest.tasks;

import co.com.utest.model.UtestDatos;
import co.com.utest.userinterface.PaginaFinal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import static co.com.utest.userinterface.PaginaFinal.*;

public class LlenarPaginaFinal implements Task {
    private List<UtestDatos> datos;

    public LlenarPaginaFinal(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static LlenarPaginaFinal laPagina(List<UtestDatos> datos) {
        return Tasks.instrumented(LlenarPaginaFinal.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.get(0).getStrContrasena()).into(CONTRASENA),
                Enter.theValue(datos.get(0).getStrContrasena()).into(CONFIRMAR_CONTRASENA),
                Click.on(CHECKBOX_01),
                Click.on(CHECKBOX_02),
                Click.on(CHECKBOX_03),
                Click.on(BOTON_FINAL)
                );
    }
}
