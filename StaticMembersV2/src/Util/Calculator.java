package Util;

public class Calculator {
	
	// Tornando os membros da classe não estáticos: nos obriga a instanciar um objeto na classe main
	public final double PI = 3.14159; 
	
	public double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public double volume(double radius) {
		return 4.0 * PI * radius * radius *radius / 3.0;
	}
	
}
