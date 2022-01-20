package interations;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import userInterfaces.resultadoBusqueda;
import variablesGlobales.VariablesGlobales;

public class ExtraccionProductoFallidoAutomationPractice implements Interaction {

	@Override
	public <T extends Actor> void performAs(T actor) {
		if(resultadoBusqueda.LBL_RESULTADO_AUTOMATION.resolveFor(actor).getText().contains("0 results")) {
			VariablesGlobales.setResultadoFallido(resultadoBusqueda.LBL_RESULTADO_AUTOMATION.resolveFor(actor).getText());
		}
	}
	
	public static Performable on() {
		return Instrumented.instanceOf(ExtraccionProductoFallidoAutomationPractice.class).withProperties();
	}

}
