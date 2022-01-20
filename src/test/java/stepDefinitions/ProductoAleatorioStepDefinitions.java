package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.BuscarProductoAleatorioAutomationPractice;
import userInterfaces.detalleProducto;
import variablesGlobales.VariablesGlobales;

public class ProductoAleatorioStepDefinitions {
	
	@Before
	public void before() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@When("^busco un producto aleatorio en la plataforma$")
	public void buscoUnProductoAleatorioEnLaPlataforma() {
		OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoAleatorioAutomationPractice.on());
	}

	@Then("^se valida que el producto aleatorio es correcto$")
	public void seValidaQueElProductoAleatorioEsCorrecto() {
		System.out.println(VariablesGlobales.nombreProductoAleatorio);
		OnStage.theActorInTheSpotlight().
			should(GivenWhenThen.seeThat(WebElementQuestion.the(detalleProducto.LBL_DETALLE_AUTOMATION.of(VariablesGlobales.nombreProductoAleatorio)), 
				   WebElementStateMatchers.containsText(VariablesGlobales.nombreProductoAleatorio)));
	}

}
