package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Salario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Salario salario = new Salario();
		
		System.out.print("Name: ");
		salario.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		salario.GrossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		salario.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + salario);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		salario.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + salario);
		
		sc.close();

	}

}
