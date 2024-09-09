package Figuras;

public class Piramide extends FiguraGeometrica {
	
	private double base; 	//Atributo que identifica la base de una pirámide
	private double altura;	// Atributo que identifica la altura de una pirámide
	private double apotema;	// Atributo que identifica el apotema de una pirámide
	
	
	// Constructor de la clase Pirámide
	public Piramide(double base, double altura, double apotema) {
		this.base = base;
		this.altura = altura;
		this.apotema = apotema;
		this.setVolumen(calcularVolumen()); // Calcula el volumen y establece su atributo 
		this.setSuperficie(calcularSuperficie()); // Calcula la superficie y establece su atributo 
	}
	
	
	// Método para calcular el volumen de una pirámide
	public double calcularVolumen() {
		double volumen = (Math.pow(base, 2.0) * altura) / 3.0;
		return volumen;
	}
	
	// Método para calcular la superficie de una pirámide
	public double calcularSuperficie() {
		double areaBase = Math.pow(base, 2.0);
		double areaLado = 2.0 * base * apotema;
		return areaBase + areaLado;
	}

}