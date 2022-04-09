package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	// Construtor obriga o programador a informar seus atributos
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// Construtor de sobrecarga que permite 'quantity' iniciar com 0
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		// this.quantity = quantity; Torna-se opcional
	}
		
	// Construtor padrao que pode ser usado
	public Product(){	
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
				+ ", $"
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
