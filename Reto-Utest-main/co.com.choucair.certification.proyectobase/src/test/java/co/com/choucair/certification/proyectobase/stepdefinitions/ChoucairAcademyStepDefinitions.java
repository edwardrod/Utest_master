package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast()); }

    @Given("^than brandon wants to learn automation at the academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair() {
       OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage());
    }


    @When("^he search for the course Examen JAVA - Cursos y Certificaciones on the choucair academy platform$")
    public void heSearchForTheCourseExamenJAVACursosYCertificacionesOnTheChoucairAcademyPlatform() {

    }

    @Then("^he finds the course called resources Examen JAVA - Cursos y Certificaciones$")
    public void heFindsTheCourseCalledResourcesExamenJAVACursosYCertificaciones() {

    }

}
