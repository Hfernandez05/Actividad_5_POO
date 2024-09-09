package Notas;

public class Notas {
	
	double[] listaNotas; // Atributo que identifica un array de notas de tipo double 
	
	public Notas() {	//constructor de la clase notas
		listaNotas = new double[5]; 
	}
	
	
	double calcularPromedio() { //metodo para calcular el promedio de las notas ingresadas
		
		double suma = 0;
		for(int i=1; i < listaNotas.length; i++) { 	// Se recorre el array	
			
			suma = suma + listaNotas[i]; 			// Suma las notas del array
		}
		
		return (suma / listaNotas.length);
	}
	

	double calcularDesviacion() {		// metodo que calcula la desviación estándar del array de notas
		
		double prom = calcularPromedio();  // Invoca el método para calcular el promedio 
		
		double suma = 0;

		for(int i=0; i < listaNotas.length; i++) {
		
			suma += Math.pow(listaNotas[i] - prom, 2 ); 	// Aplica fórmula para la sumatoria de elementos
		}
		return Math.sqrt (suma/listaNotas.length ); // Retorna el cálculo final de la desviación 
	}
	
	
	double calcularMenor() {		// metodo que calcula el valor menor del array de notas
		
		double menor = listaNotas[0];
		for(int i=0; i < listaNotas.length; i++) { // Se recorre el array
			if (listaNotas[i] < menor) {
			
			menor = listaNotas[i];  //Si un elemento del array es menor que el menor actual, se actualiza su valor
			}
		}
		return menor;
	}
	
	
	double calcularMayor() {		// metodo que calcula el valor mayor del array de notas
		
		double mayor = listaNotas[0]; //Define una variable como la nota mayor
		
		for(int i=0; i < listaNotas.length; i++) { 	//recorre el array
			
			if (listaNotas[i] > mayor) {  
				
				mayor = listaNotas[i];   // Si un elemento del array es mayor que el mayor actual, se actualiza su valo
			}
		}
		return mayor;
	}
	
}
		

