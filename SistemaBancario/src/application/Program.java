package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		// Declarando Locale e o Scanner
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// Lendo dados iniciais da conta
		System.out.printf("Enter account number: ");
		int number = sc.nextInt();
		System.out.printf("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.printf("Is there an initial deposit (y/n) ? ");
		char response = sc.next().charAt(0);
		// Declarando variável account
		Account account;
		// Condicionais para o instanciamento com 2 ou 3 argumentos
		if (response == 'y') {
			System.out.print("Enter initial deposit value: R$ ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}
		// Exibindo toString
		System.out.println();
		System.out.println("Accunt data: ");
		System.out.println(account);
		// Lendo valor de depósito e chamando o método de depósito
		System.out.println();
		System.out.print("Enter a new deposit value: R$ ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		// Exibindo valor atualizado
		System.out.println("Updated account data: ");
		System.out.println(account);
		// Lendo valor de saque e chamando o método de saque
		System.out.println();
		System.out.print("Enter a widthdraw value: R$ ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		// Exibindo valor atualizado
		System.out.println("Updated account data: ");
		System.out.println(account);

	}

}
