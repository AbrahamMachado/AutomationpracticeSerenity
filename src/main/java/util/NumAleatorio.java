package util;

import java.util.List;
import java.util.Random;

import net.serenitybdd.core.pages.WebElementFacade;

public class NumAleatorio {
	
	public static int numAleatorio;

	public int getNumAleatorio() {
		return numAleatorio;
	}
	
	public static int generarRandom(List<WebElementFacade> lista) {
		Random random = new Random();
		numAleatorio = random.nextInt(lista.size());
		return numAleatorio;
	}

}
