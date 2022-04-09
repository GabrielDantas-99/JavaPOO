package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter account number: ");
		int number = sc.nextInt();
		System.out.printf("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.printf("Is there an initial deposit (y/n) ? ");
		char response = sc.next().charAt(0);
		
		Account account = new Account(number, holder);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: R$ ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Accunt data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: R$ ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a widthdraw value: R$ ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);

	}

}
