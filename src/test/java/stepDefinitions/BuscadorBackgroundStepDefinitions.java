package stepDefinitions;

import java.util.List;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.Producto;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.BuscarProductoAutomationPractice;
import userInterfaces.detalleProducto;
import userInterfaces.resultadoBusqueda;
import variablesGlobales.VariablesGlobales;

public class BuscadorBackgroundStepDefinitions {
	
	@Before
	public void before() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@When("^busco el producto en la url de automation$")
	public void buscoElProductoEnLaUrlDeAutomation(List<Producto> productos) {
		//OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoAutomationPractice.on(productos.get(0).getNombreProducto()));	
	}


	@Then("^se valida si el producto buscado en pantalla sea el correcto$")
	public void seValidaSiElProductoBuscadoEnPantallaSeaElCorrecto() {
//		if(VariablesGlobales.getResultadoFallido() == null) {
//			OnStage.theActorInTheSpotlight().
//			should(GivenWhenThen.seeThat(WebElementQuestion.the(detalleProducto.LBL_DETALLE_AUTOMATION.of(VariablesGlobales.getNombreProductoBuscado())), 
//				   WebElementStateMatchers.containsText(VariablesGlobales.getNombreProductoBuscado())));
//		}else {
//			OnStage.theActorInTheSpotlight().
//			should(GivenWhenThen.seeThat(WebElementQuestion.the(resultadoBusqueda.LBL_RESULTADO_AUTOMATION), 
//				   WebElementStateMatchers.containsText(VariablesGlobales.getResultadoFallido())));
//			VariablesGlobales.setResultadoFallido(null);
//		}
	}
	
}