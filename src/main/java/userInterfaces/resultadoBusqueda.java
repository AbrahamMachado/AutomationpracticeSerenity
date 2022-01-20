package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class resultadoBusqueda {
	
	public static final Target LBL_RESULTADO_AUTOMATION = Target.the("LBL Resultado busqueda")
			.locatedBy("//span[contains(text(),'been found')]");
	
	public static final Target BTN_RESULTADO_AUTOMATION = Target.the("BTN producto")
			.locatedBy("//ul[contains(@class,'product_list')]//li[contains(@class,'first')]//a[contains(text(),'{0}')]");
	
}