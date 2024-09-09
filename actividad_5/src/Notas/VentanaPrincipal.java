package Notas;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaPrincipal extends JFrame  implements ActionListener {
	
	private Container contenedor;	// Un contenedor de elementos gráficos
	private JLabel nota1, nota2, nota3, nota4, nota5, promedio,desviacion, mayor, menor; // Etiquetas estáticas de cada nota
	private JTextField campoNota1, campoNota2, campoNota3,campoNota4, campoNota5; // Campos de ingreso de cada nota
	private JButton calcular, limpiar;  // Botones para realizar cálculos y para borrar las notas

	//constructor de la clase VentanaPrincipal
	public VentanaPrincipal(){
		
		inicio();
		setTitle("Notas");		// Establece el título de la ventana
		setSize(280,380);		// Establece el tamaño de la ventana
		setLocationRelativeTo(null);		// La ventana se posiciona en el centro de la pantalla
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// Establece que el botón de cerrar permitirá salir de la aplicación
		setResizable(false);		// Establece que el tamaño de la ventana no se puede cambiar	
	}

	// metodo que crea la ventana con sus diferentes componentes gráficos
	private void inicio() {  
		
		contenedor = getContentPane();		//  Obtiene el panel de	contenidos de la ventana
		contenedor.setLayout(null);		// Establece que el contenedor no tiene un layout
		
		// Establece la etiqueta y el campo de texto de la nota 1
		nota1 = new JLabel();
		nota1.setText("Nota 1:");
		nota1.setBounds(20, 20, 135, 23);		//Establece la posición de la	etiqueta nota 1 
		campoNota1 = new JTextField();
		campoNota1.setBounds(105, 20, 135, 23);		// Establece la posición del campo de texto de la nota 1
		
		// Establece la etiqueta y el campo de texto de la nota 2
		nota2 = new JLabel();
		nota2.setText("Nota 2:");
		nota2.setBounds(20, 50, 135, 23);		// Establece la posición de la etiqueta nota 2 
		campoNota2 = new JTextField();
		campoNota2.setBounds(105, 50, 135, 23);		// Establece la posición del campo de texto de la nota 2
		
		// Establece la etiqueta y el campo de texto de la nota 3
		nota3 = new JLabel();
		nota3.setText("Nota 3:");
		nota3.setBounds(20, 80, 135, 23);		// Establece la posición de la etiqueta nota 3
		campoNota3 = new JTextField();
		campoNota3.setBounds(105, 80, 135, 23);		// Establece la posición del campo de texto de la nota 3
		
		// Establece la etiqueta y el campo de texto de la nota 4
		nota4 = new JLabel();
		nota4.setText("Nota 4:");
		nota4.setBounds(20, 110, 135, 23);		// Establece la posición de la etiqueta nota 4
		campoNota4 = new JTextField();
		campoNota4.setBounds(105, 110, 135, 23);		// Establece la posición del campo de texto de la nota 4
		
		// Establece la etiqueta y el campo de texto de la nota 5
		nota5 = new JLabel();
		nota5.setText("Nota 5:");
		nota5.setBounds(20, 140, 135, 23);		// Establece la posición de la etiqueta nota 5
		campoNota5 = new JTextField();
		campoNota5.setBounds(105, 140, 135, 23);		// Establece la posición del campo de texto de la nota 5
		
	
		// Establece el botón Calcular
		calcular = new JButton();
		calcular.setText("Calcular");
		calcular.setBounds(20, 170, 100, 23);		// Establece la posición del botón Calcular
		calcular.addActionListener(this);		// Agrega al botón un ActionListener para que gestione eventos del botón
		// Establece el botón Limpiar
		limpiar = new JButton();
		limpiar.setText("Limpiar");
		limpiar.setBounds(125, 170, 80, 23);		// Establece la posición del botón Limpiar
		limpiar.addActionListener(this);		// Agrega al botón un ActionListener para que gestione eventos del botón

		
		// Establece la etiqueta del promedio con su valor numérico
		promedio = new JLabel();
		promedio.setText("Promedio = ");
		promedio.setBounds(20, 210, 135, 23);		// Establece la posición de la etiqueta promedio
		
		// Establece la etiqueta de la desviación con su valor numérico
		desviacion = new JLabel();
		desviacion.setText("Desviación = ");
		desviacion.setBounds(20, 240, 200, 23);		// Establece la posición de la etiqueta desviación
		
		// Establece la etiqueta de la nota mayor con su valor numérico
		mayor = new JLabel();
		mayor.setText("Nota mayor = ");
		mayor.setBounds(20, 270, 120, 23);		// Establece la posición de la etiqueta nota mayor
		
		// Establece la etiqueta de la nota menor con su valor numérico
		menor = new JLabel();
		menor.setText("Nota menor = ");
		menor.setBounds(20, 300, 120, 23);		// Establece la posición dela etiquete nota menor
		
		
		// Se añade cada componente gráfico al contenedor de la ventana
		contenedor.add(nota1);
		contenedor.add(campoNota1);
		contenedor.add(nota2);
		contenedor.add(campoNota2);
		contenedor.add(nota3);
		contenedor.add(campoNota3);
		contenedor.add(nota4);
		contenedor.add(campoNota4);
		contenedor.add(nota5);
		contenedor.add(campoNota5);
		contenedor.add(calcular);
		contenedor.add(limpiar);
		contenedor.add(promedio);
		contenedor.add(desviacion);
		contenedor.add(mayor);
		contenedor.add(menor);
	}
	
	
	public void actionPerformed(ActionEvent evento) {		// Método que gestiona los eventos generados en la ventana principal
		
		if (evento.getSource() == calcular) {		// Si se pulsa el botón Calcular
			
			Notas notas = new Notas();		// Se crea un objeto Notas
			notas.listaNotas[0] = Double.parseDouble(campoNota1.getText());		// Se obtiene y convierte el valor numérico de la nota 1
			// así sucecivamente con el resto de notas
			notas.listaNotas[1] = Double.parseDouble(campoNota2.getText());
			notas.listaNotas[2] = Double.parseDouble(campoNota3.getText());
			notas.listaNotas[3] = Double.parseDouble(campoNota4.getText());
			notas.listaNotas[4] = Double.parseDouble(campoNota5.getText());
			
			notas.calcularPromedio(); // Se calcula el promedio
			notas.calcularDesviacion(); // Se calcula la desviación
			
			// Se muestra el promedio formateado
			promedio.setText("Promedio = " + String.valueOf(String.format("%.2f",notas.calcularPromedio())));
			
			double desv = notas.calcularDesviacion();
			// Se muestra la desviación formateada
			desviacion.setText("Desviación estándar = " + String.format("%.2f",desv));
			
			// Se muestra el valor mayor formateado
			mayor.setText("Valor mayor = " + String.valueOf(notas.calcularMayor()));
			
			// Se muestra el valor menor formateado
			menor.setText("Valor menor = " + String.valueOf(notas.calcularMenor()));
			
		}
		
		// Se se pulsa el botón Limpiar se dejan en blanco los campos de notas 
		if (evento.getSource() == limpiar) {
			campoNota1.setText("");
			campoNota2.setText("");
			campoNota3.setText("");
			campoNota4.setText("");
			campoNota5.setText("");
		}
		
	}
		
		
}
	

