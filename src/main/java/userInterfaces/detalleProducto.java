package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class detalleProducto {
	
	public static final Target LBL_DETALLE_AUTOMATION = Target.the("LBL Detalle del producto").
			locatedBy("//h1[contains(text(),'{0}')]");
}
