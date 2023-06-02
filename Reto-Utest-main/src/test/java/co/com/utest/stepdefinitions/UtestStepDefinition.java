package co.com.utest.stepdefinitions;

import co.com.utest.model.UtestDatos;
import co.com.utest.question.Responder;
import co.com.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UtestStepDefinition {

    @Before
    public void setStager(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Eduar desea registrarse en la plataforma Utest$")
    public void EduarDeseaRegistrarseEnLaPlataformaUtest() throws Exception {
        theActorCalled("Eduar").wasAbleTo(AbrirPaginaUtest.laPagina());
    }


    @When("^El usuario ingresa toda la informacion requerida por la pagina$")
    public void elUsuarioIngresaTodaLaInformacionRequeridaPorLaPagina(List<UtestDatos> datos) throws Exception {
        theActorInTheSpotlight().attemptsTo(LlenarPaginaInfoPersonal.laPagina(datos), LlenarPaginaDireccion.laPagina(datos),
                LlenarPaginaDispositivos.laPagina(datos), LlenarPaginaFinal.laPagina(datos)
        );
    }

    @Then("^El registro se completa cuando aparece el boton Complete Setup$")
    public void elRegistroSeCompletaCuandoApareceElBotonCompleteSetup(List<UtestDatos> datos) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Responder.aLos(datos)));
    }
}
