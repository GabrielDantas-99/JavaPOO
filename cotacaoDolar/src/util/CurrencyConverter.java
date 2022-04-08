package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double paid(double dolar_price, double be_bought) {
		return dolar_price * be_bought * IOF;
	}
	
}
