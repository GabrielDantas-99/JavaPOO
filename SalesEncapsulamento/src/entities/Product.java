package entities;

public class Product {

	// Encapsulando os atributos
	private String name;
	private double price;
	private int quantity;
	
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
	
	//> Por conves�o, os m�todos para acessar atributos privados s�o ap�s os construtores
	//     set : altera o valor do atributo(this.atributo) em uma fun��o vazia(void)
	//     get : retorna o atributo (return)
	//> Os construtores, getters e setters podem ser gerados automaticamente usando:
	//     bot�o direito > Source > Generete Getters and setters
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	// Getter e Setter de price
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	// Por quest�o de seguran�a do sistema, n�o usamos o setQuantity
	public int getQuantity() {
		return quantity;
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
