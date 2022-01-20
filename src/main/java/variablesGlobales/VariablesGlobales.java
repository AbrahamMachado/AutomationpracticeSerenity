package variablesGlobales;

public class VariablesGlobales {
	
	public static String nombreProductoAleatorio;
	
	public static String nombreProductoBuscado;
	
	public static String resultadoFallido;

	public static String getResultadoFallido() {
		return resultadoFallido;
	}

	public static void setResultadoFallido(String resultadoFallido) {
		VariablesGlobales.resultadoFallido = resultadoFallido;
	}

	public static String getNombreProductoAleatorio() {
		return nombreProductoAleatorio;
	}

	public static void setNombreProductoAleatorio(String nombreProductoAleatorio) {
		VariablesGlobales.nombreProductoAleatorio = nombreProductoAleatorio;
	}

	public static String getNombreProductoBuscado() {
		return nombreProductoBuscado;
	}

	public static void setNombreProductoBuscado(String nombreProductoBuscado) {
		VariablesGlobales.nombreProductoBuscado = nombreProductoBuscado;
	}

}
