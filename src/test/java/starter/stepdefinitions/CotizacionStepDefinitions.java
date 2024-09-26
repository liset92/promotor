package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.CoreMatchers;
import org.openqa.selenium.WebDriver;
import starter.questions.CotizadorQuestions;
import starter.questions.LoggedQuestions;
import starter.questions.RenovacionQuestions;

import starter.tasks.CompletarCotizador;
import starter.tasks.Login;
import starter.tasks.SeleccionarCotizador;
import starter.tasks.NuevaSolicitud;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CotizacionStepDefinitions {

    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Abrimos la apk")
    public void abrimos_la_apk() {
        theActorCalled("Apk abierta");
    }

    @When("Hacemos login con credenciales validas")
    public void hacemos_login_con_credenciales_validas() {
        theActorInTheSpotlight().attemptsTo(new Login());
    }

    @Then("Muestra el Home")
    public void muestra_el_home() {
        String expectedHolaText = "Hola,";
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        "texto hola",
                        LoggedQuestions.value(),
                        CoreMatchers.equalTo(expectedHolaText)
                )
        );
    }

    @Then("Vamos a Nueva Solicitud")
    public void vamos_a_nueva_solicitud() {
        theActorInTheSpotlight().attemptsTo(new NuevaSolicitud());
    }

    @Then("Muestra el Cotizador")
    public void muestra_el_cotizador() {
        String expectedHolaText = "Cotizador";
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        "texto cotizador",
                        CotizadorQuestions.value(),
                        CoreMatchers.equalTo(expectedHolaText)
                )
        );
    }

    @When("Seleccionamos datos de cotizacion")
    public void Seleccionamos_datos_de_cotizacion() {
        theActorInTheSpotlight().attemptsTo(new SeleccionarCotizador());
    }

    @Then("Muestra texto renovacion sobre capacidad de pago")
    public void texto_renovacion() {
        String expectedHolaText = "¿es una renovación Intercompañía y/o CNCA?";
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        "texto renovación",
                        RenovacionQuestions.value(),
                        CoreMatchers.equalTo(expectedHolaText)
                )
        );
    }
    @When("Completar datos de cotizacion")
    public void Completar_datos_de_cotizacion() {
        theActorInTheSpotlight().attemptsTo(new CompletarCotizador());
    }
    @Then("Muestra Resultados de Cotizacion")
    public void resultados_cotizacion() {
        String expectedHolaText = "Resultados de cotizaciones";
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        "texto resultados",
                        RenovacionQuestions.value(),
                        CoreMatchers.equalTo(expectedHolaText)
                )
        );

}

}















































































































