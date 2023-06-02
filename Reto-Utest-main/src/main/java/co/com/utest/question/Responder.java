package co.com.utest.question;

import co.com.utest.model.UtestDatos;
import co.com.utest.userinterface.PaginaFinal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Responder implements Question<Boolean> {
    private List<UtestDatos> datos;

    public Responder(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static Responder aLos(List<UtestDatos> datos) {
        return new Responder(datos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String Mensaje_final = Text.of(PaginaFinal.MENSAJE_BIENVENIDA).viewedBy(actor).asString();
        return datos.get(0).getStrTextoFinal().equals(Mensaje_final);
    }
}
