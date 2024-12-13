package classes.chapter8;

public class ConversorMoeda {
	// Valor do dólar na data de 28/11/2024.
	private static double cotacaoDolar = 6.01;
	
	public static void setCotacaoDolar(double cotacaoDolar) {
		cotacaoDolar = cotacaoDolar;
	}
	
	public static double getCotacaoDolar() {
		return cotacaoDolar;
	}
	
	public static double calcularReais(double quantidadeDolar) {
		return quantidadeDolar * 1.06 * cotacaoDolar;
	}
}
