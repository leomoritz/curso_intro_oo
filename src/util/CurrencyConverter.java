package util;

public class CurrencyConverter {

	public static double IOF = 0.06; // Declaração da constante.
	
	public static double dollarToReais(double dollarPrice, double bought) {
		double reais = bought * dollarPrice;
		return reais + (bought * dollarPrice * IOF);
		// return bought * dollarPrice * (1.0 + IOF);
	}

}
