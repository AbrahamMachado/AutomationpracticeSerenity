package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SeleniumWebDriver;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.BuscarProductoAutomationPractice;
import userInterfaces.detalleProducto;

public class BuscarProductosStepDefinitions {
	
	@Before
	public void before() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("^me ubico en la pagina (.*)$")
	public void meUbicoEnLaPagina(String url) {
		OnStage.theActorCalled("personaje").can(BrowseTheWeb.with(SeleniumWebDriver.ChromeWebDriver().on(url)));
	}


	@When("^busco los productos (.*) en la plataforma$")
	public void buscoLosProductosEnLaPlataforma(String producto) {
		OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoAutomationPractice.on(producto));
	}

	@Then("^se valida que el producto (.*) sea el correcto$")
	public void seValidaQueElProductoSeaElCorrecto(String producto) {
		OnStage.theActorInTheSpotlight().
			should(GivenWhenThen.seeThat(WebElementQuestion.the(detalleProducto.LBL_DETALLE_AUTOMATION.of(producto)), 
				   WebElementStateMatchers.containsText(producto)));
	}
	
}
