package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class productosDamas {
	
	public static final Target BTN_RESULTADO_ALEATORIO_AUTOMATION = Target.the("Btn resultado aleatorio")
			.locatedBy("//ul[@class='product_list grid row']//li[contains(@class,'ajax_block')]//div//h5//a");
	
	public static final Target LBL_CARGA_VISTA_AUTOMATION = Target.the("LBL carga vista")
			.locatedBy("(//div[contains(text(),'Showing')])[1]");
	
}
