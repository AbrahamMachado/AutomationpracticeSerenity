package tasks;
import interations.ClickProductoAleatorioAutomationPractice;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userInterfaces.index;

public class BuscarProductoAleatorioAutomationPractice implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(index.BTN_WOMEN_AUTOMATION),
				ClickProductoAleatorioAutomationPractice.on()
				);
	}
	
	public static BuscarProductoAleatorioAutomationPractice on() {
		return Instrumented.instanceOf(BuscarProductoAleatorioAutomationPractice.class).withProperties();
	}

}
