package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;
	
	// Construtor para caso não haja um depósito inicial
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	// Construtor para caso haja um depósito inicial
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	// Apenas obtendo o number da conta, pois ele não pode ser alterado
	public int getNumber() {
		return number;
	}

	// Obtendo o Holder da conta
	public String getHolder() {
		return holder;
	}
	// Alterando o Holder da conta
	public void setHolder(String holder) {
		this.holder = holder;
	}
	// Apenas obtendo o Balance da conta, pois ele só pode ser alterado
	// através de depósito ou saque
	public double getBalance() {
		return balance;
	}
	// Adicionando valor de depósito ao balance
	public void deposit(double amount) {
		balance += amount;
	}
	// Retirando o valor do depósito + taxa do balance
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	// Retornando toString da Classe Account
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: R$ "
				+ String.format("%.2f", balance);
	}

}
