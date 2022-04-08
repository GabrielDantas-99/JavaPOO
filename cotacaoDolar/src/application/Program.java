package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double dolar_price = sc.nextDouble();
		
		System.out.println("How many dolars will be bought? ");
		double dolars_quantity = sc.nextDouble();
		
		double p = CurrencyConverter.paid(dolar_price, dolars_quantity);
		
		
		System.out.printf("Amount to be paid in reais = %.2f", p);

		sc.close();
	}

}
