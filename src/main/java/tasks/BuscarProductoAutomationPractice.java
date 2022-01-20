package tasks;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userInterfaces.detalleProducto;
import userInterfaces.index;
import userInterfaces.resultadoBusqueda;
import variablesGlobales.VariablesGlobales;

public class BuscarProductoAutomationPractice implements Task{
	
	private String producto;

	public BuscarProductoAutomationPractice(String producto) {
		this.producto = producto;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(producto).into(index.TXT_BUSCADOR_AUTOMATION),
				Click.on(index.BTN_BUSCADOR_AUTOMATION),
				WaitUntil.the(resultadoBusqueda.LBL_RESULTADO_AUTOMATION, isVisible()).forNoMoreThan(10).seconds(),
				interations.ExtraccionProductoFallidoAutomationPractice.on()
				);
		
		if(VariablesGlobales.getResultadoFallido() == null) {
			actor.attemptsTo(Click.on(resultadoBusqueda.BTN_RESULTADO_AUTOMATION.of(producto)));
			VariablesGlobales.setNombreProductoBuscado(detalleProducto.LBL_DETALLE_AUTOMATION.of(producto).resolveFor(actor).getText());
		}else {
			System.out.println("Producto buscado fallido");
		}
	}
	
	public static BuscarProductoAutomationPractice on(String producto) {
		return Instrumented.instanceOf(BuscarProductoAutomationPractice.class).withProperties(producto);
	}

}
