package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class index {
	public static final Target TXT_BUSCADOR_AUTOMATION = Target.the("Txt buscador producto").
			locatedBy("//input[@id='search_query_top']");

	public static final Target BTN_BUSCADOR_AUTOMATION = Target.the("Btn buscador producto").
			locatedBy("//button[@name='submit_search']");
	
	public static final Target BTN_WOMEN_AUTOMATION = Target.the("Btn categoria dama").
			locatedBy("//a[@title='Women']");
}
