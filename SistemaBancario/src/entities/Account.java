package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;
	
	// Construtor para caso n�o haja um dep�sito inicial
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	// Construtor para caso haja um dep�sito inicial
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	// Apenas obtendo o number da conta, pois ele n�o pode ser alterado
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
	// Apenas obtendo o Balance da conta, pois ele s� pode ser alterado
	// atrav�s de dep�sito ou saque
	public double getBalance() {
		return balance;
	}
	// Adicionando valor de dep�sito ao balance
	public void deposit(double amount) {
		balance += amount;
	}
	// Retirando o valor do dep�sito + taxa do balance
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
