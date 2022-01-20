package interations;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import java.util.List;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userInterfaces.productosDamas;
import util.NumAleatorio;
import variablesGlobales.VariablesGlobales;

public class ClickProductoAleatorioAutomationPractice implements Interaction{

	@Override
	public <T extends Actor> void performAs(T actor) {
		WaitUntil.the(productosDamas.LBL_CARGA_VISTA_AUTOMATION, isVisible()).forNoMoreThan(10).seconds();
		List<WebElementFacade> listaBotonesProductos = productosDamas.BTN_RESULTADO_ALEATORIO_AUTOMATION.resolveAllFor(actor);
		int numAleatorio = NumAleatorio.generarRandom(listaBotonesProductos);
		System.out.println(numAleatorio);
		VariablesGlobales.nombreProductoAleatorio = listaBotonesProductos.get(numAleatorio).getText();
		listaBotonesProductos.get(numAleatorio).click();
	}
	
	public static Performable on() {
		return Instrumented.instanceOf(ClickProductoAleatorioAutomationPractice.class).withProperties();
	}

}
