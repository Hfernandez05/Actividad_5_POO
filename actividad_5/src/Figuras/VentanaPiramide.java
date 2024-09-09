package Figuras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPiramide extends JFrame implements ActionListener {
	
	private Container contenedor;
	private JLabel base, altura, apotema, volumen, superficie;
	private JTextField campoBase, campoAltura, campoApotema;
	private JButton calcular;
	
	
	//Constructor de la clase VentanaPirámide
	public VentanaPiramide() {
		inicio();
		setTitle("Pirámide"); // Establece el título de la ventana
		setSize(280,240); // Establece el tamaño de la ventana
		setLocationRelativeTo(null); // La ventana se posiciona en el centro de la pantalla 
		setResizable(false); // Establece que el botón de cerrar permitirá salir de la aplicación 
	}
	
	
	// Método que crea la ventana con sus diferentes componentes gráficos
	private void inicio() {
		
		contenedor = getContentPane();
		contenedor.setLayout(null);
		
		
		// Establece la etiqueta y campo de texto para la base de la pirámide
		base = new JLabel();
		base.setText("Base (cms):");
		base.setBounds(20, 20, 135, 23);	// Establece la posición de la etiqueta de la base de la pirámide
		campoBase = new JTextField();
		campoBase.setBounds(120, 20, 135, 23);	//Establece la posición del campo de texto de la base de la pirámide	
		
		// Establece la etiqueta y campo de texto para la altura de la pirámide
		altura = new JLabel();
		altura.setText("Altura (cms):");
		altura.setBounds(20, 50, 135, 23);	// Establece la posición de la etiqueta de la altura de la pirámide
		campoAltura = new JTextField();
		campoAltura.setBounds(120, 50, 135, 23);	// Establece la posición del campo de texto de la altura de la pirámide
		
		// Establece la etiqueta y campo de texto para el apotema de la pirámide
		apotema = new JLabel();
		apotema.setText("Apotema (cms):");
		apotema.setBounds(20, 80, 135, 23);		// Establece la posición de la etiqueta del apotema de la pirámide
		campoApotema = new JTextField();
		campoApotema.setBounds(120, 80, 135, 23);	// Establece la posición del campo de texto del apotema de la pirámide
		
		
		// Establece el botón para calcular volumen y superficie de la pirámide
		calcular = new JButton();
		calcular.setText("Calcular");
		calcular.setBounds(120, 110, 135, 23);		//Establece la posición del botón calcular 
		calcular.addActionListener(this);		// Agrega al botón un ActionListener para que gestione eventos del botón
		
		// Establece la etiqueta y el valor del volumen de la pirámide
		volumen = new JLabel();
		volumen.setText("Volumen (cm3):");
		volumen.setBounds(20, 140, 135, 23);	// Establece la posición de la etiqueta de volumen de la pirámide
		
		// Establece la etiqueta y el valor de la superficie de la pirámide
		superficie = new JLabel();
		superficie.setText("Superficie (cm2):");
		superficie.setBounds(20, 170, 135, 23);		// Establece la posición de la etiqueta de superficie de la pirámide
		
		
		// Se añade cada componente gráfico al contenedor de la ventana
		contenedor.add(base);
		contenedor.add(campoBase);
		contenedor.add(altura);
		contenedor.add(campoAltura);
		contenedor.add(apotema);
		contenedor.add(campoApotema);
		contenedor.add(calcular);
		contenedor.add(volumen);
		contenedor.add(superficie);
	}

	/**
	* Método que gestiona los eventos generados en la ventana de la
	* esfera throws Exception Excepción al ingresar un campo nulo o
	* error en formato de número*/
	
	public void actionPerformed(ActionEvent event) {
		Piramide pirámide;
		boolean error = false;
		double base = 0;
		double altura = 0;
		double apotema = 0;
		try {
			// Se obtiene y convierte el valor numérico de la base
			base = Double.parseDouble(campoBase.getText());
			// Se obtiene y convierte el valor numérico de la altura
			altura = Double.parseDouble(campoAltura.getText());
			// Se obtiene y convierte el valor numérico del apotema
			apotema = Double.parseDouble(campoApotema.getText());
			// Se crea un objeto Pirámide
			pirámide = new Piramide(base, altura, apotema);
			// Se muestra el volumen
			volumen.setText("Volumen (cm3): " + String.format("%.2f",pirámide.calcularVolumen()));
			// Se muestra la superficie
			superficie.setText("Superficie (cm2): " + String.format("%.2f",pirámide.calcularSuperficie()));
		} catch (Exception e) {
			error = true;
		}finally {
			if (error) { /* Si ocurre una excepción, se muestra un mensaje
				de error */
				JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de número","Error",JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}